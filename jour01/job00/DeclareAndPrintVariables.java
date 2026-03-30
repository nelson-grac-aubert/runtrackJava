/* Déclarer une variable de chaque type (char, string, int, long, float, boolean)
Afficher les valeurs stockées.
Pour int TOTO, stockez 3.817 puis affichez la valeur de TOTO. Que
constatez-vous ? */

public class DeclareAndPrintVariables {
    public static void main(String[] args) {
        char myChar = 'a';
        String myString = "merde";
        int myInt = 69;
        long myLong = 9223372036854778l;
        float myFloat = 34.67f;
        boolean maBoule = true;


        System.out.println(myChar);
        System.out.println(myString);
        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(myFloat);
        System.out.println(maBoule);

        /* 
        Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        Type mismatch: cannot convert from double to int

        at Main.main(Main.java:17)
        
        int TOTO = 3.817;
        System.out.println(TOTO);
        */
        
    }

}