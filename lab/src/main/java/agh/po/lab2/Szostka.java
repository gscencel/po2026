package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class Szostka {
    public static void main(String[] args) {

    ArrayList<Integer> liczby = new ArrayList<>();
    Random losowa = new Random();

    for(int i = 0; i<6; i++) {
        int x = losowa.nextInt(1, 50);
        if (liczby.contains(x)) {
            i = i - 1;
        }
        else {
            liczby.add(x);
        }
    }

    int powtorz = 1;
    int licznik = 0;
    while(powtorz == 1){
        ArrayList<Integer> zestaw = new ArrayList<>();

        for(int i = 0; i<6; i++) {
            int x = losowa.nextInt(1, 50);
            if (zestaw.contains(x)) {
                i = i - 1;
            }
            else {
                zestaw.add(x);
            }
        }

        for (int i=0; i<6; i++){
            int y = zestaw.get(i);
            if (liczby.contains(y)){
                powtorz = 0;
            }
            else {
                powtorz = 1;
                break;
            }
        }
        licznik++;
    }

    System.out.println("Wylosowano liczby: " + liczby);
    System.out.println("Trafiono szóstkę po " + licznik + " próbach");
}
}
