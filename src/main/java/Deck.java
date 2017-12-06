import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        cards = new ArrayList<>();
    }


    public int countCardsInDeck() {
        return this.cards.size();
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public void fillDeck() {
        for (SuitType suit : SuitType.values()) {
            for (ValueType value : ValueType.values()) {
                this.cards.add(new Card(suit, value));
//                Why can't we call above method here?
            }
        }
    }

}
