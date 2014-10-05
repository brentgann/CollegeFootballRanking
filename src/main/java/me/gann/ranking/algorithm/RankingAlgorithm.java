package me.gann.ranking.algorithm;

import me.gann.ranking.team.Game;
import me.gann.ranking.team.TeamMap;
import me.gann.ranking.constants.CollegeFootballTeam;
import me.gann.ranking.team.Team;

import java.util.*;

/**
 * User: Brent Gann
 *
 * An algorithm to generate algorithm for each team based on who they played against and their results. Takes into
 * account the win/losses and strength of schedule.
 */
public class RankingAlgorithm {


    private static final int maxIterations = 1000000;
    private static int iterations = 0;
    private static boolean exitFlag = false;

    private static HashMap<CollegeFootballTeam, Double> rankingValues = new HashMap<>();
    private static List<CollegeFootballTeam> ranking = new ArrayList<>();

    /**
     * Ranks the teams in a given year
     *
     * @param year - the year to rank teams for
     */
    public static void rankTeams(int year){

        if(year == 0){
            return;
        }

        HashMap<CollegeFootballTeam, Team> teamMap = TeamMap.getTeamMapForYear(year);

        if(teamMap == null || teamMap.keySet().isEmpty()){
            return;
        }

        Set<CollegeFootballTeam> teams = teamMap.keySet();

        for(CollegeFootballTeam team : teams){
            rankingValues.put(team, 1.0);
        }

        rankingValues.put(CollegeFootballTeam.OTHER, 0.0);

        double highestRank, lowestRank;

        while(iterations < maxIterations && !exitFlag){
            highestRank = lowestRank = 0;
            HashMap<CollegeFootballTeam, Double> tempRankingValues = new HashMap<>(rankingValues);
            for(CollegeFootballTeam team : teams){
                for(Game game : teamMap.get(team).getGames()){
                    try {
                        if (teams.contains(game.getTeam())) {

                            if (game.getTeamScore() > game.getOpponentScore()) {
                                tempRankingValues.put(team, tempRankingValues.get(team) + rankingValues.get(game.getOpponent()));
                            } else if (game.getTeamScore() < game.getOpponentScore()) {
                                tempRankingValues.put(team, tempRankingValues.get(team) - (1.0 - rankingValues.get(game.getOpponent())));
                            }
                        } else {
                            tempRankingValues.put(team, 0.);
                        }
                    } catch ( Exception e ) {
                        System.out.println("Problem calculating game " + game.getTeam().getNickname() + " vs " + game.getOpponent().getNickname());
                    }
                }
                if(tempRankingValues.get(team) >= highestRank){
                    highestRank = tempRankingValues.get(team);
                }
                if(tempRankingValues.get(team) <= lowestRank){
                    lowestRank = tempRankingValues.get(team);
                }
            }

            highestRank = highestRank + Math.abs(lowestRank); // accounts for negative values

            for(CollegeFootballTeam team : teams){
                tempRankingValues.put(team, tempRankingValues.get(team) + Math.abs(lowestRank)); // value will be skewed to {0-1}
                rankingValues.put(team, (tempRankingValues.get(team) / highestRank));
            }

            ++iterations;
//            System.out.println(iterations);
        }

        for(CollegeFootballTeam team : teams){
            if(ranking.size() == 0){
                ranking.add(team);
                continue;
            }
            for(int i=0; i<=ranking.size(); ++i){
                if(i == (ranking.size())) {
                    ranking.add(team);
                    break;
                }
                if(rankingValues.get(team) < rankingValues.get(ranking.get(i))){
                    ranking.add(i, team);
                    break;
                }
            }
        }

        for(CollegeFootballTeam team : teams){
            teamMap.get(team).setRanking(rankingValues.get(team));
        }


    }

    public static int getIterations() {
        return iterations;
    }

    public static boolean isExitFlag() {
        return exitFlag;
    }

    public static HashMap<CollegeFootballTeam, Double> getRankingValues() {
        return rankingValues;
    }

    public static List<CollegeFootballTeam> getRanking() {
        return ranking;
    }
}
