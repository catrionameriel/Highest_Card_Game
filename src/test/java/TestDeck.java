import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDeck {

    Deck deck;
    Card card;

    @Before
    public void before(){
        deck = new Deck();
        card = new Card(SuitType.CLUBS, ValueType.ACE);
    }

    @Test
    public void deckIsEmpty(){
        assertEquals(0, deck.countCardsInDeck());
    }

    @Test
    public void oneCardInDeck() {
        deck.addCard(card);
        assertEquals(1, deck.countCardsInDeck());
    }

    @Test
    public void deckIsFull(){
        deck.fillDeck();
        assertEquals(52, deck.countCardsInDeck());
    }


    @Test
    public void canShuffleCards(){
        deck.fillDeck();
        deck.shuffleDeck();
        assertEquals(52, deck.countCardsInDeck());
    }

    @Test
    public void canDealRandomCard(){
        deck.fillDeck();
        deck.shuffleDeck();
        deck.dealCard();
        assertEquals(51, deck.countCardsInDeck());
    }



}
