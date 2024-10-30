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
                        // Will print once the value is still an integer
                        System.out.println("Not a valid number!\n\nPlease enter a number between 0-9: ");
                    }
                } catch (NumberFormatException nfe) {
                    // Will only throw exception for non-integer values
                    System.out.println("Not a valid number!\n\nPlease enter a number between 0-9:");
                }
            }
        } catch(NumberFormatException nfe){
            System.out.println("-TEST- Unsure why works with only one catch block");
        }
    }
}
