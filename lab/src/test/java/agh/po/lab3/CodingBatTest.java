package agh.po.lab3;

import static org.junit.Assert.*;

public class CodingBatTest {
    CodingBat cb = new CodingBat();

    @org.junit.Test
    public void sleepIn() {
        assertEquals(false, cb.sleepIn(true, false));
        assertEquals(true, cb.sleepIn(false, false));
        assertEquals(true, cb.sleepIn(true, true));
        assertEquals(true, cb.sleepIn(false, true));
    }

    @org.junit.Test
    public void monkeyTrouble() {
        assertEquals(false, cb.monkeyTrouble(false, true));
        assertEquals(true, cb.monkeyTrouble(false,false));
        assertEquals(false, cb.monkeyTrouble(true, false));
        assertEquals(true, cb.monkeyTrouble(true,true));
    }

    @org.junit.Test
    public void countEvens() {
        assertEquals(2, cb.countEvens(new int[]{0,2,1,3,5,7,9}));
        assertEquals(4, cb.countEvens(new int[]{10,15,20,25,30,40}));
        assertEquals(0, cb.countEvens(new int[]{1,1,1,1,7,1}));
    }

    @org.junit.Test
    public void helloName() {
        assertEquals("Hello Alice!", cb.helloName("Alice"));
        assertEquals("Hello xyz!!", cb.helloName("xyz!"));
        assertEquals("Hello Y!", cb.helloName("Y"));
    }
}