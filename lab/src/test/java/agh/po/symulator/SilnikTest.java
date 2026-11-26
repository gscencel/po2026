package agh.po.symulator;

import org.junit.Test;

import static org.junit.Assert.*;

public class SilnikTest {

    @Test
    public void zwiekszObroty() {
        Silnik silnik = new Silnik(6000);
        silnik.uruchom();

        silnik.zwiekszObroty();
        assertEquals(900, silnik.getObroty());

        silnik.zwiekszObroty();
        assertEquals(1000, silnik.getObroty());

        for (int i=0; i<100; i++){
            silnik.zwiekszObroty();
        }
        assertEquals(6000, silnik.getObroty());
    }

    @Test
    public void zmniejszObroty() {
        Silnik silnik = new Silnik(6000);
        silnik.uruchom();

        silnik.zmniejszObroty();
        assertEquals(800, silnik.getObroty());

        for (int i=0; i<100; i++){
            silnik.zwiekszObroty();
        }
        silnik.zmniejszObroty();
        assertEquals(5900, silnik.getObroty());

        for (int i=0; i<10; i++){
            silnik.zmniejszObroty();
        }
        assertEquals(4900, silnik.getObroty());
    }
}