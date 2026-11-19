package agh.po.symulator;

public class Silnik extends Komponent {
    int maxObroty;
    int obroty;

    Silnik(int maxObr){
        maxObroty = maxObr;
    }

    public void uruchom(){
        obroty = 800;
    }

    public void zatrzymaj(){
        obroty = 0;
    }

    public void zwiekszObroty(){
        if (obroty < maxObroty) {
            obroty = obroty + 100;
        }
    }

    public void zmniejszObroty(){
        if (obroty > 800){
            obroty = obroty - 100;
        }
    }

    public int getObroty(){
        return obroty;
    }

}
