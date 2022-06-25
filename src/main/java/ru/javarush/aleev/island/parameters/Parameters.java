package ru.javarush.aleev.island.parameters;

import ru.javarush.aleev.island.utils.Randomizer;


public class Parameters {
    private final String name;
    private final String icon;
    private final double weight;
    private final double maxWeight;
    private final int maxCount;
    private final int maxSpeed;
    private final double maxFood;

    public Parameters(String name, String icon, double maxWeight, int maxCount, int maxSpeed, double maxFood) {
        this.name = name;
        this.icon = icon;
        this.weight = Randomizer.get((maxWeight-maxFood),maxWeight);
        this.maxWeight = maxWeight;
        this.maxCount = maxCount;
        this.maxSpeed = maxSpeed;
        this.maxFood = maxFood;
    }
}
