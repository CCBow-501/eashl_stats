package de.roed.eashl.web.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class TeamStatistic implements Serializable {

	private static final long serialVersionUID = 1L;

	private int rank;
	private String clubname;
	private int wins;
	private int losses;
	private int otl;
	private int dnf;
	private int winnerByDnf;
	private int winnerByGoalieDnf;
	private int gf;
	private int ga;
	private int gfraw;
	private int garaw;
	private int hits;
	private int shots;
	private int shotsa;
	private int pims;
	private int wstreak;
	private int lstreak;
	private int ppg;
	private int ppo;
	private int shg;
	private int ppga;
	private int tsh;
	private int shga;
	private int toa;
	private int faceoffswon;
	private int faceoffslost;
	private int brkgaols;
	private int brkchances;
	private int onetimergoals;
	private int onetimerchances;
	private int passcomp;
	private int passatt;
	private int psgoals;
	private int pschances;
	private int blkshots;
	private int so;
	private int wingf;
	private int lossgf;
	private int lossga;
	private int gp;
	private int gamesCompleted;
	private int dnfPercent;
	private int gdiff;
	private int agf;
	private int aga;
	private int atoa;
	private int winmar;
	private int lossmar;
	private int hitspg;
	private int shotspg;
	private int shotperc;
	private int shotsapg;
	private int fop;
	private int pim;
	private int pimpg;
	private int papg;
	private int paperc;
	private int brkperc;
	private int onetimerperc;
	private int ppperc;
	private int pkperc;
	private int streak;
	private int record;
	private int gchumangoalie;
	private int winshumangoalie;
	private int winsblowout;
	private int gcperfectpk;
	private int gctwoga;
	private int gconega;
	private int gcmaxtwoga;
	private int gcmaxonega;
	private int gamesCompletedFC;
	private int winsFC;
	private int requestdate;
	private int senderid;
	private int clubregion;
	private int mmr;
	private int previousMmr;
	private int mmr_a;
	private int previousMmr_a;
	private int mmr_b;
	private int previousMmr_b;
	private int mmrGamesPlayed;
	private int mmrWins;
	private int clubId;
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getClubname() {
		return clubname;
	}
	public void setClubname(String clubname) {
		this.clubname = clubname;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	public int getLosses() {
		return losses;
	}
	public void setLosses(int losses) {
		this.losses = losses;
	}
	public int getOtl() {
		return otl;
	}
	public void setOtl(int otl) {
		this.otl = otl;
	}
	public int getDnf() {
		return dnf;
	}
	public void setDnf(int dnf) {
		this.dnf = dnf;
	}
	public int getWinnerByDnf() {
		return winnerByDnf;
	}
	public void setWinnerByDnf(int winnerByDnf) {
		this.winnerByDnf = winnerByDnf;
	}
	public int getWinnerByGoalieDnf() {
		return winnerByGoalieDnf;
	}
	public void setWinnerByGoalieDnf(int winnerByGoalieDnf) {
		this.winnerByGoalieDnf = winnerByGoalieDnf;
	}
	public int getGf() {
		return gf;
	}
	public void setGf(int gf) {
		this.gf = gf;
	}
	public int getGa() {
		return ga;
	}
	public void setGa(int ga) {
		this.ga = ga;
	}
	public int getGfraw() {
		return gfraw;
	}
	public void setGfraw(int gfraw) {
		this.gfraw = gfraw;
	}
	public int getGaraw() {
		return garaw;
	}
	public void setGaraw(int garaw) {
		this.garaw = garaw;
	}
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public int getShots() {
		return shots;
	}
	public void setShots(int shots) {
		this.shots = shots;
	}
	public int getShotsa() {
		return shotsa;
	}
	public void setShotsa(int shotsa) {
		this.shotsa = shotsa;
	}
	public int getPims() {
		return pims;
	}
	public void setPims(int pims) {
		this.pims = pims;
	}
	public int getWstreak() {
		return wstreak;
	}
	public void setWstreak(int wstreak) {
		this.wstreak = wstreak;
	}
	public int getLstreak() {
		return lstreak;
	}
	public void setLstreak(int lstreak) {
		this.lstreak = lstreak;
	}
	public int getPpg() {
		return ppg;
	}
	public void setPpg(int ppg) {
		this.ppg = ppg;
	}
	public int getPpo() {
		return ppo;
	}
	public void setPpo(int ppo) {
		this.ppo = ppo;
	}
	public int getShg() {
		return shg;
	}
	public void setShg(int shg) {
		this.shg = shg;
	}
	public int getPpga() {
		return ppga;
	}
	public void setPpga(int ppga) {
		this.ppga = ppga;
	}
	public int getTsh() {
		return tsh;
	}
	public void setTsh(int tsh) {
		this.tsh = tsh;
	}
	public int getShga() {
		return shga;
	}
	public void setShga(int shga) {
		this.shga = shga;
	}
	public int getToa() {
		return toa;
	}
	public void setToa(int toa) {
		this.toa = toa;
	}
	public int getFaceoffswon() {
		return faceoffswon;
	}
	public void setFaceoffswon(int faceoffswon) {
		this.faceoffswon = faceoffswon;
	}
	public int getFaceoffslost() {
		return faceoffslost;
	}
	public void setFaceoffslost(int faceoffslost) {
		this.faceoffslost = faceoffslost;
	}
	public int getBrkgaols() {
		return brkgaols;
	}
	public void setBrkgaols(int brkgaols) {
		this.brkgaols = brkgaols;
	}
	public int getBrkchances() {
		return brkchances;
	}
	public void setBrkchances(int brkchances) {
		this.brkchances = brkchances;
	}
	public int getOnetimergoals() {
		return onetimergoals;
	}
	public void setOnetimergoals(int onetimergoals) {
		this.onetimergoals = onetimergoals;
	}
	public int getOnetimerchances() {
		return onetimerchances;
	}
	public void setOnetimerchances(int onetimerchances) {
		this.onetimerchances = onetimerchances;
	}
	public int getPasscomp() {
		return passcomp;
	}
	public void setPasscomp(int passcomp) {
		this.passcomp = passcomp;
	}
	public int getPassatt() {
		return passatt;
	}
	public void setPassatt(int passatt) {
		this.passatt = passatt;
	}
	public int getPsgoals() {
		return psgoals;
	}
	public void setPsgoals(int psgoals) {
		this.psgoals = psgoals;
	}
	public int getPschances() {
		return pschances;
	}
	public void setPschances(int pschances) {
		this.pschances = pschances;
	}
	public int getBlkshots() {
		return blkshots;
	}
	public void setBlkshots(int blkshots) {
		this.blkshots = blkshots;
	}
	public int getSo() {
		return so;
	}
	public void setSo(int so) {
		this.so = so;
	}
	public int getWingf() {
		return wingf;
	}
	public void setWingf(int wingf) {
		this.wingf = wingf;
	}
	public int getLossgf() {
		return lossgf;
	}
	public void setLossgf(int lossgf) {
		this.lossgf = lossgf;
	}
	public int getLossga() {
		return lossga;
	}
	public void setLossga(int lossga) {
		this.lossga = lossga;
	}
	public int getGp() {
		return gp;
	}
	public void setGp(int gp) {
		this.gp = gp;
	}
	public int getGamesCompleted() {
		return gamesCompleted;
	}
	public void setGamesCompleted(int gamesCompleted) {
		this.gamesCompleted = gamesCompleted;
	}
	public int getDnfPercent() {
		return dnfPercent;
	}
	public void setDnfPercent(int dnfPercent) {
		this.dnfPercent = dnfPercent;
	}
	public int getGdiff() {
		return gdiff;
	}
	public void setGdiff(int gdiff) {
		this.gdiff = gdiff;
	}
	public int getAgf() {
		return agf;
	}
	public void setAgf(int agf) {
		this.agf = agf;
	}
	public int getAga() {
		return aga;
	}
	public void setAga(int aga) {
		this.aga = aga;
	}
	public int getAtoa() {
		return atoa;
	}
	public void setAtoa(int atoa) {
		this.atoa = atoa;
	}
	public int getWinmar() {
		return winmar;
	}
	public void setWinmar(int winmar) {
		this.winmar = winmar;
	}
	public int getLossmar() {
		return lossmar;
	}
	public void setLossmar(int lossmar) {
		this.lossmar = lossmar;
	}
	public int getHitspg() {
		return hitspg;
	}
	public void setHitspg(int hitspg) {
		this.hitspg = hitspg;
	}
	public int getShotspg() {
		return shotspg;
	}
	public void setShotspg(int shotspg) {
		this.shotspg = shotspg;
	}
	public int getShotperc() {
		return shotperc;
	}
	public void setShotperc(int shotperc) {
		this.shotperc = shotperc;
	}
	public int getShotsapg() {
		return shotsapg;
	}
	public void setShotsapg(int shotsapg) {
		this.shotsapg = shotsapg;
	}
	public int getFop() {
		return fop;
	}
	public void setFop(int fop) {
		this.fop = fop;
	}
	public int getPim() {
		return pim;
	}
	public void setPim(int pim) {
		this.pim = pim;
	}
	public int getPimpg() {
		return pimpg;
	}
	public void setPimpg(int pimpg) {
		this.pimpg = pimpg;
	}
	public int getPapg() {
		return papg;
	}
	public void setPapg(int papg) {
		this.papg = papg;
	}
	public int getPaperc() {
		return paperc;
	}
	public void setPaperc(int paperc) {
		this.paperc = paperc;
	}
	public int getBrkperc() {
		return brkperc;
	}
	public void setBrkperc(int brkperc) {
		this.brkperc = brkperc;
	}
	public int getOnetimerperc() {
		return onetimerperc;
	}
	public void setOnetimerperc(int onetimerperc) {
		this.onetimerperc = onetimerperc;
	}
	public int getPpperc() {
		return ppperc;
	}
	public void setPpperc(int ppperc) {
		this.ppperc = ppperc;
	}
	public int getPkperc() {
		return pkperc;
	}
	public void setPkperc(int pkperc) {
		this.pkperc = pkperc;
	}
	public int getStreak() {
		return streak;
	}
	public void setStreak(int streak) {
		this.streak = streak;
	}
	public int getRecord() {
		return record;
	}
	public void setRecord(int record) {
		this.record = record;
	}
	public int getGchumangoalie() {
		return gchumangoalie;
	}
	public void setGchumangoalie(int gchumangoalie) {
		this.gchumangoalie = gchumangoalie;
	}
	public int getWinshumangoalie() {
		return winshumangoalie;
	}
	public void setWinshumangoalie(int winshumangoalie) {
		this.winshumangoalie = winshumangoalie;
	}
	public int getWinsblowout() {
		return winsblowout;
	}
	public void setWinsblowout(int winsblowout) {
		this.winsblowout = winsblowout;
	}
	public int getGcperfectpk() {
		return gcperfectpk;
	}
	public void setGcperfectpk(int gcperfectpk) {
		this.gcperfectpk = gcperfectpk;
	}
	public int getGctwoga() {
		return gctwoga;
	}
	public void setGctwoga(int gctwoga) {
		this.gctwoga = gctwoga;
	}
	public int getGconega() {
		return gconega;
	}
	public void setGconega(int gconega) {
		this.gconega = gconega;
	}
	public int getGcmaxtwoga() {
		return gcmaxtwoga;
	}
	public void setGcmaxtwoga(int gcmaxtwoga) {
		this.gcmaxtwoga = gcmaxtwoga;
	}
	public int getGcmaxonega() {
		return gcmaxonega;
	}
	public void setGcmaxonega(int gcmaxonega) {
		this.gcmaxonega = gcmaxonega;
	}
	public int getGamesCompletedFC() {
		return gamesCompletedFC;
	}
	public void setGamesCompletedFC(int gamesCompletedFC) {
		this.gamesCompletedFC = gamesCompletedFC;
	}
	public int getWinsFC() {
		return winsFC;
	}
	public void setWinsFC(int winsFC) {
		this.winsFC = winsFC;
	}
	public int getRequestdate() {
		return requestdate;
	}
	public void setRequestdate(int requestdate) {
		this.requestdate = requestdate;
	}
	public int getSenderid() {
		return senderid;
	}
	public void setSenderid(int senderid) {
		this.senderid = senderid;
	}
	public int getClubregion() {
		return clubregion;
	}
	public void setClubregion(int clubregion) {
		this.clubregion = clubregion;
	}
	public int getMmr() {
		return mmr;
	}
	public void setMmr(int mmr) {
		this.mmr = mmr;
	}
	public int getPreviousMmr() {
		return previousMmr;
	}
	public void setPreviousMmr(int previousMmr) {
		this.previousMmr = previousMmr;
	}
	public int getMmr_a() {
		return mmr_a;
	}
	public void setMmr_a(int mmr_a) {
		this.mmr_a = mmr_a;
	}
	public int getPreviousMmr_a() {
		return previousMmr_a;
	}
	public void setPreviousMmr_a(int previousMmr_a) {
		this.previousMmr_a = previousMmr_a;
	}
	public int getMmr_b() {
		return mmr_b;
	}
	public void setMmr_b(int mmr_b) {
		this.mmr_b = mmr_b;
	}
	public int getPreviousMmr_b() {
		return previousMmr_b;
	}
	public void setPreviousMmr_b(int previousMmr_b) {
		this.previousMmr_b = previousMmr_b;
	}
	public int getMmrGamesPlayed() {
		return mmrGamesPlayed;
	}
	public void setMmrGamesPlayed(int mmrGamesPlayed) {
		this.mmrGamesPlayed = mmrGamesPlayed;
	}
	public int getMmrWins() {
		return mmrWins;
	}
	public void setMmrWins(int mmrWins) {
		this.mmrWins = mmrWins;
	}
	public int getClubId() {
		return clubId;
	}
	public void setClubId(int clubId) {
		this.clubId = clubId;
	}
}
