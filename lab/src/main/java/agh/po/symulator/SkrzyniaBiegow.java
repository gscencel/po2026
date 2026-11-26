package agh.po.symulator;

public class SkrzyniaBiegow extends Komponent{
    int aktualnyBieg;
    int iloscBiegow;
    double aktualnePrzelozenie;
    Sprzeglo sprzeglo;

    SkrzyniaBiegow(int liczbaBiegow, Sprzeglo s){
        this.iloscBiegow = liczbaBiegow;
        this.sprzeglo = s;
        aktualnyBieg = 0;
    }

    public void zwiekszBieg(){
        if (aktualnyBieg < iloscBiegow){
            if (!sprzeglo.getStan()){
                throw new IllegalStateException("Sprzęgło musi być wciśnięte!");
            }
            aktualnyBieg += 1;
        }
    }

    public void zmniejszBieg(){
        if (aktualnyBieg > -1){
            if (!sprzeglo.getStan()){
                throw new IllegalStateException("Sprzęgło musi być wciśnięte!");
            }
            aktualnyBieg -= 1;
        }
    }

    public int getAktualnyBieg(){
        return aktualnyBieg;
    }

    public double getAktualnePrzelozenie(){
        return aktualnePrzelozenie;
    }

    public static void main(String[] args){
        SkrzyniaBiegow skrzynia = new SkrzyniaBiegow(4, new Sprzeglo());
        skrzynia.zwiekszBieg();
    }

}
