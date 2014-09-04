import me.gann.ranking.constants.CollegeFootballTeam;

import java.io.Console;

/**
 * User: Brent Gann
 *
 * Main Command Line Interface for CFRS program
 */
public class FutureUserInterface {

    /**
     * Holds the current year for the UI
     */
    public static int year = 2014;

    /**
     * Main function
     *
     * @param args all arguments are ignored
     */
    public static void main(String args[]) {
        runClInterface();
    }


    /**
     * Displays Welcome message and begins the menu display loop
     */
    private static void runClInterface() {
        System.out.println("*** College Football Ranking System ***");
        System.out.println(" *** Version 0.1, August 23, 2014  ***");
        System.out.println();

        displayMainMenu();
    }

    /**
     * Displays the Main Menu and accepts/interprets input appropriately
     */
    private static void displayMainMenu() {
        boolean repeat = true;
        Console console = System.console();
        String input;

        while (repeat) {
            System.out.println("  Main Menu - Choose an option:\n"
                    + "==========================================================\n"
                    + "choice\t\tdescription\n"
                    + "--------------------------------------------------------\n"
                    + "  1)  \t\tUpdate the Dataset\n"
                    + "  2)  \t\tView Rankings\n"
                    + "  q)  \t\tQuit Program\n");

            input = console.readLine("Enter choice: ");
            acceptMenuChoice(input);
            if (input.equalsIgnoreCase("q")) {
                repeat = false;
            }
        }
    }

    /**
     * Accepts user input for all menus and calls the appropriate methods
     *
     * @param input user input for switching of menu choice
     */
    private static void acceptMenuChoice(String input) {
        if (input == null || input.isEmpty()) {
            input = "badInput";
        }
        if (input.charAt(input.length() - 1) == 'q' || input.charAt(input.length() - 1) == 'Q') {
            input = "q";
        }

        switch (input) {
            case "1":
                dataSetMenu();
                break;
            case "2":
                rankingMenu();
                break;
            case "13":
                displayTeams();
                break;
            case "1b":
                break;
            case "2b":
                break;
            case "q":
                break;
            default:
                System.out.println("You entered an invalid option.");
                clearConsole(1);
                break;
        }
    }

    private static void displayTeams() {
        for(CollegeFootballTeam team : CollegeFootballTeam.values()){
            if(team != CollegeFootballTeam.OTHER){
                System.out.println(team.getLocation() + " " + team.getNickname());
            }
        }
        System.console().readLine(CollegeFootballTeam.values().length + " teams printed, Press enter to continue:");
    }

    /**
     * Displays the prediction submenu and accepts/interprets input appropriately
     */
    private static void dataSetMenu() {
        boolean repeat = true;
        Console console = System.console();
        String input;

        while (repeat) {
            System.out.println("  Dataset Menu - Choose an Option:\n"
                    + "==========================================================\n"
                    + "choice\t\tdescription\n"
                    + "--------------------------------------------------------\n"
                    + "  1)  \t\tAdd a result\n"
                    + "  2)  \t\tAdd results file\n"
                    + "  3)  \t\tView teams\n"
                    + "  4)  \t\tView games\n"
                    + "  5)  \t\tView results\n"
                    + "  b)  \t\tGo Back to the Main Menu\n");

            input = console.readLine("Enter choice: ");
            acceptMenuChoice("1" + input);
            if (input.equalsIgnoreCase("b") || input.equalsIgnoreCase("q")) {
                repeat = false;
            }
        }
    }

    /**
     * Displays the training submenu and accepts/interprets input appropriately
     */
    private static void rankingMenu() {
        boolean repeat = true;
        Console console = System.console();
        String input;

        while (repeat) {
            System.out.println("  Ranking Menu - Choose an Option:\n"
                    + "==========================================================\n"
                    + "choice\t\tdescription\n"
                    + "--------------------------------------------------------\n"
                    + "  1)  \t\tView Rankings\n"
                    + "  b)  \t\tGo Back To Main Menu\n");

            input = console.readLine("Enter choice: ");
            acceptMenuChoice("2" + input);
            if (input.equalsIgnoreCase("b") || input.equalsIgnoreCase("q")) {
                repeat = false;
            }
        }
    }

    /**
     * Clears the console by printing out newlines
     *
     * @param opt option variable: if 1 prompt user to press enter to continue before clearing screen if anything else
     *            do no not prompt user before continuing
     */
    private static void clearConsole(int opt) {

        if (opt == 1) {
            Console console = System.console();
            System.out.println("Press enter to continue.");
            console.readLine("");
        }
        for (int i = 0; i < 3; ++i) {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }
    }

}
