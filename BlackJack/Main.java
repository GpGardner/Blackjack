package BlackJack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DealCard card = new DealCard();

        boolean run = true;

        while (run) {
            String card1 = card.getCard();
            int card1Value = card.getCardValue();

            String card2 = card.getCard();
            int card2Value = card.getCardValue();
//            String choice;

            System.out.printf("Your card is %s with a value of : %d\n", card1, card1Value);
            System.out.printf("Your card is %s with a value of : %d\n", card2, card2Value);
            int total = card1Value + card2Value;
            System.out.printf("Your total is %d\n", total);


            System.out.println("Would you like to run again? true/false");
            run = input.nextBoolean();


        }
    }
}

