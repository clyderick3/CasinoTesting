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

    @Test
    void spinReelsTest1(){
        int runs = 0;
        boolean valueChanged = false;
        int lastValue = SlotsCasino.getColumn1();
        while( !valueChanged || runs++ < 100){
            SlotsCasino.spinReels();
            valueChanged = SlotsCasino.getColumn1() != lastValue;
        }
        Assert.assertTrue(valueChanged);
    }

    @Test
    void spinReelsTest2(){
        int runs = 0;
        boolean valueChanged = false;
        int lastValue = SlotsCasino.getColumn2();
        while( !valueChanged || runs++ < 100){
            SlotsCasino.spinReels();
            valueChanged = SlotsCasino.getColumn2() != lastValue;
        }
        Assert.assertTrue(valueChanged);
    }

    @Test
    void spinReelsTest3(){
        int runs = 0;
        boolean valueChanged = false;
        int lastValue = SlotsCasino.getColumn3();
        while( !valueChanged || runs++ < 100){
            SlotsCasino.spinReels();
            valueChanged = SlotsCasino.getColumn3() != lastValue;
        }
        Assert.assertTrue(valueChanged);
    }

}
