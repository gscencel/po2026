package agh.po.lab3;

import java.util.Arrays;

public class CodingBat {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == false && vacation == false){
            return true;
        }
        else if (weekday == true && vacation == false){
            return false;
        }
        else if (weekday == false && vacation == true){
            return true;
        }
        return true;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (!aSmile && !bSmile){
            return true;
        }
        if (aSmile && bSmile){
            return true;
        }
        if (!aSmile && bSmile){
            return false;
        }
        return false;
    }

    public int countEvens(int[] nums) {
        int liczba = 0;
        for (int i=0; i< Arrays.stream(nums).count(); i++){
            if (nums[i] % 2 == 0){
                liczba++;
            }
        }
        return liczba;
    }

    public String helloName(String name) {
        String napis = "Hello " + name + "!";
        return napis;
    }

    public static void main(String[] args) {
        CodingBat cb = new CodingBat();
        boolean wynik = cb.sleepIn(true, false);
        boolean malpy = cb.monkeyTrouble(true,false);
        int policz = cb.countEvens(new int[]{5,2,7,8,2,0,4,1});
        String witaj = cb.helloName("Mścisław");
        System.out.println(wynik);
        System.out.println(malpy);
        System.out.println(policz);
        System.out.println(witaj);
    }
}
