package me.gann.ranking.team;


import me.gann.ranking.constants.CollegeFootballTeam;
import me.gann.ranking.team.Team;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * User: Brent Gann
 * Date: 3/29/14
 * Time: 11:31 PM
 * File: TeamStats.java
 *
 * Holds the yearly stats for every team since 1940 in the NFL. It also holds the normalize values for yards,
 * points, and turnovers for each year based on the maximum average of that year.
 */

public class TeamMap {

    /**
     * Holds each team based on year and their name. Nested HashMap that keys first on the year, and then
     * on the team name, to return the {@link me.gann.ranking.team.Team} object.
     */
    private static HashMap<Integer, HashMap<CollegeFootballTeam, Team>> teamMap = null;

    /**
     * Gets the {@link Team} for a year and the Team's location
     *
     * @param year - year to lookup the {@link Team} by
     * @param location - location of the {@link Team}
     * @return {@link Team} requested
     */
    public static Team getTeamForYearAndName(int year, String location){

        if(CollegeFootballTeam.getTeamByLocation(location) == CollegeFootballTeam.OTHER){
            //System.out.println("Bypassing storage for: " + location);
            return new Team();
        }

        if(teamMap == null) {
            teamMap = new HashMap<>();
        }
        if(teamMap.get(year) == null){
            teamMap.put(year, new HashMap<CollegeFootballTeam, Team>());
        }
        if(teamMap.get(year).get(CollegeFootballTeam.getTeamByLocation(location)) == null){
            teamMap.get(year).put(CollegeFootballTeam.getTeamByLocation(location), new Team());
        }

        return teamMap.get(year).get(CollegeFootballTeam.getTeamByLocation(location));

    }

    /**
     * Gets the full teamMap for a given year that stores from name to {@link Team}
     *
     * @param year - year to return
     * @return - {@link HashMap} storing the teamName to the {@link Team}
     */
    public static HashMap<CollegeFootballTeam, Team> getTeamMapForYear(int year){
        if(teamMap == null) {
            teamMap = new HashMap<>();
        }
        return teamMap.get(year);
    }

    public static Set<Integer> getYears(){
        return teamMap.keySet();
    }

}
