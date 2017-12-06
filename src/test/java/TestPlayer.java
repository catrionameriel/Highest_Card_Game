import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPlayer {

    Player player1;
    Player player2;
    Deck deck;

    @Before
    public void before(){
        player1 = new Player("George");
        player2 = new Player("Bill");
        deck = new Deck();
        deck.fillDeck();
    }

    @Test
    public void PlayerHasName(){
        assertEquals("Bill", player2.getName());
    }

    @Test
    public void playerHasCard(){
        player1.receivesCard(deck);
        assertEquals(1, player1.countCardsInHand());
    }
}
