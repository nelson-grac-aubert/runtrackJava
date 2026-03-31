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

    public static class Cercle { 

        private double x;
        private double y; 
        private double rayon; 

        Cercle(double x, double y, double rayon) { 
            this.x = x;
            this.y = y;
            this.rayon = rayon; 
        }

        public double getX() {
            return this.x;
        }

        public double getY() {
            return this.y;
        }

        public double getRayon() {
            return this.rayon;
        }

        public void setX(double newX) {
            this.x = newX;
        }

        public void setY(double newY) {
            this.y = newY;
        }

        public void setRayon(double newRayon) {
            this.rayon = newRayon;
        }

        public double surface() { 
            return Math.PI * Math.pow(this.rayon, 2);
        }

        public boolean isInside(double comparedX, double comparedY) { 

            double distanceBetweenPoints = Math.sqrt((Math.pow(comparedX, 2) - Math.pow(this.x, 2)) + (Math.pow(comparedY, 2) - Math.pow(this.y, 2)));
            return distanceBetweenPoints < this.rayon;
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

    public static void debugCercle(double newRay) { 

        Cercle monCercle = new Cercle(0,0,7); 

        System.out.println(monCercle.getRayon());
        System.out.println(monCercle.surface());
        monCercle.setRayon(newRay);
        System.out.println(monCercle.getRayon());
        System.out.println(monCercle.surface());

        System.out.println(monCercle.isInside(1,1));
        System.out.println(monCercle.isInside(100,100));


    }

    public static void main(String[] args) {

        debugRectangle(11);
        debugCercle(10);

    }
}
