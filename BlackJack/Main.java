package BlackJack;


public class Main {

    public static void main(String[] args) {

        Blackjack card = new Blackjack();

        System.out.printf("Your first card is %s : %d\n", card.dealCardOne(), card.getCardOneValue());
        System.out.printf("Your second card is %s : %d\n", card.dealCardTwo(), card.getCardTwoValue());
        System.out.printf("Dealer total is: %d\n", card.calcDealerTotal());
        System.out.printf("Result: %s\n", card.declareWinner());

        }
    }

