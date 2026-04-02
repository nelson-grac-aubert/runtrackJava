package jour04.job04;

public class Main {

    private static String formatTheElapsedTime(long start, long stop) { 

        long milisecondsDelta = stop - start;

        return String.format("The program took %s miliseconds to run", milisecondsDelta);

    }
    public static void main(String[] args) {

        final int maxCount = User.getUserInput();

        // Timestamp the start time
        final long start = System.currentTimeMillis();

        for(int i = 1; i <= maxCount - 1; i++) {
            System.out.println("I'm counting... " + i);
        }

        System.out.println("I counted to " + maxCount + "!");

        // Timestamp the stop time, print elapsed
        final long stop = System.currentTimeMillis();
        System.out.println(formatTheElapsedTime(start, stop));


    }

}   
