package jour01.job11;

import java.util.Scanner;

public class CalculateFactorialN {

    public static int getUserIntInput() {

        // Initialize the scanner object to get keyboard input
        Scanner myIntScanner = new Scanner (System.in);

        System.out.println("Entrez l'entier dont vous voulez calculer la factorielle : ");

        // Use the scanner to get 
        int myUserIntInput = myIntScanner.nextInt();

        // Close the scanner 
        myIntScanner.close();

        return myUserIntInput;

    }

    public static int calculateTheFactor(int n) { 

        // Initialize a factor at 1
        int factor = 1; 

        // For every int between 2 and 8 
        for(int i = 2; i <= n; i++) {

            // Multiply the factor and the int
            factor *= i;

        }

        return factor;
        
    }

    public static void main(String[] args) { 

        int userInputInt = getUserIntInput();
        
        System.out.println(String.format("The factorial of %s is " + calculateTheFactor(userInputInt), userInputInt));
        
    }

}
