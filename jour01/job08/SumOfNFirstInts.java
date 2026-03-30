package jour01.job08;

import java.util.Scanner;

public class SumOfNFirstInts {

        public static int getUserIntInput(String[] args) {

        // Initialize the scanner object to get keyboard input
        Scanner myIntScanner = new Scanner (System.in);

        System.out.println("Entrez l'entier n pour obtenir la somme des n premiers entiers : ");

        // Use the scanner to get 
        int myUserIntInput = myIntScanner.nextInt();

        // Close the scanner 
        myIntScanner.close();

        return myUserIntInput;

    }

    

}
