package jour04.job02;

import java.util.Random;

public class StringGenerator {

    private String theGeneratedString;

    StringGenerator(int theChosenLenght) { 

        // Generate and assign the string on instantiation
        this.theGeneratedString = generateTheString(theChosenLenght);

    }

    private static char generateARandomCharacter () { 

        char aRandomChar = 'a';

        Random r = new Random();
        aRandomChar = (char)(r.nextInt(26) + 'a');

        return aRandomChar;

    }

    private static String generateTheString (int longAssStringLenght) {

        String theLongAssString = ""; 

        for(int i =0; i < longAssStringLenght; i++) { 

            theLongAssString += generateARandomCharacter();

        }

        return theLongAssString;
    }

    public String getTheGeneratedString() { 
        return this.theGeneratedString;
    }

}
