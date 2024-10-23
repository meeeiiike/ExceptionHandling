package ie.atu.week6;

import java.util.Scanner;

public class UsingTryCatch {
    public static void main(String[] args) {

        System.out.println("Please enter a number between 0-9: ");

        // if we include the try-with-resources,
        // this will ensure the resource is
        // closed at the end of the statement,
        // instead of manually closing at the end.
        try (Scanner in = new Scanner(System.in)){
            String input = in.nextLine();
            int number = Integer.parseInt(input);

            if (number >= 0 && number <= 9) {
                System.out.println("Your number is " + number);
            } else {
                System.out.println("Not a valid number");
            }
        }catch(NumberFormatException nfe){
            System.out.println("Not a valid number! Error: " + nfe.getMessage());
        }
    }
}
