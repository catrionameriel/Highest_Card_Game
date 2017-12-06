import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        cards = new ArrayList<>();
    }


    public int countCardsInDeck() {
        return this.cards.size();
    }
}
