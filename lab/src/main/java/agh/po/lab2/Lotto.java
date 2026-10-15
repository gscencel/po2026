package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class Lotto {
    public static void main(String[] args){

        ArrayList<Integer> liczby = new ArrayList<>();
        Random losowa = new Random();

        for (int i=0; i<6; i++){
            int x = losowa.nextInt(1,50);
            if (liczby.contains(x)){
                i = i-1;
            }
            else{
                liczby.add(x);
            }
        }

        boolean correct = true;
        ArrayList<Integer> typy = new ArrayList<>();
        for (int i=0; i<6; i++){
            int y = Integer.parseInt(args[i]);
            if (!typy.contains(y)) {
                typy.add(y);
            }
            else{
                correct = false;
                break;
            }
        }

        if (correct) {
            System.out.println("Twoje typy to: " + typy);
            System.out.println("Wylosowane liczby to: " + liczby);

            typy.retainAll(liczby);

            System.out.println("Liczba trafień: " + typy.size());
        }
        else {
            System.out.println("Podano błędne liczby. Spróbuj jeszcze raz");
        }
    }
}
