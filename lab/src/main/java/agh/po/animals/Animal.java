package agh.po.animals;

public abstract class Animal {
    String name;
    int legs;

    abstract String getDescription();
    abstract int getLegs();
    abstract void makeSound();
}
