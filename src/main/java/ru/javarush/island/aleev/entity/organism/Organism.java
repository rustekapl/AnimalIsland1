package ru.javarush.island.aleev.entity.organism;


import ru.javarush.island.aleev.cotstants.Constants;
import ru.javarush.island.aleev.cotstants.OrganismType;
import ru.javarush.island.aleev.entity.map.Cell;
import ru.javarush.island.aleev.entity.map.GameMap;
import ru.javarush.island.aleev.exception.GameException;
import ru.javarush.island.aleev.parameters.Parameters;
import ru.javarush.island.aleev.utils.Randomizer;


public abstract class Organism implements Cloneable {
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



//    @Override
//    public void reproduct() {
//
//    }

    public boolean move(Cell curentCell){
        //calculate targetCell
        int targetRow = curentCell.getRow()+Randomizer.get(0,this.maxSpeed);
        int targetCol = curentCell.getCol()+ Randomizer.get(0,this.maxSpeed);
        boolean isMove = false;

        //check if new coordinates out of map
        if(targetRow<0||targetCol<0){
          isMove=false;
        }

        if(targetRow> Constants.WIDTH_ISLAND){
            targetRow=(targetCol%Constants.WIDTH_ISLAND)-1;
        }
        if(targetCol>Constants.LENGTH_ISLAND){
            targetCol=(targetCol%Constants.LENGTH_ISLAND)-1;
        }

        //move Animal
        if(isMove){
            GameMap.cells[targetRow][targetCol].resident.get(OrganismType.valueOf(this.getClass().getSimpleName().toUpperCase())).add(this);
        }

        return isMove;
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
