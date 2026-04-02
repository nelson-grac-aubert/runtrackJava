package jour04.job02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

    public static void writeInFile(String theString) { 

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

            writer.write(theString);

            writer.close();

        } 
        catch (IOException e) {

            e.printStackTrace();

        }

    }
}
