package agh.po.symulator;

public abstract class Komponent {
    String producent;
    String model;
    int waga;
    double cena;

    public String getProducent(){
        return producent;
    }

    public String getModel(){
        return model;
    }

    public int getWaga(){
        return waga;
    }

    public double getCena(){
        return cena;
    }
}
