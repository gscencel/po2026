package agh.po.symulator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SkrzyniaBiegowTest {

    @Test
    public void zwiekszBieg() {
        Sprzeglo sprzeglo = new Sprzeglo();
        SkrzyniaBiegow skrzynia = new SkrzyniaBiegow(4, sprzeglo);
        sprzeglo.wcisnij();

        skrzynia.zwiekszBieg();
        assertEquals(1, skrzynia.getAktualnyBieg());

        skrzynia.zwiekszBieg();
        assertEquals(2, skrzynia.getAktualnyBieg());

        skrzynia.zwiekszBieg();
        skrzynia.zwiekszBieg();
        skrzynia.zwiekszBieg();
        skrzynia.zwiekszBieg();
        assertEquals(4, skrzynia.getAktualnyBieg());
    }

    @Test
    public void zmniejszBieg() {
        Sprzeglo sprzeglo = new Sprzeglo();
        SkrzyniaBiegow skrzynia = new SkrzyniaBiegow(4, sprzeglo);
        sprzeglo.wcisnij();

        skrzynia.zmniejszBieg();
        assertEquals(-1, skrzynia.getAktualnyBieg());

        skrzynia.zmniejszBieg();
        skrzynia.zmniejszBieg();
        assertEquals(-1, skrzynia.getAktualnyBieg());

        for (int i=0; i<5; i++){
            skrzynia.zwiekszBieg();
        }
        skrzynia.zmniejszBieg();
        assertEquals(3, skrzynia.getAktualnyBieg());
    }
}