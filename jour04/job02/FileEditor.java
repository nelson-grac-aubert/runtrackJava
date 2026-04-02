package jour04.job02;

import java.io.IOException;
import java.io.FileWriter;

public class FileEditor {
    
    public void outputTheString(String generatedString) { 

    try {

        // Instantiate the FileWriter
        FileWriter myWriter = new FileWriter("output.txt");

        // (over)Write in file
        myWriter.write(generatedString);

        // Manually close the writer
        myWriter.close(); 

        // Debug output
        System.out.println("Successfully wrote to the file.");

        } 
    
    // Mandatory error management
    catch (IOException e) {

        System.out.println("An error occurred.");
        e.printStackTrace();

        }
    }

}
