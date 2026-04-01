package jour03.job02.carte;

public abstract class Card {

    protected byte cost;

    abstract protected void displayInfos();

    public byte getCost() {
        return this.cost;
    }

}
