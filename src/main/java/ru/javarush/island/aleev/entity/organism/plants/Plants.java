package ru.javarush.island.aleev.entity.organism.plants;

import ru.javarush.island.aleev.entity.organism.Organism;
import ru.javarush.island.aleev.parameters.Parameters;

public abstract class Plants extends Organism {
    public Plants(Parameters parameters) {
        super(parameters);
    }

//    public Plants(String name, String icon, double weight, double maxWeight, int maxCount, int maxSpeed, double maxFood) {
//        super(name, icon, weight, maxWeight, maxCount, maxSpeed, maxFood);
//    }

    @Override
    public void reproduct() {
        super.reproduct();
    }
}
