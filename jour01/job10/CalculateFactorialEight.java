package jour01.job10;

public class CalculateFactorialEight {

    public static int calculateTheFactor() { 

        // Initialize a factor at 1
        int factor = 1; 

        // For every int between 2 and 8 
        for(byte i = 2; i <= 8; i++) {

            // Multiply the factor and the int
            factor *= i;

        }

        return factor;

    }

    public static void main(String[] args) { 

        System.out.println("The factorial of 8 is " + calculateTheFactor());
        
    }
}
