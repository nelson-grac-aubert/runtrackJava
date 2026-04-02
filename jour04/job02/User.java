package jour04.job02;

import java.util.Scanner;

public abstract class User {

    public static int getUserInput() { 

        // Init Scanner
        Scanner intScanner = new Scanner(System.in); 

        // User print
        System.out.println("How long do you want the string to be bitch? ");

        // Get int
        int stringLenght = intScanner.nextInt();

        // Manually cloe the scanner
        intScanner.close();

        return stringLenght;

    }

}
