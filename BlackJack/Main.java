package BlackJack;


public class Main {

    public static void main(String[] args) {

        Blackjack card = new Blackjack();


        System.out.printf("Your first card is %s : %d\n", card.getCardOne(), card.getCardOneValue());
        System.out.printf("Your second card is %s : %d\n", card.getCardTwo(), card.getCardTwoValue());
        System.out.printf("Your third card is %s : %d\n", card.getCardThree(), card.getCardThreeValue());
        System.out.printf("Your fourth card is %s : %d\n", card.getCardFour(), card.getCardFourValue());
        System.out.printf("Your fifth card is %s : %d\n", card.getCardFive(), card.getCardFiveValue());

        }
    }

