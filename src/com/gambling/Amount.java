package com.gambling;
import java.util.Random;
public class Amount {
    // betting 100$ for every time
    final static int stake = 100;

    // every bet is of 1$
    final static int bet = 1;

    public static void main(String[] args) {

        // counter for number of days
        int numOfDaysGambled = 0;

        // counter for calculating the total amount won
        int totalAmountWon = 0;

        // counter for calculating the total amount lost
        int totalAmountLost = 0;

        // the amount gained or lost after every day gamble
        int totalBalance = 0;

        // calculating the number of days
        while (numOfDaysGambled < 30) {

            // counting the number of days
            numOfDaysGambled++;

            // calculate the amount per
            int currentBalance = stake;

            // calculating when to stop in case of winning
            int winPrecentageAmount = stake + (stake * 50 / 100);

            // calculating when to stop in case of loosing
            int lostPrecentageAmount = stake - (stake * 50 / 100);

            // comparing to win percentage or loss percentage with every gamble
            int winPresentageAmount = 0;
            int currentBalence = 0;
            int lostPresentageAmount = 0;
            while (winPresentageAmount > currentBalence && currentBalence > lostPresentageAmount) {

                // calling the function within the if statement
                if (winOrLoose() == 1) {
                    currentBalance += bet;
                } else {
                    currentBalance -= bet;
                }

            }

            if (currentBalance == winPresentageAmount) {
                totalBalance += 100 + currentBalance;
                totalAmountWon += 50;
            } else {
                totalBalance += currentBalance;
                totalAmountLost += 50;
            }

            // displaying the won and lost ammount after 20 days
            if (numOfDaysGambled == 20) {
                System.out.println("Total amount won after 20 days: " + totalAmountWon);
                System.out.println("Total amount lost after 20 days: " + totalAmountLost);
            }

        }

        // printing the stake, bet and result after 30 day gamble
        System.out.println("stake: " + stake);
        System.out.println("bet: " + bet);
        System.out.println("current Balance available: " + totalBalance);

    }

    // creating a function to decide the gamble result
    public static int winOrLoose() {
        Random r = new Random();
        int result = r.nextInt(2);
        return result;
    }

}
