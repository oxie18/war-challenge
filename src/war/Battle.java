package war;

public class Battle {

  private Deck player1;
  private Deck player2;
  private int skip;

  public Battle(Deck player1, Deck player2, int skip) {
    this.player1 = player1;
    this.player2 = player2;
    this.skip = skip;
  }

  public Deck start() {
//    int card1 = player1.drawCard();
//    int card2 = player2.drawCard();

    // Roxanne Montes: create Card objects for the cards drawn
    Card card1 = player1.drawCard();
    Card card2 = player2.drawCard();

    if (skip > 0) {
      return new Tie(player1, player2, card1, card2, skip - 1).resolve();
    }
//    else if (card1 > card2) {
//      player1.addCards(card1, card2);
//      return player1;
//    }
//    else if (card1 < card2) {
//      player2.addCards(card1, card2);
//      return player2;

    // Roxanne Montes: if card1 is a red card (Heart or Diamond) and card2 is a black card (Spade or Club),
    //                 player1 collects cards
    else if (isRedCard(card1) && isBlackCard(card2)) {
        player1.addCards(card1, card2);
        return player1;
    }
    // Roxanne Montes: if both cards is of the same color and card1 is higher than card2,
    //                 player1 collects the cards
    else if (card1.getValue() > card2.getValue()) {
        player1.addCards(card1, card2);
        return player1;
    }
    // Roxanne Montes: if both cards is of the same color and card1 is lower than card2,
    //                 player2 collects the cards
    else if (card1.getValue() < card2.getValue()) {
        player2.addCards(card1, card2);
        return player2;
    } else {
        return new Tie(player1, player2, card1, card2, 3).resolve();
    }
  }

  public boolean isBlackCard(Card card) {
    return (card.getSuit().equals("Club") || card.getSuit().equals("Spade"));
  }

  public boolean isRedCard(Card card) {
    return card.getSuit().equals("Heart") || card.getSuit().equals("Diamond");
  }

}
