package ie.atu.week6;

import java.util.Scanner;

public class UsingTryCatch {
    public static void main(String[] args) {

        System.out.println("Please enter a number between 0-9: ");

        // if we include the try-with-resources,
        // this will ensure the resource is
        // closed at the end of the statement,
        // instead of manually closing at the end.

        try (Scanner in = new Scanner(System.in)) { // Try-with-resources must be OUTSIDE loop as it will close Scanner
            while (true) {
                try {                              // Then wrap code in try-catch statement
                    String input = in.nextLine();
                    int number = Integer.parseInt(input);
                    // Error Handling
                    if (number >= 0 && number <= 9) {
                        System.out.println("Your number is " + number);
                        break; // used to break out loop and finish program
                    } else {
                        // Only runs when integer that's not in range is entered
                        System.out.println("Not a valid number!\n\nPlease enter a number between 0-9: ");
                    }
                } catch (NumberFormatException nfe) {
                    // Only runs when an invalid non-integer value is entered
                    System.out.println("Not a valid number! Error: " + nfe.getMessage() + "\n\nPlease enter a number between 0-9: ");
                }
            }
        }
    }
}
