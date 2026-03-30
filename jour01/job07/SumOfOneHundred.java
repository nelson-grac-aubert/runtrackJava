package jour01.job07;

public class SumOfOneHundred {

    public static int CalculateTheSum(String[] args) { 

        int sum = 0; 

        for(byte i = 1; i <= 100; i++) {

            sum += i;
        }

        return sum;

    }

    public static void main(String[] args) {

        System.out.println("La somme des entiers de 0 à 100 est : " + CalculateTheSum(args));
        
    }
}
