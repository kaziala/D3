/**
 * SYST 17796 Project Base code.
 * Author: Al Aqsaa Kazi
 * Date: 19th August, 2023
 */
package com.mycompany.deliverable3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HighLowCardGame {

    private final ArrayList<Card> deck;
    private int score;

    public HighLowCardGame() {
        deck = new ArrayList<>();
        score = 0;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        initializeDeck();
        Collections.shuffle(deck);

        while (!deck.isEmpty()) {
            Card previousCard = deck.remove(0);
            Card currentCard = deck.remove(0);

            System.out.println("Current Card: " + currentCard);
            System.out.print("Will the next card be (1) Higher or (2) Lower? Enter your choice: ");
            int choice = scanner.nextInt();

            // Compare the cards
            int comparison = compareCards(previousCard, currentCard);

            if ((choice == 1 && comparison == 1) || (choice == 2 && comparison == -1)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect! Your Score: " + score);
                break;
            }
        }
    }
//Declaring Winner and displaying their score
    public void declareWinner() {
        System.out.println("Your Score: " + score);
    }

    private int compareCards(Card card1, Card card2) {
        int value1 = cardValueToInteger(card1.getValue());
        int value2 = cardValueToInteger(card2.getValue());

        if (value1 < value2) {
            return -1; // card1 is lower
        } else if (value1 > value2) {
            return 1;  // card2 is higher
        } else {
            return 0;  // cards are equal
        }
    }

    private void initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (String suit : suits) {
            for (String value : values) {
                deck.add(new Card(suit, value));
            }
        }
    }

    private int cardValueToInteger(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            switch (value) {
                case "Jack":
                    return 11;
                case "Queen":
                    return 12;
                case "King":
                    return 13;
                case "Ace":
                    return 14;
                default:
                    return 0;
            }
        }
    }
//Main class
    public static void main(String[] args) {
        HighLowCardGame game = new HighLowCardGame();
        game.play();
        game.declareWinner();
    }
}
