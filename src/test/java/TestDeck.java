import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDeck {

    Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void deckIsEmpty(){
        assertEquals(0, deck.countCardsInDeck());
    }

}
