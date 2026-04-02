package jour04.job05;

public class Main {

    private static String formatTheElapsedTime(long start, long stop) { 

        final long milisecondsDelta = stop - start;

        return String.format("The program took %s miliseconds to run", milisecondsDelta);

    }

    public static int findBreakPoint(int maxCount) { 

        return maxCount / 2 ; 
    }
    public static void main(String[] args) {

        int maxCount = User.getUserInput();

        // Timestamp the start time
        final long start = System.currentTimeMillis();

        int breakPoint = findBreakPoint(maxCount);

        Counter counter1 = new Counter("1", 0, breakPoint);
        Counter counter2 = new Counter("2", breakPoint + 1, maxCount);

        Thread thread1 = new Thread(counter1);
        Thread thread2 = new Thread(counter2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        

        System.out.println("I counted to " + maxCount + "!");

        // Timestamp the stop time, print elapsed
        final long stop = System.currentTimeMillis();
        System.out.println(formatTheElapsedTime(start, stop));

    }

}   
