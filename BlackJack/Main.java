package BlackJack;


public class Main {

    public static void main(String[] args) {

        Blackjack card = new Blackjack();


        System.out.printf("Your first card is %s : %d\n", card.getCardOne(), card.getCardOneValue());
        System.out.printf("Your second card is %s : %d\n", card.getCardTwo(), card.getCardTwoValue());

        System.out.printf("The dealer card is %s : %d\n", card.getDealerCardOne(), card.getDealerCardValueOne());
        System.out.printf("The dealer card is %s : %d\n", card.getDealerCardTwo(), card.getDealerCardValueTwo());

        System.out.printf(card.declareWinner());

        }
    }

