package ru.javarush.aleev.island.entity.organism.animals.carnivores;


import ru.javarush.aleev.island.entity.organism.animals.Animal;
import ru.javarush.aleev.island.entity.organism.animals.herbivores.Herbivore;

import java.util.List;

public abstract class Carnivore extends Animal {
    public Carnivore(String name, String icon, double maxWeight, int maxCount, int maxSpeed, double maxFood) {
        super(name, icon, maxWeight, maxCount, maxSpeed, maxFood);
    }
public abstract void eat(List<Herbivore> herbivores);

    @Override
    public void move() {

    }

    @Override
    public void reproduct() {

    }
}
