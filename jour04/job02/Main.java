package jour04.job02;

public class Main {
    
    private static String formatTheElapsedTime(long start, long stop) { 

        long milisecondsDelta = stop - start;

        return String.format("The program took %s miliseconds to run", milisecondsDelta);

    }
    public static void main(String[] args) {

        int chosenLenght = User.getUserInput();

        // Timestamp the start time
        long start = System.currentTimeMillis();

        StringGenerator myStringGenerator = new StringGenerator(chosenLenght); 

        FileEditor myFileEditor = new FileEditor();

        myFileEditor.outputTheString(myStringGenerator.getTheGeneratedString());

        // Timestamp the stop time time, print the execution time
        long stop = System.currentTimeMillis();
        
        System.out.println(formatTheElapsedTime(start, stop));
        
    }

}
