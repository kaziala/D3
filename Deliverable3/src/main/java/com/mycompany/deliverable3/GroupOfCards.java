/**
 * SYST 17796 Project Base code.
 * Author: Al Aqsaa Kazi
 * Date: 19th August, 2023
 */
package com.mycompany.deliverable3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GroupOfCards {

    private final List<Card> cards;

    public GroupOfCards() {
        cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        if (!cards.isEmpty()) {
            return cards.remove(0);
        }
        return null; // No cards left in the deck
    }
}
