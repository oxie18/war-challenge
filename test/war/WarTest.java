package war;

import org.junit.Assert;
import org.junit.Test;

public class WarTest {

  @Test
  public void shouldDemonstratePlayer1WinInOneBattle() {
    String expected = "Clinton";
//    War war = new War(expected, "Loser", new Deck(2, 1));
    War war = new War(expected, "Loser", new Deck(new Card("Heart", 2), new Card("Heart", 1)));
    String winner = war.start();
    Assert.assertEquals(expected, winner);
    Assert.assertEquals(1, war.getBattles());
  }

  @Test
  public void shouldReshuffleBeforeWin() {
    String expected = "Clinton";
//    Deck deck = new Deck(2, 1, 2, 1, 1, 2, 1, 2);
    Deck deck = new Deck(new Card("Heart", 2), new Card("Diamond", 1), new Card("Spade", 2), new Card("Club", 1),
            new Card("Heart", 1), new Card("Diamond", 2), new Card("Spade", 1), new Card("Club", 2));
    War war = new War(expected, "Loser", deck);
    war.start();
    Assert.assertTrue(war.getBattles() > 4);
  }

  @Test
  public void shouldPlayWithRandomDeck() {
    War war = new War("Player1", "Player2");
    war.start();
    Assert.assertTrue(war.getBattles() > 26);
  }

  @Test
  public void shouldPlayWithCompletelyOrderedDeckResultingInAnUnresolvableTie() {
    War war = new War("Player1", "Player2", new Deck());
    String winner = war.start();
    Assert.assertEquals(1, war.getBattles());
    Assert.assertEquals("Player2", winner);
  }

}
