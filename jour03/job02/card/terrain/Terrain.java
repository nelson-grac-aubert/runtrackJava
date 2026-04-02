package jour03.job02.card.terrain;

import java.util.Arrays;

import jour03.job02.card.Card;

public class Terrain extends Card {

    char[] colors = new char[5]; {
        colors[0] = 'B';
        colors[1] = 'b'; 
        colors[2] = 'n';
        colors[3] = 'r';
        colors[4] = 'v';
    }

    char color; 

    Terrain(char color) { 

        // Assign a color, making sure it's in the valid options
        if(Arrays.asList(colors).contains(color)) { 
            this.color = color;
        }
        else {
            System.out.println("This terrain's color is invalid");
        }

        // Terrains always cost 0
        this.cost = 0;

    }

    public void displayInfos() {
        System.out.println(String.format("A terrain of color %s", this.getColor()));
    }

    public char getColor() {
        return this.color;
    }

}
