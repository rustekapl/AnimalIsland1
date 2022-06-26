package ru.javarush.aleev.island.entity.organism.animals.herbivores;


import ru.javarush.aleev.island.entity.organism.plants.Plants;
import ru.javarush.aleev.island.parameters.Parameters;

import java.util.List;

public class Boar extends Herbivore{
    public Boar(Parameters parameters) {
        super(parameters);
    }

//    public Boar(String name, String icon, double maxWeight, int maxCount, int maxSpeed, double maxFood) {
//        super(name, icon, maxWeight, maxCount, maxSpeed, maxFood);
//    }

    @Override
    public void eat(List<Plants> plants) {

    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void reproduct() {
        super.reproduct();
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }
}
