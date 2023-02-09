package com.gambling;
import java.util.Random;
public class WinOrLoose {
    // betting 100$ for every time
    final static int stake = 100;

    // every bet is of 1$
    final static int bet = 1;

    static int currentBalance = stake;

    public static void main(String[] args) {
        System.out.println("stake: " + stake);
        System.out.println("bet: " + bet);

        // calling the function within the if statement
        if (winOrLoose() == 1) {
            currentBalance += bet;
        } else {
            currentBalance -= bet;
        }
        System.out.println("current Balance available: " + currentBalance);

    }

    // creating a function to decide the gamble result
    public static int winOrLoose() {
        Random r = new Random();
        int result = r.nextInt(2);
        return result;
    }

}
