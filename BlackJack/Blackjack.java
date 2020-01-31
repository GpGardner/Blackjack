package BlackJack;

import java.util.Random;

public class Blackjack {
    public Random random = new Random();
    public Random random2 = new Random();
    public Random dealer = new Random();
    public Random dealer2 = new Random();


    private int cardOne;
    private int cardTwo;
    private int cardOneValue;
    private int cardTwoValue;
    private int dealerCardValue;
    private int dealerCardValueTwo;

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



    public int getCardOne() {
        return cardOne;
    }


    //Saving for cheaters later
//    public void setCardOne(int cardOne) {
//        this.cardOne = cardOne;
//    }

    public int getCardTwo() {
        return cardTwo;
    }


    //Saving for cheaters later
//    public void setCardTwo(int cardTwo) {
//        this.cardTwo = cardTwo;
//    }

    public int calcCardOne() {
        cardOne = random.nextInt(52) + 1;
        return cardOne;
    }

    public int calcCardTwo() {
        cardTwo = random2.nextInt(52) + 1;
        return cardTwo;
    }

    public int calcDealerTotal() {
        dealerCardValue = dealer.nextInt(11)+1;
        dealerCardValueTwo = dealer2.nextInt(11)+1;
        return dealerCardValue + dealerCardValueTwo;
    }

    public int getCardOneValue() {
        return cardOneValue;
    }

//    public void setCardOneValue(int cardOneValue) {
//        this.cardOneValue = cardOneValue;
//    }

    public int getCardTwoValue() {
        return cardTwoValue;
    }

//    public void setCardTwoValue(int cardTwoValue) {
//        this.cardTwoValue = cardTwoValue;
//    }

    public String dealCardOne() {
        calcCardOne();

        if (cardOne <= 4) {
            cardOneValue = 11;
            return ace;
        } else if (cardOne <= 8) {
            cardOneValue = 2;
            return two;
        } else if (cardOne <= 12) {
            cardOneValue = 3;
            return three;
        } else if (cardOne <= 16) {
            cardOneValue = 4;
            return four;
        } else if (cardOne <= 20) {
            cardOneValue = 5;
            return five;
        } else if (cardOne <= 24) {
            cardOneValue = 6;
            return six;
        } else if (cardOne <= 28) {
            cardOneValue = 7;
            return seven;
        } else if (cardOne <= 32) {
            cardOneValue = 8;
            return eight;
        } else if (cardOne <= 36) {
            cardOneValue = 9;
            return nine;
        } else if (cardOne <= 40) {
            cardOneValue = 10;
            return ten;
        } else if (cardOne <= 44) {
            cardOneValue = 10;
            return jack;
        } else if (cardOne <= 48) {
            cardOneValue = 10;
            return queen;
        } else if (cardOne <= 52) {
            cardOneValue = 10;
            return king;
        } else {
            return issues;
        }

    }

    public String dealCardTwo() {
        calcCardTwo();

        if (cardTwo <= 4) {
            cardTwoValue = 11;
            return ace;
        } else if (cardTwo <= 8) {
            cardTwoValue = 2;
            return two;
        } else if (cardTwo <= 12) {
            cardTwoValue = 3;
            return three;
        } else if (cardTwo <= 16) {
            cardTwoValue = 4;
            return four;
        } else if (cardTwo <= 20) {
            cardTwoValue = 5;
            return five;
        } else if (cardTwo <= 24) {
            cardTwoValue = 6;
            return six;
        } else if (cardTwo <= 28) {
            cardTwoValue = 7;
            return seven;
        } else if (cardTwo <= 32) {
            cardTwoValue = 8;
            return eight;
        } else if (cardTwo <= 36) {
            cardTwoValue = 9;
            return nine;
        } else if (cardTwo <= 40) {
            cardTwoValue = 10;
            return ten;
        } else if (cardTwo <= 44) {
            cardTwoValue = 10;
            return jack;
        } else if (cardTwo <= 48) {
            cardTwoValue = 10;
            return queen;
        } else if (cardTwo <= 52) {
            cardTwoValue = 10;
            return king;
        } else
            return issues;
    }

    public String declareWinner() {
        String winner = "You've won!";
        String loser = "You've... lost";
        String tie = "Wow, you tied";

        if (cardOneValue + cardTwoValue > dealerCardValue + dealerCardValueTwo) {
            return winner;
        } else if (cardOneValue + cardTwoValue < dealerCardValue + dealerCardValueTwo) {
            return loser;
        } else {
            return tie;
        }
    }
}
