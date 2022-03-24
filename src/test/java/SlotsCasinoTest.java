package src.test.java;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import src.main.java.SlotsCasino;

public class SlotsCasinoTest {

    @Test
    void getWelcomeMessageTest(){
        //Given

        //When

        //Then
        String actual = SlotsCasino.getWelcomeMessage();
        String expected = "Welcome to the Slots game!\nAre you feeling lucky?";
        Assert.assertEquals(expected, actual);
    }
}
