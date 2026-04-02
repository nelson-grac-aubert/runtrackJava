package jour04.job02;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Random;
import java.util.Scanner;


public class OutputAThousandCharsVanessaCarlton {

    public static int getUserInput() { 

        // Init Scanner
        Scanner intScanner = new Scanner(System.in); 

        // User print
        System.out.println("How long do you want the string to be bitch? ");

        // Get int
        int stringLenght = intScanner.nextInt();

        intScanner.close();

        return stringLenght;

    }

    public static char generateARandomCharacter () { 

        char aRandomChar = 'a';

        Random r = new Random();
        aRandomChar = (char)(r.nextInt(26) + 'a');

        return aRandomChar;

    }

    public static String generateTheLongAssString (int longAssStringLenght) {

        String theLongAssString = ""; 

        for(int i =0; i < longAssStringLenght; i++) { 

            theLongAssString += generateARandomCharacter();

        }

        return theLongAssString;
    }

    public static void outputTheLongAssStringIntoAFatAssTextFile(String theLongAssString) { 

    try {

        FileWriter myWriter = new FileWriter("afatasstextfile.txt");

        myWriter.write(theLongAssString);

        myWriter.close();  // must close manually

        System.out.println("Successfully wrote to the file.");

        } 

    catch (IOException e) {

        System.out.println("An error occurred.");
        e.printStackTrace();

        }
    }   

    public static void main(String[] args) { 

        // Get User input
        int stringLenght = getUserInput();

        // Get start time stamp
        long start = System.currentTimeMillis();

        // Generate the string
        String theString = generateTheLongAssString(stringLenght);

        // Write the string using the output stream
        outputTheLongAssStringIntoAFatAssTextFile(theString);

        // Get stop time stamp
        long stop = System.currentTimeMillis();

        // Print execution duration
        System.out.println(stop - start);

    }
}

/* WITHOUT AN OUTPUT STREAM

How long do you want the string to be bitch? 
456789
Successfully wrote to the file.
10299 

Plus de 10 secondes d'execution pour écrire 400k caractères 
*/