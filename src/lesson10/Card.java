package lesson10;

import java.util.Objects;

public class Card {
    //финал ставим потому что создали карту(например валет крести) и она у нас не меняется
    private final int nominal;
    private final int suit;

    public Card(int nominal, String suit) {
        this.nominal = nominal;
        this.suit = Integer.parseInt(suit);
        //this.suit = suit
    }

    public int getNominal() {
        return nominal;
    }

    public int getSuit() {
        return suit;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
       return nominal == card.nominal && suit == card.suit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nominal, suit);
    }

    @Override
    public String toString() {
        return "Карта - " + suit + ", весит " + nominal + "очков";
    }
}
