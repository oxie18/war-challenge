package war;

import java.util.List;

public class War {

  private String player1Name;
  private String player2Name;
  private Deck deck;
  private int battles;

  public War(String player1Name, String player2Name) {
    this.player1Name = player1Name;
    this.player2Name = player2Name;
    this.deck = new Deck();
    this.deck.shuffle();
  }

  public War(String player1Name, String player2Name, Deck deck) {
    this.player1Name = player1Name;
    this.player2Name = player2Name;
    this.deck = deck;
  }

  public String start() {
    List<Deck> decks = deck.split();
    Deck player1 = decks.get(0);
    Deck player2 = decks.get(1);
    battles = 0;
    while (player1.size() > 0 && player2.size() > 0) {
      Battle battle = new Battle(player1, player2, 0);
      battle.start();
      battles++;
      if (battles % deck.size() == 0) {
        player1.shuffle();
        player2.shuffle();
      }
    }
    return (player1.size() == 0 ? player2Name : player1Name);
  }

  public int getBattles() {
    return battles;
  }
}
