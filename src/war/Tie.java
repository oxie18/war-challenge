package war;

// Roxanne Montes: use Card objects instead of int

public class Tie {

  private Deck player1;
  private Deck player2;
//  private int card1;
//  private int card2;
  private Card card1;
  private Card card2;

  private int skip;

//  public Tie(Deck player1, Deck player2, int card1, int card2, int skip) {
  public Tie(Deck player1, Deck player2, Card card1, Card card2, int skip) {
    this.player1 = player1;
    this.player2 = player2;
    this.card1 = card1;
    this.card2 = card2;
    this.skip = skip;
  }

  public Deck resolve() {
    if (player1.size() < 1) {
      player2.addCards(card1, card2);
      return player2;
    } else if (player2.size() < 1) {
      player1.addCards(card1, card2);
      return player1;
    } else {
      Battle tieBattle = new Battle(player1, player2, skip);
      Deck winner = tieBattle.start();
      winner.addCards(card1, card2);
      return winner;
    }
  }

}
