package BlackJack;

import java.util.Random;

public class Blackjack {
    public Random random = new Random();
    public Random random2 = new Random();
    public Random dealer = new Random();
    public Random dealer2 = new Random();


    private int card;
//    private int cardOne;
//    private int cardTwo;
//    private int cardThree;
//    private int cardFour;
//    private int cardFive;
    private int cardValue;
    private int cardOneValue;
    private int cardTwoValue;
    private int cardThreeValue;
    private int cardFourValue;
    private int cardFiveValue;
    private int dealerCardOne;
    private int dealerCardTwo;
    private int dealerCardThree;
    private int dealerCardFour;
    private int dealerCardFive;
    private int dealerCardValueOne;
    private int dealerCardValueTwo;
    private int dealerCardValueThree;
    private int dealerCardValueFour;
    private int dealerCardValueFive;

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

    public int getCard() {
        return card;
    }

    public String getCardOne() {
        dealCard();
        getCardOneValue();
        return cardType;
    }

    public String getCardTwo() {
        dealCard();
        getCardTwoValue();
        return cardType;
    }

    public String getCardThree() {
        dealCard();
        getCardThreeValue();
        return cardType;
    }

    public String getCardFour() {
        dealCard();
        getCardFourValue();
        return cardType;
    }

    public String getCardFive() {
        dealCard();
        getCardFiveValue();
        return cardType;
    }

    public String getDealerCardOne() {
        dealCard();
        getDealerCardValueOne();
        return cardType;
    }

    public String getDealerCardTwo() {
        dealCard();
        getDealerCardValueTwo();
        return cardType;
    }

    public String getDealerCardThree() {
        dealCard();
        getDealerCardValueThree();
        return cardType;
    }

    public String getDealerCardFour() {
        dealCard();
        getDealerCardValueFour();
        return cardType;
    }

    public String getDealerCardFive() {
        dealCard();
        getDealerCardValueFive();
        return cardType;
    }

    public int getCardValue() {
        return cardValue;
    }

    public int getCardOneValue() {
        cardOneValue = cardValue;
        return cardOneValue;
    }

    public int getCardTwoValue() {
        cardTwoValue = cardValue;
        return cardTwoValue;
    }

    public int getCardThreeValue() {
        cardThreeValue = cardValue;
        return cardThreeValue;
    }

    public int getCardFourValue() {
        cardFourValue = cardValue;
        return cardFourValue;
    }

    public int getCardFiveValue() {
        cardFiveValue = cardValue;
        return cardFiveValue;
    }

    public int getDealerCardValueOne() {
        dealerCardValueOne = cardValue;
        return dealerCardValueOne;
    }

    public int getDealerCardValueTwo() {
        dealerCardValueTwo = cardValue;
        return dealerCardValueTwo;
    }

    public int getDealerCardValueThree() {
        dealerCardValueThree = cardValue;
        return dealerCardValueThree;
    }

    public int getDealerCardValueFour() {
        dealerCardValueFour = cardValue;
        return dealerCardValueFour;
    }

    public int getDealerCardValueFive() {
        dealerCardValueFive = cardValue;
        return dealerCardValueFive;
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


    public String declareWinner() {
        String winner = "You've won!";
        String loser = "You've... lost";
        String tie = "Wow, you tied";

        if (cardValue + cardTwoValue > dealerCardValueOne + dealerCardValueTwo) {
            return winner;
        } else if (cardValue + cardTwoValue < dealerCardValueOne + dealerCardValueTwo) {
            return loser;
        } else {
            return tie;
        }
    }
}
