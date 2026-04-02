package jour04.job05;

import java.util.Scanner;

public abstract class User {

    public static int getUserInput() { 

        // Init Scanner
        Scanner intScanner = new Scanner(System.in); 

        // User print
        System.out.println("How far must the program count? ");

        // Get int
        int maxCount = intScanner.nextInt();

        // Manually cloe the scanner
        intScanner.close();

        return maxCount;

    }

}
