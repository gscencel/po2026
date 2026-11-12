package agh.po.animals;

public class Dog extends Animal{
    int legs = 4;

    public int getLegs(){
        return legs;
    }

    String getDescription() {
        return "Dog";
    }

    void makeSound(){
        System.out.println("Hau hau");
    }
}
