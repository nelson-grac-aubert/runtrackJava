package jour01.job09;

import java.util.Scanner;

public class DetermineIfUserIsUnderage {

    public static byte getUserByteInput(String[] args) {

        // Initialize the scanner object to get keyboard input
        Scanner myByteScanner = new Scanner (System.in);

        System.out.println("Entrez votre âge : ");

        // Use the scanner to get 
        byte myUserByteInput = myByteScanner.nextByte();

        // Close the scanner 
        myByteScanner.close();

        return myUserByteInput;

    }

    public static void main(String[] args) { 

        byte userAge = getUserByteInput(args);

        if (userAge < 18) { 
            System.out.println("Vous êtes mineur");
        }
        else { 
            System.out.println("Vous êtes majeur");
        }
    }

}
