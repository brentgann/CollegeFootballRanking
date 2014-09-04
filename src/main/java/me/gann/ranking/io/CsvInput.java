package me.gann.ranking.io;

import au.com.bytecode.opencsv.CSVReader;
import me.gann.ranking.algorithm.RankingAlgorithm;
import me.gann.ranking.constants.CollegeFootballTeam;
import me.gann.ranking.constants.GameSite;
import me.gann.ranking.exception.CsvFormatingException;
import me.gann.ranking.team.Team;
import me.gann.ranking.team.TeamMap;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * User: Brent Gann
 *
 * This class handles the CsvInput.java
 */
public class CsvInput {

    /**
     * Takes in a csv file of the historic box score and creates the files necessary for the system to run <br />
     * Takes the entries in the csv and passes them to readBoxScoreIn(entries)
     *
     * @param filename - filename (relative or absolute pathing) of the csv
     * @throws IOException - if there is a problem with the IO formatting
     * @throws CsvFormatingException - If the CSV is formatted incorrectly
     */
    public static void readInHistoricBoxScoresAndCreateFiles(String filename) throws IOException,
            CsvFormatingException, ParseException {
        List<String[]> myEntries;

        myEntries = readCSVtoListStringArray(filename);
        readBoxScoreIn(myEntries);
    }

    /**
     * Converts a csv into a list of string arrays. Each item in the csv is an item in the array and
     * each row of the csv is an entry in the list.
     *
     * @param filename - file name to read the csv from
     * @return - List/<String[]>
     * @throws IOException - if there is a formatting issue with the IO of the data
     */
    public static List<String[]> readCSVtoListStringArray(String filename) throws IOException {
        CSVReader reader = new CSVReader(new FileReader(filename));
        List<String[]> csvData;
        csvData = reader.readAll();

        return csvData;
    }


    /*
     * PRIVATE METHODS
     * ================================================================================================================
     */

    /**
     * Takes in a list of string arrays and reads those scores in. Each entry is a box score line as read in by
     * the readInHistoricBoxScoresAndCreateFiles method. Each of these fields are stored in a gameData
     * and in a team object for team team (separated by name and year). It also adds the normalize values for
     * each year if they are greater. This is also where the neural network is built and the files that hold
     * the information for successive runs are created.
     *
     * @param lineEntries - List of String arrays to read in
     * @throws CsvFormatingException - if the csv is formatted incorrectly when writing
     * @throws IOException - if their is an IO when writing the files
     */
    private static void readBoxScoreIn(List<String[]> lineEntries) throws CsvFormatingException, IOException, ParseException {

        List<String> scoreDate = new ArrayList<>();
        Date date = new Date();
        GameSite site;

        for (String[] line : lineEntries) {

            for(int i=0; i<line.length; ++i){
                line[i] = line[i].trim();
            }

            if (line[0].trim().equalsIgnoreCase("Date")){
                String d = line[1];
                DateFormat formatter = new SimpleDateFormat("MM/dd/yy");
                date = (Date)formatter.parse(d);
                continue;
            }


            Team a = TeamMap.getTeamForYearAndName(date.getYear() + 1900, line[0]);
            Team b = TeamMap.getTeamForYearAndName(date.getYear() + 1900, line[2]);

            a.addAll(line[0], Integer.parseInt(line[1].trim()), line[2], Integer.parseInt(line[3].trim()), GameSite.NEUTRAL);
            b.addAll(line[2], Integer.parseInt(line[3].trim()), line[0], Integer.parseInt(line[1].trim()), GameSite.NEUTRAL);

        }

    }

    /**
     * Parses the year from the file path and file name in schedule_yyyy.csv
     *
     * @param fileName path and file name to be parsed
     * @return integer value of the year parsed
     */
    private static int parseYear(String fileName) throws CsvFormatingException {

        int year;
        String[] breakFilePath;
        String fileWithExt;
        String date;

        try {
            breakFilePath = fileName.split(File.separator);
            fileWithExt = breakFilePath[breakFilePath.length - 1];
            date = fileWithExt.replaceAll("\\D", "");
        } catch (Exception e) {
            throw new CsvFormatingException("NNFL::ParseYear, unexpected error " + e);
        }
        if (date.length() > 4) {
            throw new CsvFormatingException("File name for schedule CSV file should be schedule_YYYY.csv" +
                    " where YYYY is the year of the schedule\nFile name was: " + fileWithExt);
        }
        try {
            year = Integer.parseInt(date.trim());
        } catch (Exception e) {
            throw new CsvFormatingException("File name for schedule CSV file should be schedule_YYYY.csv" +
                    " where YYYY is the year of the schedule\nFile name was: " + fileWithExt);
        }

        return year;
    }


}
