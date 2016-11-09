package com.company;

/**
 * Created by student4 on 09.11.16.
 */
public class Card {
    Value value;
    Suit suit;

    @Override
    public String toString() {
        return "" + value + " of " + suit;
    }

    public Card(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }
}

