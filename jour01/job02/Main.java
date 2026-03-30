package jour01.job02;
import java.util.Scanner; 

public class Main {

    public static void main(String[] args) {

        // Initialize the scanner object to get keyboard input
        Scanner myFirstScanner = new Scanner (System.in);

        System.out.println("Quel est votre prénom? ");
        
        // Use the scanner to get input with nextLine method
        String myFirstInput = myFirstScanner.nextLine(); 
        
        System.out.println("Bonjour " + myFirstInput);

        // Close the scanner object
        myFirstScanner.close();

    }

}

