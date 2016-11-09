package com.company;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by student4 on 09.11.16.
 */
public class Deck extends LinkedList<Card> {
    public Deck() {
        super();
        for (Suit s: Suit.values()){
            for (Value v: Value.values()) {
                this.add(new Card(v, s));
            }
        }
        Collections.shuffle(this);
    }


}
