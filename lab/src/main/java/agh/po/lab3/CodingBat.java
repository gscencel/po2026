package agh.po.lab3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
        else if (aSmile && bSmile){
            return true;
        }
        else if (!aSmile && bSmile){
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

    public Map<String, String> mapAB2(Map<String, String> map) {
        if ((map.containsKey("a") && map.containsKey("b")) && (map.get("a") == map.get("b"))){
            map.remove("a");
            map.remove("b");
        }
        return map;
    }

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> policzone = new HashMap<String, Integer>();
        for (int i=0; i < strings.length; i++){
            if (policzone.containsKey(strings[i])){
                int x = policzone.get(strings[i]) + 1;
                policzone.remove(strings[i]);
                policzone.put(strings[i], x);
            }
            else{
                policzone.put(strings[i], 1);
            }
        }
        return policzone;
    }


    public static void main(String[] args) {
        CodingBat cb = new CodingBat();
        boolean wynik = cb.sleepIn(true, false);
        boolean malpy = cb.monkeyTrouble(true,false);
        int policz = cb.countEvens(new int[]{5,2,7,8,2,0,4,1,6});
        String witaj = cb.helloName("Mścisław");
        System.out.println(wynik);
        System.out.println(malpy);
        System.out.println(policz);
        System.out.println(witaj);

        Map<String, String> mapa = new HashMap<String, String>();
        mapa.put("a", "aaa");
        mapa.put("b", "aaa");
        mapa.put("c", "cake");
        System.out.println(mapa);
        System.out.println(cb.mapAB2(mapa));

        System.out.println(cb.wordCount(new String[]{"a", "b", "a", "c", "b"}));
        System.out.println(cb.wordCount(new String[]{"c", "b", "a"}));
        System.out.println(cb.wordCount(new String[]{"c", "c", "c", "c"}));
    }
}
