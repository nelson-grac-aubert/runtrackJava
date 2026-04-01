package jour03.job01.rectangle.rectanglecolore;

import jour03.job01.rectangle.Rectangle;

public class RectangleColore extends Rectangle{

    private String couleur;

    public RectangleColore(double longueur, double largeur, String couleur) { 

        super(longueur, largeur); 
        this.couleur = couleur;

    }

    public String getCouleur() {
        return this.couleur;
    }

    @Override
    public String toString() { 

        String partieCommuneDeLaString = super.toString();

        return partieCommuneDeLaString + 
               String.format("  couleur = %s\n", this.getCouleur());

    }

    @Override
    public boolean equals(Rectangle b) { 

        return false;

    }

    @Override
    public boolean equals(RectangleColore b) { 

        return super.equals((Rectangle)b) && this.getCouleur().equals(b.getCouleur());

    }

}
