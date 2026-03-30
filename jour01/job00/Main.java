public class Main {
    public static void main(String[] args) {
        char myChar = 'a';
        String myString = "merde";
        int myInt = 69;
        long myLong = 92233720368547780l;
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