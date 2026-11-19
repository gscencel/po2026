package agh.po.symulator;

public class SkrzyniaBiegow extends Komponent{
    int aktualnyBieg;
    int iloscBiegow;
    double aktualnePrzelozenie;

    SkrzyniaBiegow(int liczbaBiegow){
        iloscBiegow = liczbaBiegow;
        aktualnyBieg = 0;
    }

    public void zwiekszBieg(){
        if (aktualnyBieg < iloscBiegow){
            aktualnyBieg = aktualnyBieg + 1;
        }
    }

    public void zmniejszBieg(){
        if (aktualnyBieg > -1){
            aktualnyBieg = aktualnyBieg - 1;
        }
    }

    public int getAktualnyBieg(){
        return aktualnyBieg;
    }

    public double getAktualnePrzelozenie(){
        return aktualnePrzelozenie;
    }


}
