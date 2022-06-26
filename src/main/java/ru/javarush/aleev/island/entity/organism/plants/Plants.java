package ru.javarush.aleev.island.entity.organism.plants;

import ru.javarush.aleev.island.entity.organism.Organism;
import ru.javarush.aleev.island.interfaces.Reproductable;
import ru.javarush.aleev.island.parameters.Parameters;

public abstract class Plants extends Organism {
    public Plants(Parameters parameters) {
        super(parameters);
    }


//    public Plants(String name, String icon, double maxWeight, int maxCount, int maxSpeed, double maxFood) {
//        super(name, icon, maxWeight, maxCount, maxSpeed, maxFood);
//    }


    public abstract void reproduct();

//    @Override
//    public String toString() {
//        return super.toString();
//    }
}
