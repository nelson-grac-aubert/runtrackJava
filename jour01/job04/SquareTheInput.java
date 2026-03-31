package jour01.job04;
import java.util.Scanner; 

public class SquareTheInput {

    public static int getUserIntInput() {

        // Initialize the scanner object to get keyboard input
        Scanner myIntScanner = new Scanner (System.in);

        System.out.println("Quel est l'entier dont vous voulez le carré : ");

        // Use the scanner to get 
        int myUserIntInput = myIntScanner.nextInt();

        // Close the scanner 
        myIntScanner.close();

        return myUserIntInput;

    }

    public static void main(String[] args) {

        // Print the square of the user input using Math.pow(chiffre x a eveler, a la puissance y)
        System.out.println(Math.pow(getUserIntInput(), 2));

    }
}
