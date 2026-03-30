package jour01.job08;

import java.util.Scanner;

public class SumOfNFirstCubes {

    public static int getUserIntInput(String[] args) {

        // Initialize the scanner object to get keyboard input
        Scanner myIntScanner = new Scanner (System.in);

        System.out.println("Entrez l'entier n pour obtenir la somme des cubes des n premiers entiers : ");

        // Use the scanner to get 
        int myUserIntInput = myIntScanner.nextInt();

        // Close the scanner 
        myIntScanner.close();

        return myUserIntInput;

    }

    public static int calculateTheSumOfCubes(int n) { 
        
        // Initalize a sum at zero
        int sumOfCubes = 0;

        // For every int between 0 and n
        for(byte i = 1; i <= n; i++) {

            // Add the cube of that int to the sum
            sumOfCubes += Math.pow(i, 3);

        }

        return sumOfCubes;

    }

    public static void main(String[] args) {

        System.out.println(calculateTheSumOfCubes(getUserIntInput(args)));
        
    }

}
