package war;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DeckTest {

  @Test
  public void shouldTestDefaultDeckSize() {
    Deck deck = new Deck();
    Assert.assertEquals(52, deck.size());
  }

  @Test
  public void shouldTestInitializedDeck() {
//    Deck deck = new Deck(new ArrayList<Integer>() {
      Deck deck = new Deck(new ArrayList<Card>() {
      {
        add(new Card("Heart", 1));
        add(new Card("Diamond", 2));
        add(new Card("Club", 3));
      }
    });
    Assert.assertEquals(3, deck.size());
  }

  @Test
  public void shouldTestAddVsDrawOrder() {
//    Deck deck = new Deck(new ArrayList<Integer>());
      Deck deck = new Deck(new ArrayList<Card>());
    deck.addCards(new Card("Heart", 1));
    deck.addCards(new Card("Diamond", 2));
    deck.addCards(new Card("Club", 3));
    Assert.assertEquals(1, deck.drawCard().getValue());
    Assert.assertEquals(2, deck.drawCard().getValue());
    Assert.assertEquals(3, deck.drawCard().getValue());
  }

  @Test
  public void shouldSplitTwoEvenly() {
//    Deck deck = new Deck(new ArrayList<Integer>() {
        Deck deck = new Deck(new ArrayList<Card>() {
      {
        add(new Card("Heart", 1));
        add(new Card("Diamond", 2));
      }
    });
    List<Deck> decks = deck.split();
    Assert.assertEquals(1, decks.get(0).size());
    Assert.assertEquals(1, decks.get(1).size());
  }

  @Test
  public void shouldSplit52Evenly() {
    Deck deck = new Deck();
    List<Deck> decks = deck.split();
    Assert.assertEquals(26, decks.get(0).size());
    Assert.assertEquals(26, decks.get(1).size());
  }

  @Test
  public void shouldSplitOddSecondPlayerHigh() {
//    Deck deck = new Deck(new ArrayList<Integer>());
      Deck deck = new Deck(new ArrayList<Card>());
    deck.addCards(new Card("Heart", 1));
    deck.addCards(new Card("Diamond", 2));
    deck.addCards(new Card("Club", 3));
    deck.addCards(new Card("Spade", 4));
    deck.addCards(new Card("Diamond", 5));
    List<Deck> decks = deck.split();
    Assert.assertEquals(2, decks.get(0).size());
    Assert.assertEquals(3, decks.get(1).size());
  }

  @Test
  public void shouldShuffleDeck() {
    Deck deck = new Deck();
    Assert.assertEquals(1, deck.peekCard().getValue());
    for (int i = 0; i < 5; i++) {
      deck.shuffle();
//      if (deck.peekCard() != 1) {
      if (deck.peekCard().getValue() != 1 && !deck.peekCard().getSuit().equals("Heart")) {
        break;
      }
    }
//    Assert.assertFalse(deck.drawCard() == 1 && deck.drawCard() == 2);
      Assert.assertFalse(deck.drawCard().getValue() == 1 && deck.drawCard().getValue() == 2);
  }

}
