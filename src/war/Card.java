package war;

/**
 * Created by roxannemontes on 14-11-06.
 */
public class Card {
    private String suit;
    private int value;

    public Card() {}

    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
