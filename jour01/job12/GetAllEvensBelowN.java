package jour01.job12;

import java.util.Scanner;

public class GetAllEvensBelowN {

    public static int getUserIntInput(String[] args) {

        // Initialize the scanner object to get keyboard input
        Scanner myIntScanner = new Scanner (System.in);

        System.out.println("Quel est le plafond de votre énumération de nombres pairs? ");

        // Use the scanner to get 
        int myUserIntInput = myIntScanner.nextInt();

        // Close the scanner 
        myIntScanner.close();

        return myUserIntInput;

    }

    public static void main(String[] args) { 

        // Get the maximum int
        int maxInt = getUserIntInput(args);

        // For every int between 0 and max
        for (int i = 0; i <= maxInt; i ++) {

            // If even
            if (i % 2 == 0) { 

                // Print itself
                System.out.println(i);

            }

        }
        
        }
}
