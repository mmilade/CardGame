package com.nology;

import java.util.Scanner;

public class Snap extends CardGame {

    private String player1;
    private String player2;
    private String player;
    private boolean isGameOver = false;
    private boolean isPlayer1Turn = true;
    private Card lastCard;
    private Card currentCard;

    public void updatePlayer() {
        if (isPlayer1Turn) {
            player = "Player One";
        } else {
            player = "Player Two";
        }
    }

    public Snap(String gameName) {
        super(gameName);
    }

    public void shuffleAndDeal() {
        shuffleDeck();
        dealCard();
    }

    public void getCard () {
        updatePlayer();
        System.out.println(player + " Card: ");
        shuffleAndDeal();
        isPlayer1Turn = !isPlayer1Turn;
    }

    public void setGameOver() {
        isGameOver = true;
        System.out.println("Game Over - " + player + " is the winner!");
    }


    public void playGame () {
        System.out.println("Game starting ... ");
        makeADeckOfCards();
        getCard();
//        lastCard = getLastCard();

        while (!isGameOver) {
            System.out.println("Please hit enter to play");
            Scanner getTurnScanner = new Scanner(System.in);
            String getInput = getTurnScanner.nextLine();
            lastCard = getLastCard();
//            System.out.println("this is the last card " + lastCard);

            if (getInput.isEmpty()) {
                getCard();
                currentCard = getLastCard();
            }

//            System.out.println("this is the current card " + currentCard);

            //                isGameOver = true;
            //                System.out.println("Game Over");

            if (currentCard.getSymbol().equals(lastCard.getSymbol())) setGameOver();


        }

    }
}
