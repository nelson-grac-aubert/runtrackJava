package jour04.job02;
import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class

public class OutputAThousandMilesVanessaCarlton {

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

        for(int i =0; i <= longAssStringLenght; i++) { 

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

        int stringLenght = getUserInput();

        // Get time stamp
        long start = System.currentTimeMillis();

        String theString = generateTheLongAssString(stringLenght);

        outputTheLongAssStringIntoAFatAssTextFile(theString);

        // Get time stamp
        long stop = System.currentTimeMillis();

        // Print execution duration
        System.out.println(stop - start);

    }
}

/*
How long do you want the string to be bitch? 
456789
Successfully wrote to the file.
10299 

Plus de 10 secondes d'execution pour écrire 400k caractères 
*/