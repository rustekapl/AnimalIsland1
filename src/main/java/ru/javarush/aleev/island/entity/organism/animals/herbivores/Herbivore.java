package ru.javarush.aleev.island.entity.organism.animals.herbivores;


import ru.javarush.aleev.island.entity.map.Cell;
import ru.javarush.aleev.island.entity.organism.animals.Animal;
import ru.javarush.aleev.island.entity.organism.plants.Plant;
import ru.javarush.aleev.island.entity.organism.plants.Plants;
import ru.javarush.aleev.island.parameters.Parameters;

import java.util.List;


public abstract class Herbivore extends Animal {


    public Herbivore(Parameters parameters) {
        super(parameters);
    }

    //    public Herbivore(String name, String icon, double maxWeight, int maxCount, int maxSpeed, double maxFood) {
//        super(name, icon, maxWeight, maxCount, maxSpeed, maxFood);
//    }
public abstract void eat (List<Plants> plants);

    @Override
    public void move() {

    }

    @Override
    public void reproduct() {

    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }
}
