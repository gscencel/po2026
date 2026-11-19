package agh.po.symulator;

public class Pozycja {
    double x;
    double y;

    void aktualizujPozycje(double deltaX, double deltaY){
        x = x + deltaX;
        y = y + deltaY;
    }

    String getPozycja(){
        String napis = "Aktualna pozycja to: " + x + ", " + y;
        return napis;
    }
}
