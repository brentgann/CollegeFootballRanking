package me.gann.ranking;

import me.gann.ranking.algorithm.RankingAlgorithm;
import me.gann.ranking.exception.CsvFormatingException;
import me.gann.ranking.io.CsvInput;
import me.gann.ranking.team.Team;
import me.gann.ranking.team.TeamMap;

import java.io.IOException;
import java.text.ParseException;

/**
 * User: Brent Gann
 *
 * Main Command Line Interface for CFRS program
 */
public class UserInterface {

    /**
     * Holds the current year for the UI
     */
    public static int year = 2014;

    /**
     * Main function
     *
     * @param args all arguments are ignored
     */
    public static void main(String args[]) throws IOException, CsvFormatingException, ParseException {

        System.out.println("Ranking teams for the year " + year);

        CsvInput.readInHistoricBoxScoresAndCreateFiles("./NCAAD1_2014.csv");

        RankingAlgorithm.rankTeams(2014);

        System.out.println(RankingAlgorithm.getRanking());

    }



}
