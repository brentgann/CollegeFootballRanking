package me.gann.ranking.team;

import me.gann.ranking.constants.CollegeFootballTeam;
import me.gann.ranking.constants.GameSite;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Brent Gann
 *
 * Each individual Team is stored in this object as separated by year. Stores entire season in this object.
 */
public class Team {

    /**
     * Name of the team stored as "Location Nickname"
     */
    private String name;
    /**
     * Wins for the team over the season
     */
    private int wins;
    /**
     * Losses for the team over the season
     */
    private int losses;
    /**
     * Offensive points scored for the team over the season
     */
    private int points;
    /**
     * Defensive points allowed over the season
     */
    private int pointsAllowed;
    /**
     * Total games played by team in season
     */
    private int gamesPlayed;
    /**
     * Calculated algorithm for team per the {@link me.gann.ranking.algorithm.RankingAlgorithm}
     */
    private double ranking;
    /**
     * A {@link List} of all opponents and the result as a {@link Boolean} if they won
     */
    private List<Game> games;

    /**
     * Constructor for {@link Team} that defaults all values to 0 and the opponentAndResults {@link List} as an empty
     * {@link ArrayList}
     */
    public Team(){
        games = new ArrayList<>();
        ranking = 0;
        wins = 0;
        losses = 0;
        pointsAllowed = 0;
        points = 0;
        gamesPlayed = 0;
    }



    /**
     * Adds all parameters to the existing values in the team object called on for a single game.
     *
     * @param name - name to be set if not already set
     * @param points - points gained
     * @param pointsAllowed - points allowed
     * @param opponent - name of opponent
     * @return true if name is the same as object called on, false otherwise
     */
    public boolean addAll(String name, int points, String opponent, int pointsAllowed, GameSite home) {

        this.name = name;

        if(points > pointsAllowed)
            ++this.wins;
        else if(points < pointsAllowed)
            ++this.losses;
        this.points = this.points + points;
        this.pointsAllowed = this.pointsAllowed + pointsAllowed;
        ++gamesPlayed;
        games.add(new Game(CollegeFootballTeam.getTeamByLocation(name), CollegeFootballTeam.getTeamByLocation(opponent),
                points, pointsAllowed, home));

        return name.equalsIgnoreCase(this.name);
    }

    /**
     * Gets the team name
     *
     * @return team name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets a teams wins for season
     *
     * @return teams wins
     */
    public int getWins() {
        return wins;
    }

    /**
     * Gets a teams seasons offensive points
     *
     * @return teams total offensive points
     */
    public int getPoints() {
        return points;
    }

    /**
     * Gets a teams seasons defensive points allowed
     *
     * @return teams total defensive points allowed
     */
    public int getPointsAllowed() {
        return pointsAllowed;
    }

    /**
     * Gets a teams games played in season
     *
     * @return teams total games played
     */
    public int getGamesPlayed() {
        return gamesPlayed;
    }

    /**
     * Gets a teams algorithm
     *
     * @return algorithm of team
     */
    public double getRanking() {
        return ranking;
    }

    /**
     * Sets the team algorithm
     *
     * @param ranking - value between 1 and 0 for the teams algorithm
     */
    public void setRanking(double ranking) {
        this.ranking = ranking;
    }

    /**
     * Gets the list of opponents and the results from those games
     *
     * @return {@link List} of opponents and results as {@link Boolean} wins
     */
    public List<Game> getGames() {
        return games;
    }

    /**
     * {@inheritDoc}
     *
     * @return String representaion of Team
     */
    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", wins=" + wins +
                ", losses=" + losses +
                ", points=" + points +
                ", pointsAllowed=" + pointsAllowed +
                ", gamesPlayed=" + gamesPlayed +
                ", algorithm=" + ranking +
                ", games=" + games +
                '}';
    }
}
