/* Le programme Erreur ci-dessous définit les classes E1, E2, E3, E4, E5 et Erreur.
Pour chacune des 5 instructions d'affichage dans la méthode main, indiquez
si l'instruction est correcte ou fausse. Compilez et corrigez le programme pour
vérifier vos réponses. */

package jour02.job02;

class Error {
    
    public static void main(String[] args) { 

        E1 x = new E1(); 
        E2 y = new E2();
        E3 z = new E3();
        E4 v = new E4();
        E5 w = new E5();

        System.out.println(x.a); // prédiction : 1
        // System.out.println(y.c); // prédiction : erreur, c est un attribut de E3 qui est un enfant de E2, tous les E2 n'ont pas de c
        System.out.println(z.b); // prédiction : 2, E3 est un E2 et a donc un b 
        // System.out.println(v.c); // prédiction : erreur : E4 est un E1, mais n'est pas un E3 donc n'a pas de c
        System.out.println(w.a); // prédiction : 1 : E5 est un E4 qui est un E1 donc a un a 
    }
}

class E1 { 
    int a = 1;
}

class E2 extends E1 { 
    int b = 2;
}

class E3 extends E2 { 
    int c = 3;
}

class E4 extends E1 { 
    int d = 4;
}

class E5 extends E4 { 
    int e = 5;
}

