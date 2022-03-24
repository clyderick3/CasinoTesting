package src.main.java;

import java.sql.SQLOutput;
import java.util.Random;

public class SlotsCasino {

        static Random random = new Random();
        static int column1;
        static int column2;
        static int column3;

        String[] Winners = {"Black Panther", "Iron Man", "Captain America","The Hulk","Thor","Spider-man","Thanos"};
//        column1 = random.nextInt(Winners.length-1);
//        column2 = random.nextInt(Winners.length-1);
//        column3 = random.nextInt(Winners.length-1);

//        System.out.println("|" + Winners[column1] + "|" + Winners[column2] + "|" + Winners[column3] + "|");



    public static String getWelcomeMessage() {
       return "Welcome to the Slots game!\nAre you feeling lucky?";
    }

}
