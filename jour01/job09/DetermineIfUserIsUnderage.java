package jour01.job09;

import java.util.Scanner;

public class DetermineIfUserIsUnderage {

    public static int getUserIntInput(String[] args) {

        // Initialize the scanner object to get keyboard input
        Scanner myIntScanner = new Scanner (System.in);

        System.out.println("Entrez votre âge : ");

        // Use the scanner to get 
        int myUserIntInput = myIntScanner.nextInt();

        // Close the scanner 
        myIntScanner.close();

        return myUserIntInput;

    }

    public static void main(String[] args) { 

        int userAge = getUserIntInput(args);

        if (userAge < 18) { 
            System.out.println("Vous êtes mineur");
        }
        else { 
            System.out.println("Vous êtes majeur");
        }
    }

}
