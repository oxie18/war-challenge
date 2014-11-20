package war;

// Roxanne Montes: Replaced Integer objects and int return types to Card

import java.security.SecureRandom;
import java.util.*;

public class Deck {

  private final Random random = new SecureRandom();
//  private final List<Integer> cards = new LinkedList<Integer>();
  private final List<Card> cards = new LinkedList<Card>();

  // declare suit String array
  private final String[] suits = {"Heart", "Spade", "Diamond", "Club"};

  public Deck() {
//    for (int i = 0; i < 4; i++) {
//      for (int j = 1; j <= 13; j++) {
//        cards.add(j);
//      }
//    }

      // create Card object for every suit and value
      for (String suit : suits) {
          for (int j = 1; j <= 13; j++) {
              Card card = new Card(suit, j);
              cards.add(card);
          }
      }
  }

//  public Deck(List<Integer> cards) {
//    this.cards.addAll(cards);
//  }

  public Deck(List<Card> cards) {
    this.cards.addAll(cards);
  }

//  public Deck(Integer... cards) {
//    this.cards.addAll(Arrays.asList(cards));
//  }

  public Deck(Card... cards) {
    this.cards.addAll(Arrays.asList(cards));
  }

  public void shuffle() {
    Collections.shuffle(cards, random);
  }

  public List<Deck> split() {
    List<Deck> decks = new ArrayList<Deck>();
    int half = cards.size() / 2;
    int otherHalf = cards.size() - half;
    decks.add(new Deck(cards.subList(0, half)));
    decks.add(new Deck(cards.subList(half, half + otherHalf)));
    return decks;
  }

  public int size() {
    return cards.size();
  }

//  public int drawCard() {
//    return cards.remove(0);
//  }

  public Card drawCard() {
    return cards.remove(0);
  }

//    public int peekCard() {
//    return cards.get(0);
//  }

  public Card peekCard() {
    return cards.get(0);
  }

//  public void addCards(Integer... card) {
//    cards.addAll(Arrays.asList(card));
//  }

  public void addCards(Card... card) {
    cards.addAll(Arrays.asList(card));
  }

}
