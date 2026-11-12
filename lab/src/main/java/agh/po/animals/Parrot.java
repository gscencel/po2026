package agh.po.animals;

public class Parrot extends Animal{
    int legs = 2;

    public int getLegs(){
        return legs;
    }

    String getDescription() {
        return "Parrot";
    }

    void makeSound(){
        System.out.println("Hello there!");
    }
}
