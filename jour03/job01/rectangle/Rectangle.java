package jour03.job01.rectangle;

import jour03.job01.rectangle.rectanglecolore.RectangleColore;

public class Rectangle {
    
    protected double largeur;
    protected double longueur;

    public Rectangle(double largeur, double longueur) { 

        this.largeur = largeur;
        this.longueur = longueur;

    }

    public double getLargeur() { 
        return this.largeur;
    }
    public double getLongueur() { 
        return this.longueur;
    }

    @Override
    public String toString() { 

        return "Rectangle :\n" + 
                String.format("  largeur = %s\n", getLargeur()) + 
                String.format("  longueur = %s\n", getLongueur());
    }

    public boolean equals(Rectangle b) { 

        if(b == null) {
            return false;
        }
        
        return this.getLargeur() == b.getLargeur() && this.getLongueur() == b.getLongueur();

    }

    public boolean equals(RectangleColore b) { 

        return false;

    }
}
