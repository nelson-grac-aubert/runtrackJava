package jour03.job02;

import jour03.job02.card.Card;

public class Game {

    Card[] deck = new Card[10];

    void draw(Card cardDrawn) { 

    }

    Card[] getDeck() { 
        return this.deck;
    }

    byte findFirstAvailableSlot() {

        for(int i = 0; i <= 10; i++) {

            if(this.getDeck()[i] != null) {

                return (byte)i;

            }

        }
    }

}
