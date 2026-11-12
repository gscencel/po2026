package agh.po.animals;

import java.util.ArrayList;
import java.util.Random;

public class Zoo {
    public static int countLegs(ArrayList<Animal> list, int length){
        int suma = 0;
        for (int i=0; i<length; i++){
            suma += list.get(i).getLegs();
        }
        return suma;
    }

    public static void main(String[] args){
        ArrayList<Animal> list = new ArrayList<Animal>();
        Random losowa = new Random();

        for (int i=0; i<100; i++){
            int x = losowa.nextInt(1, 4);
            if (x == 1){
                Parrot papuga = new Parrot();
                list.add(papuga);
            }
            else if (x == 2) {
                Dog pies = new Dog();
                list.add(pies);
            }
            else if (x == 3){
                Snake waz = new Snake();
                list.add(waz);
            }
        }

        int l = list.size();
        System.out.println("Liczba nóg: " + countLegs(list, l));

        for (int i=0; i<l; i++){
            list.get(i).makeSound();
        }
    }
}
