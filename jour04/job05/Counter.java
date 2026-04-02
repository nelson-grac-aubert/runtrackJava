package jour04.job05;

public class Counter implements Runnable {

    String runnableName;
    int min;
    int max;

    Counter(String runnableName, int min, int max) { 

        this.runnableName = runnableName;
        this.min = min;
        this.max = max;

    }

    @Override
    public void run() {
        
        for(int i = min; i <= max; i++) { 

            System.out.println("Thread " + this.runnableName + " is counting ... " + i);

        }
        
    }

}
