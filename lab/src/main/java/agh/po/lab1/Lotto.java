package agh.po.lab1;

import java.util.ArrayList;
import java.util.Random;

public class Lotto {
    public static void main(String[] args){
        ArrayList<Integer> liczby = new ArrayList<>();
        Random losowa = new Random();

        for (int i=0; i<6; i++){
            int x = losowa.nextInt(1, 50);
            if (!liczby.contains(x)){
                liczby.add(x);
            }
            else{
                i = i-1;
            }
        }

        System.out.println("Wylosowano: " + liczby);
    }
}
