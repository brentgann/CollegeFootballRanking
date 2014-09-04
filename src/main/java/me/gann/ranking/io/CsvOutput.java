package me.gann.ranking.io;

import au.com.bytecode.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * User: Christian Smith
 * Date: 3/29/14
 * Time: 11:33 PM
 * File: CsvOutput.java
 *
 * Create a csv file for a list of string arrays
 */
public class CsvOutput {

    /**
     * Creates a csv file for a list of string arrays where each array item is an element in the csv row
     * and each row is represented by a full array (one item in the list).
     *
     * @param filename - the filename to write the csv to
     * @param data - List for String[] to write
     * @throws IOException
     */
    public static void outputToFile(String filename, List<String[]> data) throws IOException {

        CSVWriter writer = new CSVWriter(new FileWriter(filename));
        writer.writeAll(data);

        writer.close();
        System.out.println("File " + filename + " created successfully.");
    }
}
