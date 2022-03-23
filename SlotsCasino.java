import java.sql.SQLOutput;
import java.util.Random;

public class SlotsCasino {
    public static void main (String[] args){
        Random random = new Random();

        int column1;
        int column2;
        int column3;

        System.out.println("Welcome to the Slots game!\nAre you feeling lucky?");
        String[] Winners = {"Black Panther", "Iron Man", "Captain America","The Hulk","Thor","Spider-man","Thanos"};
        column1 = random.nextInt(Winners.length-1);
        column2 = random.nextInt(Winners.length-1);
        column3 = random.nextInt(Winners.length-1);

        System.out.println("|" + Winners[column1] + "|" + Winners[column2] + "|" + Winners[column3] + "|");

    }

    public void play(){

    }

}
