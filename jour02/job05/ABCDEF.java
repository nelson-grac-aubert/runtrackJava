package jour02.job05;

import java.util.ArrayList;

public class ABCDEF {

    static class A {
        public A() {}
        
    }

    static class B extends A { 
        public B() {
            super();
        }
    }

    static class C extends B { 
        public C() {
            super(); 
        }    
    }

    static class D extends A { 
        protected int d = 1; 

        public D(int x) { 
            super();
            d = x;
        }

        public D() {}
    }

    static class E extends D { 
        public E() { 
            super();
        }
    }

    static class F extends D { 
        public F() { 
            super();
        }    }

    
    public static void main (String[] args) { 

        A a = new A(); 
        B b = new B(); 
        C c = new C(); 
        D d = new D(); 
        E e = new E(); 
        F f = new F(); 


        // Indiquez si les affections sont correctes

        // a = b; // Oui car un B est un A
        // b = a; // Non car un A n'est pas toujours un B
        // a = (A) b; // Oui car on convertit un B qui est un type de A, en A
        // a = null; // Oui
        // // null = a; // toujours une variable à gauche d'une assignation
        // a = d; // Oui car un D est un type de A 
        // b = d; // Non car même si un D et un B sont des types de A, ils n'ont pas de lien entre eux
        // a = e; // Oui car un E est un C qui est un A
        // d = e; // Oui car un E est un D 

        // Remplissage d'un tableau

        A[] as = new A[10];

        as[0] = new A();
        as[1] = new B();
        as[2] = new D(2);
        as[3] = new E();
        as[4] = new C();
        as[5] = new D(4);
        as[6] = new B();

        rechercher(as); // Print 3 car 2 elements de type B et un de type C qui est un B 
        additionner(as); // Print 6 car total des d de l'array est 7 : 2 et 4 en paramètres dans les D, et 1 par défaut dans E
                         // qui est un D lol 

    }

    private static void rechercher(A[] as) { 

        byte counter = 0; 

        for(byte i = 0; i < as.length - 1; i ++) { 
            if(as[i] instanceof B) {
                counter += 1;
            }
        }

        System.out.println(String.format("Il y a %s objets de type B dans as", counter));

    } 

    private static void additionner(A[] as) { 

        byte sum = 0;

        for(byte i = 0; i < as.length - 1; i ++) { 

            if(as[i] instanceof D) { 
                sum += ((D)as[i]).d;
            }

        }

        System.out.println(String.format("La somme des d est de %s", sum));
    }
}
