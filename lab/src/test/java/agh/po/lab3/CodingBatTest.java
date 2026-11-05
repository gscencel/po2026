package agh.po.lab3;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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

    @Test
    public void mapAB2() {
        Map<String, String> mapa1 = new HashMap<String, String>();
        mapa1.put("a", "aaa");
        mapa1.put("b", "aaa");
        mapa1.put("c", "cake");

        Map<String, String> mapa2 = new HashMap<String, String>();
        mapa2.put("a", "aaa");
        mapa2.put("b", "bbb");

        Map<String, String> mapa3 = new HashMap<String, String>();
        mapa3.put("a", " ");
        mapa3.put("b", " ");
        mapa3.put("d", "abc");

        Map<String, String> mapa11 = new HashMap<String, String>();
        mapa11 = mapa1;
        mapa11.remove("a");

        Map<String, String> mapa12 = new HashMap<String, String>();
        mapa12 = mapa11;
        mapa12.remove("b");

        Map<String, String> mapa31 = new HashMap<String, String>();
        mapa31 = mapa3;
        mapa31.remove("a");

        Map<String, String> mapa32 = new HashMap<String, String>();
        mapa32 = mapa31;
        mapa32.remove("b");

        assertEquals(mapa12, cb.mapAB2(mapa1));
        assertEquals(mapa2, cb.mapAB2(mapa2));
        assertEquals(mapa32, cb.mapAB2(mapa3));
    }

    @Test
    public void wordCount() {
        assertEquals(Map.of("a", 2, "b", 2, "c", 1), cb.wordCount(new String[]{"a", "b", "a", "c", "b"}));
        assertEquals(Map.of("a", 1, "b", 1, "c", 1), cb.wordCount(new String[]{"c", "b", "a"}));
        assertEquals(Map.of("c", 4), cb.wordCount(new String[]{"c", "c", "c", "c"}));
    }
}