package ru.javarush.aleev.island.entity.organism;


import ru.javarush.aleev.island.interfaces.Reproductable;
import ru.javarush.aleev.island.parameters.Parameters;
import ru.javarush.aleev.island.utils.Randomizer;


public abstract class Organism implements Reproductable {
    private String name;
    private String icon;
    private double weight;
    private double maxWeight;
    private int maxCount;
    private int maxSpeed;
    private double maxFood;
    //private final String type = this.getClass().getSimpleName();

    public Organism(Parameters parameters) {
        this.name = parameters.getName();
        this.icon = parameters.getIcon();
        this.weight = parameters.getWeight();
        this.maxWeight = parameters.getMaxWeight();
        this.maxCount = parameters.getMaxCount();
        this.maxSpeed = parameters.getMaxSpeed();
        this.maxFood = parameters.getMaxFood();
    }

//    public Organism(String name, String icon, double maxWeight, int maxCount, int maxSpeed, double maxFood) {
//        this.name = name;
//        this.icon = icon;
//        weight = Randomizer.get(maxWeight/2,maxWeight);
//        this.maxWeight = maxWeight;
//        this.maxCount = maxCount;
//        this.maxSpeed = maxSpeed;
//        this.maxFood = maxFood;
//    }
//    private static Class<?>[] TYPES = new Class[];
//    for(int i=0; i<Constants )
//
//    public static Organism[] createOrganism(Class<?> TYPES){
//        Organism[] organisms = new Organism[TYPES.lenght];
//    }


    @Override
    public String toString() {
        return icon;
    }

    public String getName() {
        return name;
    }

    public String getIcon() {
        return icon;
    }

    public double getWeight() {
        return weight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getMaxFood() {
        return maxFood;
    }
}
