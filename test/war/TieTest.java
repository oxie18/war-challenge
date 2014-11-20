package war;

import org.junit.Assert;
import org.junit.Test;

public class TieTest {

  @Test
  public void rightPlayerShouldWinInAnAbsoluteTie() {
//    Deck winner = new Deck(2, 3, 4, 5);
//    Deck loser = new Deck(2, 3, 4, 5);
      Deck winner = new Deck(new Card("Heart", 2), new Card("Club", 4), new Card("Heart", 3), new Card("Diamond", 5));
      Deck loser = new Deck(new Card("Diamond", 2), new Card("Spade", 4), new Card("Diamond", 3), new Card("Heart", 5));
    Tie tie = new Tie(loser, winner, new Card("Heart", 1), new Card("Diamond", 1), 0);
    tie.resolve();

    Assert.assertEquals(10, winner.size());
    Assert.assertEquals(0, loser.size());
  }

  @Test
  public void rightPlayerShouldWin() {
//    Deck winner = new Deck(2, 3, 4, 6);
//    Deck loser = new Deck(2, 3, 4, 5);
//    Tie tie = new Tie(loser, winner, 1, 1, 0);
//    tie.resolve();
//
//    Assert.assertEquals(10, winner.size());
  }

  @Test
  public void leftPlayerShouldWin() {
//    Deck winner = new Deck(2, 3, 4, 5, 7);
//    Deck loser = new Deck(2, 3, 4, 5, 6);
//    Tie tie = new Tie(winner, loser, 1, 1, 0);
//    tie.resolve();
//
//    Assert.assertEquals(12, winner.size());
  }

  @Test
  public void leftPlayerShouldLoseDueRunsOutOfCards() {
//    Deck winner = new Deck(2, 3, 4, 5, 7);
//    Deck loser = new Deck(2, 3);
//    Tie tie = new Tie(loser, winner, 1, 1, 0);
//    tie.resolve();
//
//    Assert.assertEquals(9, winner.size());
  }

  @Test
  public void rightPlayerShouldLoseDueRunsOutOfCards() {
//    Deck winner = new Deck(2, 3, 4, 5, 7);
//    Deck loser = new Deck(2, 3);
//    Tie tie = new Tie(winner, loser, 1, 1, 0);
//    tie.resolve();
//
//    Assert.assertEquals(9, winner.size());
  }


}
