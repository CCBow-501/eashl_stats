package de.roed.eashl.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import de.roed.eashl.web.model.Team;
import de.roed.eashl.web.model.TeamStatistic;

@RestController
@RequestMapping(value = "/team/v1")
public class TeamController {

	@Autowired
	private CamelContext camelContext;

	private static final Logger log = LoggerFactory.getLogger(TeamController.class);

	@RequestMapping(path="{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Team> getTeamInformation(@PathVariable("name") String name) {
		ProducerTemplate template = camelContext.createProducerTemplate();

		Map<String, Object> headerMap = new HashMap<String, Object>();
		headerMap.put("name", name);

		String body = template.requestBodyAndHeaders("direct:getTeamInforamtion", null, headerMap, String.class);
		Gson gson = new Gson();
		List<Team> teamList = new ArrayList<Team>();
		if (body != null && !body.equals("")) {
			JsonObject jsonObject = gson.fromJson(body, JsonObject.class);
			JsonArray jsonArray = (JsonArray) jsonObject.get("raw");
			log.debug("body = " + jsonArray.toString());

			teamList = gson.fromJson(jsonArray, new TypeToken<List<Team>>() {
			}.getType());

		}
		return teamList;
	}


	@RequestMapping(path="stats/{clubId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public TeamStatistic getTeamStats(@PathVariable("clubId") String name) {
		ProducerTemplate template = camelContext.createProducerTemplate();

		Map<String, Object> headerMap = new HashMap<String, Object>();
		headerMap.put("clubId", name);

		String body = template.requestBodyAndHeaders("direct:getTeamStats", null, headerMap, String.class);
		log.debug(body);
		Gson gson = new Gson();
		TeamStatistic teamStats = null;
		if (body != null && !body.equals("")) {
			JsonObject jsonObject = gson.fromJson(body, JsonObject.class);
//			JsonArray jsonArray = (JsonArray) jsonObject.get("raw");
			log.debug("body = " + jsonObject.toString());


		}
		return teamStats;
	}

}
