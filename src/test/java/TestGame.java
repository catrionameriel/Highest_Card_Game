import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGame {

    private Game game;
    private Player player1;
    private Player player2;
    private Deck deck;

    @Before
    public void before(){
        player1 = new Player("George");
        player2 = new Player("Bill");
        deck = new Deck();
        deck.fillDeck();
        game = new Game(deck);
    }

    @Test
    public void PlayersAdded(){
        game.addPlayer(player1);
        game.addPlayer(player2);
        assertEquals(2, game.countPlayers());
    }

    @Test
    public void playerHaSCardWithValue(){
        game.addPlayer(player1);
        player1.receivesCard(deck);
        assertEquals();
    }
}
