package jour01.job14;

import java.util.Scanner;

public class InvertANumber {

    public static int getUserIntInput(String[] args) {

        // Initialize the scanner object to get keyboard input
        Scanner myIntScanner = new Scanner (System.in);

        System.out.println("Quel est le nombre que vous souhaitez inverser? ");

        // Use the scanner to get 
        int myUserIntInput = myIntScanner.nextInt();

        // Close the scanner 
        myIntScanner.close();

        return myUserIntInput;

    }

    public static String convertIntToString(int n) {

        // Convert integer into string
        String convertedString = Integer.toString(n);

        // Print for debug
        System.out.println("Converted into string :" + convertedString);

        return convertedString ; 
        
        
    }

    public static String invertString(String s) { 

        // Initialize an empty string
        String invertedString = ""; 

        // For all indexes of the string, starting from the last
        for (int i = s.length() - 1; i >= 0 ; i--) {

            // Select the character at that index
            char currentChar = s.charAt(i); 

            // And add it to the new string
            invertedString += currentChar;

        }

        return invertedString; 

    }

    public static void main(String[] args) { 

        int userInputInt = getUserIntInput(args); 

        String userInputString = convertIntToString(userInputInt); 

        String invertedString = invertString(userInputString); 

        System.out.println((invertedString));
    }
}
