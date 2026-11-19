package agh.po.symulator;

public class Sprzeglo extends Komponent{
    boolean stanSprzegla;

    Sprzeglo(){
        stanSprzegla = false;
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
