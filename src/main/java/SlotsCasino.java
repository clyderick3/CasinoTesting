package src.main.java;

import java.sql.SQLOutput;
import java.util.Random;

public class SlotsCasino {

        private static Random random = new Random();
        private static int column1;
        private static int column2;
        private static int column3;
        private static String[] winners = {"Black Panther", "Iron Man", "Captain America","The Hulk","Thor","Spider-man","Thanos"};
        private static Integer[] payout = {100, 50, 200, 250, 150, 150, 0};



    public static void spinReels(){
        column1 = random.nextInt(winners.length-1);
        column2 = random.nextInt(winners.length-1);
        column3 = random.nextInt(winners.length-1);
    }

    public static void play(){
        System.out.println(getWelcomeMessage());
        spinReels();
        System.out.println(getSlotResultsMessage());
        analyzeResults();
    }

    public static void analyzeResults(){
        boolean isMatched = column1 == column2 && column1 == column3;
        if (isMatched){
            System.out.println(getWinningMessage());
        }
        else{
            System.out.println(getLosingMessage());
        }
    }

    public static Integer determinePayout(){
        return payout[column1];
    }

    public static String getWelcomeMessage() {
       return "Welcome to the Slots game!\nAre you feeling lucky?";
    }

    public static String getWinningMessage() {
        return "You got all " + winners[column1] + ".\n" +
                "Also your payout is: $" + determinePayout() + ".";
    }


    public static String getLosingMessage() {
        return "Guess you weren't as lucky as you thought.\nOr are you? Try again?";
    }

    public static String getSlotResultsMessage(){
        return "| " + winners[column1] + " | " + winners[column2] + " | " + winners[column3] + " |";
    }

    public static Random getRandom() {
        return random;
    }

    public static int getColumn1() {
        return column1;
    }

    public static int getColumn2() {
        return column2;
    }

    public static int getColumn3() {
        return column3;
    }

    public static String[] getWinners() {
        return winners;
    }
}
