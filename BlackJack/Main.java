package BlackJack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DealCard card = new DealCard();

        String run = "y";

        while (run.equalsIgnoreCase("y")) {
            String card1 = card.getCard();
            int card1Value = card.getCardValue();
            String card2 = card.getCard();
            int card2Value = card.getCardValue();
            String dealerCard1 = card.getCard();
            int dealerCardVal1 = card.getCardValue();
            String dealerCard2 = card.getCard();
            int dealerCardVal2 = card.getCardValue();
            System.out.printf("Your card is %s with a value of : %d\n", card1, card1Value);
            System.out.printf("Your card is %s with a value of : %d\n", card2, card2Value);
            int total = card1Value + card2Value;
            System.out.printf("Your total is %d\n", total);

            System.out.printf("Dealer card is showing %s with a value of : %d\n", dealerCard1, dealerCardVal1);
            System.out.printf("Dealer total is %d\n", dealerCardVal1);
            int dealerTotal = dealerCardVal1 + dealerCardVal2;

            if (total < 21) {
                System.out.print("Would you like to (H)it or (S)tand : ");
                String choice = input.nextLine();
                if (choice.equalsIgnoreCase("h")) {
                    String card3 = card.getCard();
                    int card3Value = card.getCardValue();
                    System.out.printf("Your card is %s with a value of : %d\n", card3, card3Value);
                    total += card3Value;
                    System.out.printf("Your new total is %d\n", total);
                    if (total < 21) {
                        System.out.print("Would you like to (H)it or (S)tand : ");
                        choice = input.nextLine();
                        if (choice.equalsIgnoreCase("h")) {
                            String card4 = card.getCard();
                            int card4Value = card.getCardValue();
                            System.out.printf("Your card is %s with a value of : %d\n", card4, card4Value);
                            total += card4Value;
                            System.out.printf("Your new total is %d\n", total);
                        }
                        if (choice.equalsIgnoreCase("h")) {
                            String card5 = card.getCard();
                            int card5Value = card.getCardValue();
                            System.out.printf("Your card is %s with a value of : %d\n", card5, card5Value);
                            total += card5Value;
                            System.out.printf("Your new total is %d\n", total);
                            System.out.printf("Good Luck!\n");
                        }
                    }
                }
            }

            if(total > 21) {
                System.out.print("Sorry you bust!\n");
            }

            System.out.printf("Dealer flips over a %s, which is equal to %d\n", dealerCard2, dealerCardVal2);
            System.out.printf("Dealer total is %d\n", dealerTotal);


            while (dealerTotal<17){
                String newDealerCard = card.getCard();
                int newDealerCardValue = card.getCardValue();
                System.out.printf("Dealer flips over a %s, which is equal to %d\n", newDealerCard, newDealerCardValue);
                dealerTotal += newDealerCardValue;
                System.out.printf("Dealer total is %d\n", dealerTotal);
            }

            if((total > dealerTotal && total <= 21) || (total < 21 &&  dealerTotal > 21)){
                System.out.printf("YOU'VE WON! You:%d , Dealer:%d\n", total, dealerTotal);
            } else if((dealerTotal > total && dealerTotal <= 21) || (dealerTotal <= 21 && total > 21)) {
                System.out.printf("Sorry you lost! You:%d , Dealer:%d\n", total, dealerTotal);
            } else {
                System.out.print("Looks like you tied");
            }

            System.out.println("Would you like to run again?");
                run = input.nextLine();


            }
        }
    }

