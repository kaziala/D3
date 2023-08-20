/**
 * SYST 17796 Project Base code.
 * Author: Al Aqsaa Kazi
 * Date: 19th August, 2023
 */
package com.mycompany.deliverable3;

public class Card {
    private final String suit;
    private final String value;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value + " of " + suit;
    }
}
