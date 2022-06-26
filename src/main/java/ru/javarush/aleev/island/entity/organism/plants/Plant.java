package ru.javarush.aleev.island.entity.organism.plants;


import ru.javarush.aleev.island.entity.organism.Organism;
import ru.javarush.aleev.island.parameters.Parameters;

public class Plant extends Plants {
    public Plant(Parameters parameters) {
        super(parameters);
    }


//    public Plant(String name, String icon, double maxWeight, int maxCount, int maxSpeed, double maxFood) {
//        super(name, icon, maxWeight, maxCount, maxSpeed, maxFood);
//    }

    @Override
    public void reproduct() {

    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }
}
