/* Ce code fonctionne-t-il et, sinon, quelle(s) 
erreur(s) l’interpréteur va-t-il indiquer ? */

package jour02.job01;

class Toto {

    int toto = 0;

    Toto() { 

        // ajouter static pour debugger et avoir toto = 2, car t1 ne dépend pas d'une instance et est statique à la classe
        toto = toto + 1;

    }

    public static void main(String[] tutu) { 

        Toto t1 = new Toto();
        Toto t2 = new Toto(); 

        // ajouter t1.toto ou t2.toto pour debugger et avoir tx.toto = 1, car toto est lié à une instance de Toto
        System.out.println("Toto : " + toto);

    }

}

/* Le code ne s'execute pas : Cannot make a static reference to the non-static field toto Java(33554506) 
Main est une méthode statique. Elle ne peut acceder à balance, qui est un attribut : une varialbe non statique 
toto n'a de sens qu'en référence a un objet de la classe Toto */