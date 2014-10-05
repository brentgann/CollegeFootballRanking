package me.gann.ranking.team;

import me.gann.ranking.constants.CollegeFootballTeam;
import me.gann.ranking.constants.GameSite;

import java.util.Date;

/**
 * Created by BGann on 8/23/14.
 */
public class Game {

    public Date date;
    public CollegeFootballTeam team;
    public CollegeFootballTeam opponent;
    public int teamScore;
    public int opponentScore;
    public GameSite site;

    public Game(CollegeFootballTeam team, CollegeFootballTeam opponent, int teamScore, int opponentScore, GameSite home, Date date) {
        this.team = team;
        this.opponent = opponent;
        this.teamScore = teamScore;
        this.opponentScore = opponentScore;
        this.site = home;
    }

    public CollegeFootballTeam getTeam() {
        return team;
    }

    public void setTeam(CollegeFootballTeam team) {
        this.team = team;
    }

    public CollegeFootballTeam getOpponent() {
        return opponent;
    }

    public void setOpponent(CollegeFootballTeam opponent) {
        this.opponent = opponent;
    }

    public int getTeamScore() {
        return teamScore;
    }

    public void setTeamScore(int teamScore) {
        this.teamScore = teamScore;
    }

    public int getOpponentScore() {
        return opponentScore;
    }

    public void setOpponentScore(int opponentScore) {
        this.opponentScore = opponentScore;
    }

    public GameSite getSite() {
        return site;
    }

    public void setSite(GameSite site) {
        this.site = site;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
