package BlackJack;

import java.util.Random;

public class Blackjack {
    public Random random = new Random();

    private int card;
    private int cardValue;

    private String cardType;
    private String ace = "Ace";
    private String two = "Two";
    private String three = "Three";
    private String four = "Four";
    private String five = "Five";
    private String six = "Six";
    private String seven = "Seven";
    private String eight = "Eight";
    private String nine = "Nine";
    private String ten = "Ten";
    private String jack = "Jack";
    private String queen = "Queen";
    private String king = "King";
    private String issues = "Having Problems";

    public String getCard() {
        dealCard();
        return cardType;
    }


    public int getCardValue() {
        return cardValue;
    }


    public int calcCard() {
        card = random.nextInt(52) + 1;
        return card;
    }

    public void dealCard() {
        calcCard();

        if (card <= 4) {
            cardValue = 11;
            cardType = ace;
        } else if (card <= 8) {
            cardValue = 2;
            cardType = two;
        } else if (card <= 12) {
            cardValue = 3;
            cardType = three;
        } else if (card <= 16) {
            cardValue = 4;
            cardType = four;
        } else if (card <= 20) {
            cardValue = 5;
            cardType = five;
        } else if (card <= 24) {
            cardValue = 6;
            cardType = six;
        } else if (card <= 28) {
            cardValue = 7;
            cardType = seven;
        } else if (card <= 32) {
            cardValue = 8;
            cardType = eight;
        } else if (card <= 36) {
            cardValue = 9;
            cardType = nine;
        } else if (card <= 40) {
            cardValue = 10;
            cardType = ten;
        } else if (card <= 44) {
            cardValue = 10;
            cardType = jack;
        } else if (card <= 48) {
            cardValue = 10;
            cardType = queen;
        } else if (card <= 52) {
            cardValue = 10;
            cardType = king;
        } else {
            cardType = "Unknown";
        }

    }

//    public String declareWinner() {
//        String winner = "You've won!";
//        String loser = "You've... lost";
//        String tie = "Wow, you tied";
//
//        if (cardValue + cardTwoValue > dealerCardValue + dealerCardValueTwo) {
//            return winner;
//        } else if (cardValue + cardTwoValue < dealerCardValue + dealerCardValueTwo) {
//            return loser;
//        } else {
//            return tie;
//        }
//    }
}
