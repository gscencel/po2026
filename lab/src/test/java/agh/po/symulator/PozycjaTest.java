package agh.po.symulator;

import org.junit.Test;

import static org.junit.Test;
import static org.junit.Assert.*;

@
public class PozycjaTest {
    @Test
    public void przemiesc() {
        assertEquals(11.305846991792919, (new Pozycja(3, 5).przemiesc(100,0.1, new Pozycja(24,51))));
    }
}