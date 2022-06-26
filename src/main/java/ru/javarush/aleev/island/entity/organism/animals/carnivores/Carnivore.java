package ru.javarush.aleev.island.entity.organism.animals.carnivores;


import ru.javarush.aleev.island.entity.organism.animals.Animal;
import ru.javarush.aleev.island.entity.organism.animals.herbivores.Herbivore;
import ru.javarush.aleev.island.parameters.Parameters;

import java.util.List;

public abstract class Carnivore extends Animal {

    public Carnivore(Parameters parameters) {
        super(parameters);
    }

    //    public Carnivore(String name, String icon, double maxWeight, int maxCount, int maxSpeed, double maxFood) {
//        super(name, icon, maxWeight, maxCount, maxSpeed, maxFood);
//    }
public abstract void eat(List<Herbivore> herbivores);


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
