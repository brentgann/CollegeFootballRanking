package me.gann.ranking.exception;

/**
 * User: Brent Gann
 *
 * Exception if the CSV is not formatted correctly.
 */
public class CsvFormatingException extends Exception {

    /**
     * Exception message
     */
    String message;

    /**
     * Default constructor for the exception
     *
     * @param s - message for the exception
     */
    public CsvFormatingException(String s) {
            this.message = s;
    }

    /**
     * Returns the exception message set in the exception
     *
     * @return exception message
     */
    @Override
    public String getMessage() {
        return message;
    }
}
