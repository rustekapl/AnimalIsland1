package ru.javarush.aleev.island.entity.organism.plants;

import ru.javarush.aleev.island.entity.organism.Organism;
import ru.javarush.aleev.island.interfaces.Reproductable;

public abstract class Plants extends Organism {
    public Plants(String name, String icon, double maxWeight, int maxCount, int maxSpeed, double maxFood) {
        super(name, icon, maxWeight, maxCount, maxSpeed, maxFood);
    }


    public abstract void reproduct();
}
