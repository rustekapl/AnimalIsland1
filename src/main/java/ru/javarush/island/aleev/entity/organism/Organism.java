package ru.javarush.island.aleev.entity.organism;


import ru.javarush.island.aleev.exception.GameException;
import ru.javarush.island.aleev.interfaces.Reproductable;
import ru.javarush.island.aleev.parameters.Parameters;


public abstract class Organism implements Cloneable, Reproductable {
    private final String name;
    private final String icon;
    private final double weight;
    private final double maxWeight;
    private final int maxCount;
    private final int maxSpeed;
    private final double maxFood;


    public Organism(Parameters parameters) {
        this.name = parameters.getName();
        this.icon = parameters.getIcon();
        this.weight = parameters.getWeight();
        this.maxWeight = parameters.getMaxWeight();
        this.maxCount = parameters.getMaxCount();
        this.maxSpeed = parameters.getMaxSpeed();
        this.maxFood = parameters.getMaxFood();
    }

//    public Organism(String name, String icon, double weight, double maxWeight, int maxCount, int maxSpeed, double maxFood) {
//        this.name = name;
//        this.icon = icon;
//        this.weight = weight;
//        this.maxWeight = maxWeight;
//        this.maxCount = maxCount;
//        this.maxSpeed = maxSpeed;
//        this.maxFood = maxFood;
//    }

    @Override
    public void reproduct() {

    }

    @Override
    public String toString() {
        return icon;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new GameException("not found Entity constructor",e);
        }
    }

//    public boolean move(Cell currentCell){
//        int targetRow = currentCell.getRow()+ Randomizer.get(0,this.maxSpeed/2);
//        int targetCol = currentCell.getCol()+Randomizer.get(0,this.maxSpeed)/2;
//        boolean isMove = ThreadLocalRandom.current().nextBoolean();
//
//        if(targetRow> Constants.WIDTH_ISLAND){
//            targetRow=(Integer)targetRow%Constants.WIDTH_ISLAND;
//        }
//        if(targetCol> Constants.LENGTH_ISLAND){
//            targetCol=(Integer)targetRow%Constants.WIDTH_ISLAND;
//        }
//
//        if(isMove){
//           GameMap.cells[targetRow][targetCol].resident.get(OrganismType.valueOf(this.getClass().getSimpleName().toUpperCase())).add(this);
//        }
//        return isMove;
//    }


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
