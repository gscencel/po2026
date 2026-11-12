package agh.po.animals;

public class Snake extends Animal{
    int legs = 0;

    public int getLegs(){
        return legs;
    }

    String getDescription(){
        return "Snake";
    }

    void makeSound(){
        System.out.println("Sssssss");
    }
}
