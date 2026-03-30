package jour01.job13;

import java.util.Scanner;

public class PrintMultiplicationTableOfN {

    public static int getUserIntInput(String[] args) {

        // Initialize the scanner object to get keyboard input
        Scanner myIntScanner = new Scanner (System.in);

        System.out.println("Quel est le chiffre entre 0 et 9 dont vous voulez la table de multiplication?");

        // Use the scanner to get 
        int myUserIntInput = myIntScanner.nextInt();

        // Close the scanner 
        myIntScanner.close();

        return myUserIntInput;

    }

    public static void printMultiplicationTable(int n) { 

        // From to 10
        for (int i = 0; i <= 10; i++) { 

            // Print                                  i x n  =            result
            System.out.println(String.format("%s x %s = ", i, n) + i * n);

        }

    }

    public static void main(String[] args) { 

        int chosenInt = getUserIntInput(null);
        
        printMultiplicationTable(chosenInt);

    }
}
