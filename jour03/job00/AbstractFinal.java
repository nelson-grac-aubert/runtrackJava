package jour03.job00;

abstract class A {
    int a;
}

class B extends A { 
    int b;
}

class C extends A { 
    final double c = 1;
}

abstract class D extends A {
    double d; 

    int operation(int a) { 
        return (a * 2);

    }

    // abstract int calcul(intb) { 
    // }                            PREMIERE ERREUR : les méthodes abstraites n'ont pas de body {} (cf. ligne 28)

    abstract int machin();
}

class AbstractFinal {

    public static void main(String[] args) {

        A[] tab = new A[3]; 
        // tab[0] = new A(); // ERREUR : une classe abstraite ne peut etre instanciée (cf. ligne 5)
        tab[1] = new B();
        tab[2] = new C(); 
        // tab[1].b = 2; // ERREUR : tab[1] est un A pour le programme, 
                         // il faut trouver un moyen de lui préciser qu'on agit ici sur son aspect B
                         // ((B)tab[1].b)

        // ((C)tab[2].c) = 3; // ERREUR : une variable déclarée final ne peut plus être modifiée (cf. ligne 14)

    }
}
