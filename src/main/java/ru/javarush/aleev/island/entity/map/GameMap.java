package ru.javarush.aleev.island.entity.map;

import annotations.TypeData;
import utils.Randomizer;

public class GameMap {

    public static Cell[][] cells = new Cell[5][5];

    public void setLive(){
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[0].length; j++) {
                int num = Randomizer.get(new TypeData().getClass().);
            }
        }
    }



//    private final Cell[][] cells;
//
//    public GameMap(int rows, int cols){
//        cells=new Cell[rows][cols];
//    }
//
//    public Cell[][] getCells() {
//        return cells;
//    }
//
//    public int getRows(){
//        return cells.length;
//    }
//
//    public int getCols(){
//        return cells[0].length;
//    }

//    public Set<Organism> getAll(){
//        Set<Organism> all = new HashSet<>();
//        for(Cell[] row : cells){
//            for(Cell cell:row){
//                all.addAll(cell.getResidents().values().stream().flatMap(Collection::stream).collect(Collectors.toSet()));
//            }
//        }
//        return all;
//    }
}
