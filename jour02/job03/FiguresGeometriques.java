package jour02.job03;

public class FiguresGeometriques {
    
    /* 
    static class Rectangle will make your program work.
    As it is, you've got Rectangle as an inner class, which (by definition) is associated with a particular instance of
    FiguresGéométriques (even if it never uses or refers to it), which means it's an error to say new Rectangle(); 
    without having a particular FiguresGeometriques instance in scope.
    If you declare it as a static class instead, then it's a "nested" class, which doesn't need a particular 
    FiguresGeometriques instance. 
    */

    public static class Rectangle { 

        private double longueur; 
        private double largeur;

        Rectangle(double lon, double lar) { 

            this.longueur = lon;
            this.largeur = lar;

        }

        public double getLongueur() {
            return this.longueur;
        }

        public double getLargeur() {
            return this.largeur;
        }

        public void setLargeur(double newLargeur) {
            this.largeur = newLargeur;
        }

        public void setLongueur(double newLongueur) {
            this.longueur = newLongueur;
        }

        public double surface() { 
            return this.longueur * this.largeur;
        }

    }

    public static void debugRectangle(double newLarg) { 

        Rectangle monRectangle = new Rectangle(6,7); 

        System.out.println(monRectangle.getLargeur());
        System.out.println(monRectangle.surface());
        monRectangle.setLargeur(newLarg);
        System.out.println(monRectangle.getLargeur());
        System.out.println(monRectangle.surface());

    }

    public static void main(String[] args) {

        debugRectangle(11);

    }
}
