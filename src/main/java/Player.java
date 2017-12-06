import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;

    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int countCardsInHand() {
        return this.hand.size();
    }

    public void receivesCard(Deck deck){
        this.hand.add(deck.dealCard());
    }

    public int getTotalOfHand(){
        total = 0;
        for (Card card : ArrayList<Card>() hand){
            value = card.getValueFromValueType();
            total += value;
        }
    }

}
