package jour03.job02.carte.spell;

import jour03.job02.carte.Card;

public class Spell extends Card {

    String name; 
    String description;
    
    Spell(byte cost, String name, String description) {

        this.cost = cost;
        this.name = name;
        this.description = description;
        
    }


    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public void displayInfos() {
        System.out.println(String.format("A %s costing %s has been spawned", this.getName(), this.getCost()));
        System.out.println(String.format("It reads : %s", this.getDescription()));
    }
}
