package ru.javarush.aleev.island.entity.organism.plants;


import ru.javarush.aleev.island.entity.organism.Organism;

public class Plant extends Plants {
    public Plant(String name, String icon, double maxWeight, int maxCount, int maxSpeed, double maxFood) {
        super(name, icon, maxWeight, maxCount, maxSpeed, maxFood);
    }

    @Override
    public void reproduct() {

    }
}
