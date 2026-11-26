package agh.po.symulator;

public class Samochod {
    Silnik silnik;
    SkrzyniaBiegow skrzynia;
    String nrRejestracyjny;
    String model;
    int vmax;

    Samochod(Silnik silnik, SkrzyniaBiegow skrzynia, String rejestr, String model, int vmax){
        this.silnik = silnik;
        this.skrzynia = skrzynia;
        this.nrRejestracyjny = rejestr;
        this.model = model;
        this.vmax = vmax;
    }

    public void wlacz(){
        silnik.uruchom();
    }

    public void wylacz(){
        silnik.zatrzymaj();
        if (skrzynia.aktualnyBieg == -1){
            skrzynia.zwiekszBieg();
        }
        if (skrzynia.aktualnyBieg > 0){
            while (skrzynia.aktualnyBieg > 0){
                skrzynia.zmniejszBieg();
            }
        }
    }

    public String getNrRejestracyjny(){
        return nrRejestracyjny;
    }

    public String getModel(){
        return model;
    }

    public int getVmax(){
        return vmax;
    }

    public static void main(String[] args){
        Samochod auto = new Samochod(new Silnik(6500), new SkrzyniaBiegow(6, new Sprzeglo()), "KRA1234", "Civic", 195);
        auto.wlacz();
        auto.silnik.zwiekszObroty();
        auto.skrzynia.zwiekszBieg();
        auto.skrzynia.zwiekszBieg();
        auto.skrzynia.zwiekszBieg();
        auto.skrzynia.zmniejszBieg();
        auto.silnik.zmniejszObroty();
        System.out.println(auto.silnik.getObroty());
        System.out.println(auto.skrzynia.getAktualnyBieg());
        System.out.println(auto.getVmax());
        System.out.println(auto.getModel());
        System.out.println(auto.getNrRejestracyjny());


    }
}


