package jour01.job05;
import java.util.Arrays;
import java.util.Scanner;

public class PrintTheBiggestInput {

    public static int[] GetThreeUserIntInputs() {
        
        // Declare an empty array of lenght 3
        int[] threeIntsToCompare = new int[3];

        // Open the scanner
        Scanner myIntScanner = new Scanner (System.in);

        // 3 times
        for(byte i = 0; i < 3; i++) {
            
            // Say you expect print n° i using formatted string
            System.out.println(String.format("Entrez l'entier n° %s à comparer : ", i + 1));

            // Assign that int to 0, 1, 2 in the array
            threeIntsToCompare[i] = myIntScanner.nextInt();

        }

        // Close the scanner
        myIntScanner.close();

        // Debug : print the array to see if its correct
        System.out.println(Arrays.toString(threeIntsToCompare));
        // Return the array of three int inputs
        return threeIntsToCompare;

    }

    public static int getMaxFromArray(int[] arrayToCompare) {

        int maximum = 0;
        
        // Iterate trough the array
        for(int i = 0; i < arrayToCompare.length; i ++) {

            // If new maximum is found
            if(arrayToCompare[i] >= maximum) {

                // maximum becomes the newest (and biggest)
                maximum = arrayToCompare[i];

            }

        }

        return maximum;

    }

    public static void main(String[] args) { 
        
        System.out.println("Le plus grand entier renseigné est " + getMaxFromArray(GetThreeUserIntInputs()));

    }
}
