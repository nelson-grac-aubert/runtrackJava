package jour01.job06;
import java.util.Arrays;
import java.util.Scanner;

public class AverageOfFiveInts {

    public static int[] GetFiveUserIntInputs(String[] args) {
        
        // Declare an empty array of lenght 5
        int[] threeIntsToCompare = new int[5];

        // Open the scanner
        Scanner myIntScanner = new Scanner (System.in);

        // 3 times
        for(int i = 0; i < 5; i++) {
            
            // Say you expect print n° i using formatted string
            System.out.println(String.format("Entrez l'entier n° %s à comparer : ", i + 1));

            // Assign that int to 0, 1, 2, 3, 4 in the array
            threeIntsToCompare[i] = myIntScanner.nextInt();

        }

        // Close the scanner
        myIntScanner.close();

        // Debug : print the array to see if its correct
        System.out.println(Arrays.toString(threeIntsToCompare));
        // Return the array of three int inputs
        return threeIntsToCompare;

    }

    public static float GetAverageOfArray(int[] anArrayOfFiveInts) {
        
        // Initialize a zero sum
        float sum = 0;

        // For every element of the array
        for(int i = 0; i < anArrayOfFiveInts.length; i++) {

            // Add itself to the sum
            sum += anArrayOfFiveInts[i];

        }

        // Return the sum of the ints divided by the amount of ints 
        return sum / anArrayOfFiveInts.length; 
    }

    public static void main(String[] args) { 
        
        System.err.println("La moyenne des entiers renseignés est : " + GetAverageOfArray(GetFiveUserIntInputs(args)));

    }
}
