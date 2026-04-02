package jour04.job01;

public class ThreadProject {

    public static void main(String[] args) {
        
        MyThread myBigFatThread = new MyThread();

        myBigFatThread.start();
    }
}
