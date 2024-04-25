package edu.sjsu;

public class NameChecker {
    /**
     * Checks if a given string is a valid name following these rules:
     * - Between 2 to 40 characters
     * - Contains only alphabetic characters, non-consecutive hyphens, or a single
     * quote
     * - Cannot start with a hyphen or single quote
     * 
     * @param input Name to check
     * @return True if input is a valid name, else false
     */
    public static boolean check(String input) {
        // Check for null input or length constraints
        if (input == null || input.length() < 2 || input.length() > 40) {
            return false;
        }

        // Regex to check the rules: start with an alphabet, allow alphabets, single
        // quotes,
        // non-consecutive hyphens, and should not end with a hyphen or quote.
        String regex = "^[A-Za-z]([A-Za-z]|(?<!-)-(?=[A-Za-z])|'(?=[A-Za-z]))*[A-Za-z]$";

        // Return whether the input matches the regex
        return input.matches(regex);
    }
}
