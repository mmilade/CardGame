package com.nology;

public class Card {

    private String suit;
    private String symbol;
    private int value;

    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
        // this.value = getCardValue(symbol);
        this.symbol = getCardSymbol(value);
    }

    public int getCardValue (String symbol) {
        int value;
        switch (symbol) {
            case "J":
                value = 11;
                break;
            case "Q":
                value = 12;
                break;
            case "K":
                value = 13;
                break;
            case "A":
                value = 14;
                break;
            default:
                return Integer.parseInt(symbol);
        }
        return value;
    }

    public String getCardSymbol (int value) {
        String symbol;
        switch (value) {
            case 11:
                symbol = "J";
                break;
            case 12:
                symbol = "Q";
                break;
            case 13:
                symbol = "K";
                break;
            case 14:
                symbol = "A";
                break;
            default:
                return String.valueOf(value);
        }
        return symbol;
    }

    public String getSuit() {
        return suit;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Card{" +
                "symbol='" + symbol + '\'' +
                ", suit='" + suit + '\'' +
                ", value=" + value +
                '}';
    }

}
