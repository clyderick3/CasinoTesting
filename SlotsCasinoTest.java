import org.junit.Assert;
import org.junit.Test;
import java.util.Random;

class SlotsCasinoTest {

    @Test
    void slotGameTest () {
        //Given
        Random random = new Random();

        int column1;
        int column2;
        int column3;
        String[] Winners = {"Black Panther", "Iron Man", "Captain America","The Hulk","Thor","Spider-man","Thanos"};
        //When
        column1 = random.nextInt(Winners.length-1);
        column2 = random.nextInt(Winners.length-1);
        column3 = random.nextInt(Winners.length-1);
        //Then
        Assert.assertTrue(column1 == random.nextInt(Winners.length-1));
        Assert.assertTrue(column2 == random.nextInt(Winners.length-1));
        Assert.assertTrue(column3 == random.nextInt(Winners.length-1));
    }


}