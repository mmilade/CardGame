package com.nology;

import java.util.*;
import java.util.stream.Stream;

import static java.util.Arrays.*;
import static java.util.Collections.shuffle;
import static java.util.Comparator.comparing;

public class CardGame {

    // Heart: u2665 | Club: u2663 | Diamond: u2666 | Black Spade: u2660

    private String gameName;
    private ArrayList<Card> deckOfCards = new ArrayList<Card>();
    private ArrayList<Card> sortedDeckInNumberOrder = new ArrayList<Card>();
    private ArrayList<Card> sortedDeckIntoSuits = new ArrayList<Card>();
    private ArrayList<Card> shuffledDeck = new ArrayList<Card>();
    private final int numberOfCardsInDeck = 13;
    // private final List<String> suits = Arrays.asList("HEART", "CLUB", "DIAMOND", "SPADE");
    private final List<String> suits = asList("\u2665", "\u2663", "\u2666", "\u2660");

    public CardGame(String gameName) {
        this.gameName = gameName;
    }

    public void makeADeckOfCards () {

        for (int value = 2; value < numberOfCardsInDeck + 2; value++) {

            for (String suit : suits) {
                // System.out.println(i + " " + suits.get(x));
                Card newCard = new Card(value, suit);
                deckOfCards.add(newCard);
            }
        }
        System.out.println("A deck of cards is now ready");
//        System.out.println(deckOfCards);
    }

    public void getDeck () {
        System.out.println("Listing of all cards in the deck");
    }

    public void showDeckOfCards () {
        System.out.println("Cards in the current deck: ");
        for (Card card: deckOfCards) {
            System.out.println(
                    "               "
                    + card.getSymbol() + " "
                    + card.getSuit() + " "
                    // + card.getValue()
            );
        }
    }

    public void dealCard () {
        System.out.println(
                "Dealing a card:  " +
                deckOfCards.get(51).getSymbol() + " "
                + deckOfCards.get(51).getSuit());
    }

    public Card getLastCard() {
        return deckOfCards.get(51);
    }

//    public void dealCard () {
//        System.out.println(deckOfCards.get(51));
//    }

//    public Card dealCard () {
//        return deckOfCards.get(51);
//    }

    public void sortDeckInNumberOrder () {
        System.out.println("-------- sortDeckInNumberOrder --------");
        deckOfCards.sort(Comparator.comparing(Card::getValue));
    }

    public void sortDeckIntoSuits () {
        System.out.println("-------- sortDeckIntoSuits --------");

//        return departures
//                .stream()
//                .filter(flight -> flight.getCode().equals(code))
//                .findFirst()
//                .orElse(null);
//        -------
//        works too for sorting by one attribute
//        Collections.sort(deckOfCards, new Comparator<Card>() {
//            @Override
//            public int compare(Card o1, Card o2) {
//                return o1.getSuit().compareTo(o2.getSuit());
//            }
//        });
//        -------
//        System.out.println(deckOfCards.stream().count()); // works for the count

//        why is stream.sort is not working???

//        -------
        deckOfCards.sort(Comparator.comparing(Card::getSuit).thenComparing(Card::getValue)); // sorting by suit then by value

    }


    public void shuffleDeck () {
        Collections.shuffle(deckOfCards);
    }


    @Override
    public String toString() {
        return "CardGame{" +
                "gameName='" + gameName + '\'' +
                ", deckOfCards=" + deckOfCards +
                ", numberOfCardsInDeck=" + numberOfCardsInDeck +
                ", suits=" + suits +
                '}';
    }
}
