package ru.javarush.island.aleev.entity.map;


import ru.javarush.island.aleev.cotstants.OrganismType;
import ru.javarush.island.aleev.entity.organism.Organism;
import ru.javarush.island.aleev.factories.OrganismFactory;
import ru.javarush.island.aleev.parameters.GameParameters;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Cell {


    private final int row;
    private final int col;


//    public Map<Type, Set<Organism>> resident = new HashMap<>();

    public Map<OrganismType, Set<Organism>> resident = new HashMap<>();


    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void life(){
        reproduct();
//        eat();
       move();

    }



    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

//    public List<Cell> getNextCells() {
//        return nextCells;
//    }

//    public void setNextCells(List<Cell> nextCells) {
//        this.nextCells = nextCells;
//    }

//    public Cell getNextCells(int speed) {
//        Cell currentCell = this;
//        for (int i = 0; i < speed; i++) {
//            List<Cell> nextCells = currentCell.getNextCells();
//            int direction = Randomizer.get(0, nextCells.size() - 1);
//            currentCell = nextCells.get(direction);
//        }
//        return currentCell;
//    }

    private void reproduct(){
        Iterator<Map.Entry<OrganismType, Set<Organism>>> iterator = resident.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<OrganismType,Set<Organism>> pair=iterator.next();
            OrganismType organismType = pair.getKey();
            Set<Organism> organismSet = pair.getValue();
            if(organismSet!=null&&organismSet.size()+organismSet.size()/2< GameParameters.getInstance().getParameters().get(organismType).getMaxCount()){
                int newborns = organismSet.size()/2;
                for (int i = 0; i < newborns; i++) {
                    Organism organism = OrganismFactory.getInstance().getPrototype(organismType);
                    organismSet.add(organism);
                }
            } else {
                int newborns = GameParameters.getInstance().getParameters().get(organismType).getMaxCount()-organismSet.size();
                for (int i = 0; i < newborns; i++) {
                    Organism organism = OrganismFactory.getInstance().getPrototype(organismType);
                    organismSet.add(organism);
                }
            }
        }
    }
    
    private void move(){
        for (Map.Entry<OrganismType, Set<Organism>> resident :
                resident.entrySet()) {
            Set<Organism> organismSet = resident.getValue();
            Iterator<Organism> iterator=organismSet.iterator();
            while (iterator.hasNext()){
                Organism organism=iterator.next();
                boolean isMove = organism.move(this);
                if(isMove) iterator.remove();
            }
        }
    }

//    private void eat(){
//        for (Map.Entry<OrganismType, Set<Organism>> pair :
//                resident.entrySet()) {
//            Set<Organism> organisms = pair.getValue();
//            for (Organism organism :
//                    organisms) {
//                if (organism instanceof Carnivore) {
//                    OrganismType[] herbivores = Constants.getHerbivores();
//                    for (int i = 0; i < herbivores.length; i++) {
//                        ((Carnivore)organism).eat(resident.get(herbivores[i]));
//                    }
//                }
//        }
//    }










    public void addOrganismToSet(OrganismType organismType, Organism organism) {
        Set<Organism> organismSet = this.resident.get(organismType);
        organismSet.add(organism);
    }

    public Map<OrganismType, Set<Organism>> getOrganisms() {
        return resident;
    }

    public void setOrganisms(OrganismType organismType, Set<Organism> organisms) {
        this.resident.put(organismType, organisms);
    }

//    @Override
//    public String toString() {
//
//        return resident.toString();
//    }


}

