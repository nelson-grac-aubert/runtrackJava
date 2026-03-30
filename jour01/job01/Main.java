/* Écrire un programme java qui demande un prénom et qui répond « bonjour
prenom » */

package jour01.job01;
import java.util.Scanner; 

public class Main {

    public static void main(String[] args) {

        // Initialize the scanner object to get keyboard input
        Scanner myFirstScanner = new Scanner (System.in);

        System.out.println("Entrez votre texte à répeter :");
        
        // Use the scanner to get input with nextLine method
        String myFirstInput = myFirstScanner.nextLine(); 
        
        System.out.println("Vous avez tapé : " + myFirstInput);

        // Close the scanner object
        myFirstScanner.close();

    }

}
