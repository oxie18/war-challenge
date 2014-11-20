package war;

import org.junit.Assert;
import org.junit.Test;

public class BattleTest {

  @Test
  public void leftPlayerShouldWin() {
//    Deck winner = new Deck(2);
//    Deck loser = new Deck(1);
    Deck winner = new Deck(new Card("Spade", 2));
    Deck loser = new Deck(new Card("Club", 1));
    Battle battle = new Battle(winner, loser, 0);
    battle.start();
    Assert.assertEquals(2, winner.size());
    Assert.assertEquals(0, loser.size());
  }

  @Test
  public void rightPlayerShouldWin() {
    Deck winner = new Deck(new Card("Heart", 2));
    Deck loser = new Deck(new Card("Diamond", 1));
    Battle battle = new Battle(loser, winner, 0);
    battle.start();
    Assert.assertEquals(2, winner.size());
    Assert.assertEquals(0, loser.size());
  }

  @Test
  public void shouldDemonstrateTie() {
//    Deck winner = new Deck(5, 1, 1, 1, 3);
//    Deck loser = new Deck(5, 3, 3, 3, 1);
      Deck winner = new Deck(new Card("Diamond", 5), new Card("Heart", 1), new Card("Diamond", 1),
              new Card("Club", 1), new Card("Heart", 3));
      Deck loser = new Deck(new Card("Heart", 5), new Card("Club", 3), new Card("Spade", 3),
              new Card("Spade", 3), new Card("Club", 1));
    Battle battle = new Battle(loser, winner, 0);
    battle.start();
    Assert.assertEquals(10, winner.size());
    Assert.assertEquals(0, loser.size());
  }

}
