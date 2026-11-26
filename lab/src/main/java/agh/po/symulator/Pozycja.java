package agh.po.symulator;

public class Pozycja {
    double x;
    double y;

    Pozycja(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void przemiesc(double dt, double v, Pozycja cel){
        if ((dt>0) && (v>0) && (cel.x != this.x) && (cel.y != this.y)) {
            double odleglosc = Math.sqrt(Math.pow(cel.x - this.x, 2) + Math.pow(cel.y - this.y, 2));
            double dx = v * dt * (cel.x - this.x) / odleglosc;
            double dy = v * dt * (cel.y - this.y) / odleglosc;

            if (odleglosc > (Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2)))){
                this.x += dx;
                this.y += dy;
            }
            else{
                this.x = cel.x;
                this.y = cel.y;
            }
        }
    }

    public String getPozycja(){
        String napis = "Aktualna pozycja to: " + x + ", " + y;
        return napis;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public static void main(String[] args){
        Pozycja polozenie = new Pozycja(0,0);
        polozenie.przemiesc(100, 0.1, new Pozycja(30, 50));
        System.out.println(polozenie.getX());
        System.out.println(polozenie.getY());
    }
}
