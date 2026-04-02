package jour03.job02.card;

public abstract class Card {

    protected byte cost;

    abstract protected void displayInfos();

    public byte getCost() {
        return this.cost;
    }

}
