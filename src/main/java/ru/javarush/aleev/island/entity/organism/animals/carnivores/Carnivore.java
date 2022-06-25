package ru.javarush.aleev.island.entity.organism.animals.carnivores;


import ru.javarush.aleev.island.entity.organism.animals.Animal;
import ru.javarush.aleev.island.entity.organism.animals.herbivores.Herbivore;

public abstract class Carnivore extends Animal {
    public Carnivore(String name, String icon, double maxWeight, int maxCount, int maxSpeed, double maxFood) {
        super(name, icon, maxWeight, maxCount, maxSpeed, maxFood);
    }
public abstract void eat(Herbivore herbivore);

    @Override
    public void move() {

    }

    @Override
    public void reproduct() {

    }
}
