package ru.javarush.island.aleev.entity.map;


import ru.javarush.island.aleev.entity.organism.Organism;

import java.lang.reflect.Type;
import java.util.*;

public class Cell {


    private final int row;
    private final int col;

    private List<Cell> nextCells;
    public Map<Type, Set<Organism>> resident = new HashMap<>();


    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void life(){
        reproduct();
        //eat();
       // move();

    }



    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public List<Cell> getNextCells() {
        return nextCells;
    }

    public void setNextCells(List<Cell> nextCells) {
        this.nextCells = nextCells;
    }

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
        Iterator<Map.Entry<Type, Set<Organism>>> iterator = resident.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Type,Set<Organism>> pair=iterator.next();
            Organism organism = (Organism) pair.getKey();
            Set<Organism> organisms = pair.getValue();
            if(organisms!=null){
                int newborns = organisms.size()/2;
                for (int i = 0; i < newborns; i++) {
                    organisms.add((Organism) organism.clone());
                }
            }
        }
    }





    //TODO safely remove from Set
//    public boolean remove(Organism organism) {
//        String simpleName = organism.getClass().getSimpleName();
//        if (resident.containsKey(simpleName)) {
//            resident.get(simpleName).remove(organism);
//            return true;
//        }
//        return false;
//    }
//    public void removeOrganism(Type type, Organism organism) {
//        Set<Organism> organismSet = this.resident.get(type);
//        organismSet.remove(organism);
//    }




//    public void addOrganismToSet(Type type, Organism organism) {
//        Set<Organism> organismSet = this.resident.get(type);
//        organismSet.add(organism);
//    }

    public Map<Type, Set<Organism>> getOrganisms() {
        return resident;
    }

    public void setOrganisms(Type type, Set<Organism> organisms) {
        this.resident.put(type, organisms);
    }

    @Override
    public String toString() {

        return resident.toString();
    }


}

