package jour03.job02.carte.creature;

import jour03.job02.carte.Card;

public class Creature extends Card {

    String name;
    int attackPower; 
    int healthPoint;

    Creature(byte cost, String name, int attackPower, int healthPoint) { 

        this.cost = cost;
        this.name = name;
        this.attackPower = attackPower; 
        this.healthPoint = healthPoint;

    }

    public String getName() {
        return this.name;
    }

    public int getHealthPoint() {
        return this.healthPoint;
    }

    public int getAttackPower() {
        return this.attackPower;
    }

    public void displayInfos() {
        System.out.println(String.format("A %s costing %s with %s health and %s attack has spawned",
                this.getName(), this.getCost(), this.getHealthPoint(), this.getAttackPower()));
    }
}
