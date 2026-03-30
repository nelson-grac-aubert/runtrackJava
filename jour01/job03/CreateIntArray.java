/*  Écrire un programme java qui crée un tableau de 10 entiers qui stocke dans
l’ordre les entiers de 0 à 9. Combien vaut T[0], T[1], T[5], T[9], T[10] ? */

package jour01.job03;

import java.util.Arrays;

public class CreateIntArray {


    public static int[] createTheArray(int n) {

        // Déclarer un array de taille n+1 car les array ne peuvent pas changer de taille
        int[] myFirstArray = new int[n+1];

        for(int i = 0; i <= n; i ++) {

            // Changer les index de l'array un a un 
            myFirstArray[i] = i;

        }

        return myFirstArray;
    }

    public static void main(String[] args) {

        // Print           Converting to a readable string, the array returned by the function with 9 as parameter
        System.out.println(Arrays.toString(createTheArray(9))); 

    }
}
