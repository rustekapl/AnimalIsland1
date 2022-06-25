package ru.javarush.aleev.island.entity.organism.animals;


import ru.javarush.aleev.island.entity.organism.Organism;


public abstract class Animal extends Organism {
    public Animal(String name, String icon, double maxWeight, int maxCount, int maxSpeed, double maxFood) {
        super(name, icon, maxWeight, maxCount, maxSpeed, maxFood);
    }

    public abstract void move();
//    public abstract void eat();
    public abstract void reproduct();
}
