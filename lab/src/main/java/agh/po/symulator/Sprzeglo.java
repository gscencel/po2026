package agh.po.symulator;

public class Sprzeglo extends Komponent{
    boolean stanSprzegla;

    Sprzeglo(){
        this.stanSprzegla = false;
    }

    public void wcisnij(){
        stanSprzegla = true;
    }

    public void zwolnij(){
        stanSprzegla = false;
    }

    public boolean getStan(){
        return stanSprzegla;
    }
}
