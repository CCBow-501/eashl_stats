package de.roed.eashl.core.camel;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class EashlRoutes extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("direct:getTeamInforamtion")
			.process(new Processor() {

				@Override
				public void process(Exchange exchange) throws Exception {
					String name = exchange.getIn().getHeader("name", String.class);
					exchange.getIn().setHeader(Exchange.HTTP_URI, "https://www.easports.com/iframe/nhl14proclubs/api/platforms/ps4/clubs/"+name);
				}
			})
			.log("we are in the TeamInformationRoute route route") //
			.setHeader(Exchange.HTTP_METHOD, constant("GET"))//

			.to("https://www.easports.com/iframe/nhl14proclubs/api/platforms/ps4/clubs/")
			.routeId("TeamInformationRoute");

	}

}
