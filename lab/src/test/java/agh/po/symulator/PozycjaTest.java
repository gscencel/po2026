package agh.po.symulator;

import org.junit.Test;
import static org.junit.Assert.*;

public class PozycjaTest {
    @Test
    public void przemiesc() {
        Pozycja poz1 = new Pozycja(3,5);
        Pozycja poz2 = new Pozycja(-7, -5);
        Pozycja poz3 = new Pozycja(0, 0);
        poz1.przemiesc(100,0.1, new Pozycja(30, 50));
        poz2.przemiesc(100,0.1, new Pozycja(30, 50));
        poz3.przemiesc(100,0.1, new Pozycja(30, 50));

        assertEquals(8.144957554275265, poz1.getX(), 1e-15);
        assertEquals(13.574929257125442, poz1.getY(), 1e-15);

        assertEquals(-1.4182330768363007, poz2.getX(), 1e-15);
        assertEquals(3.297221102000094, poz2.getY(), 1e-15);

        assertEquals(5.1449575542752655, poz3.getX(), 1e-15);
        assertEquals(8.574929257125442, poz3.getY(), 1e-15);
    }
}