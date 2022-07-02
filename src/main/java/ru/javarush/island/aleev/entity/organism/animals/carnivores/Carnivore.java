package ru.javarush.island.aleev.entity.organism.animals.carnivores;


import ru.javarush.island.aleev.entity.organism.animals.Animal;
import ru.javarush.island.aleev.entity.organism.animals.herbivores.Herbivore;
import ru.javarush.island.aleev.parameters.Parameters;

import java.util.List;

public abstract class Carnivore extends Animal {

    public Carnivore(Parameters parameters) {
        super(parameters);
    }

//    public Carnivore(String name, String icon, double weight, double maxWeight, int maxCount, int maxSpeed, double maxFood) {
//        super(name, icon, weight, maxWeight, maxCount, maxSpeed, maxFood);
//    }

    public abstract void eat(List<Herbivore> herbivores);


    public void move() {

    }

    @Override
    public void reproduct() {

    }

}
