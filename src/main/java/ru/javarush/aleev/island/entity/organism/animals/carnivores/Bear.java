package ru.javarush.aleev.island.entity.organism.animals.carnivores;


import ru.javarush.aleev.island.entity.organism.animals.herbivores.Herbivore;
import ru.javarush.aleev.island.parameters.Parameters;

import java.util.List;

public class Bear extends Carnivore {

    public Bear(Parameters parameters) {
        super(parameters);
    }


//    public Bear(String name, String icon, double maxWeight, int maxCount, int maxSpeed, double maxFood) {
//        super(name, icon, maxWeight, maxCount, maxSpeed, maxFood);
//    }

    @Override
    public void eat(List<Herbivore> herbivores) {

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
