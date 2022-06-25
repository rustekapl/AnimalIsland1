package ru.javarush.aleev.island.entity.organism.animals.herbivores;


import ru.javarush.aleev.island.entity.map.Cell;
import ru.javarush.aleev.island.entity.organism.animals.Animal;
import ru.javarush.aleev.island.entity.organism.plants.Plant;


public abstract class Herbivore extends Animal {
    public Herbivore(String name, String icon, double maxWeight, int maxCount, int maxSpeed, double maxFood) {
        super(name, icon, maxWeight, maxCount, maxSpeed, maxFood);
    }
public abstract void eat (Plant plant);

    @Override
    public void move() {

    }

    @Override
    public void reproduct() {

    }
}
