package ru.javarush.island.aleev.entity.map;


import ru.javarush.island.aleev.cotstants.Constants;
import ru.javarush.island.aleev.entity.organism.Organism;
import ru.javarush.island.aleev.exception.GameException;
import ru.javarush.island.aleev.parameters.GameParameters;
import ru.javarush.island.aleev.parameters.Parameters;
import ru.javarush.island.aleev.utils.Randomizer;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.*;


public class GameMap {




    public static final int rows = Constants.WIDTH_ISLAND;
    public static final int colls = Constants.LENGTH_ISLAND;

    public static Cell[][] cells=new Cell[rows][colls];



    //создаем массив ячеек игрового поля
    public void init() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j] = new Cell(i, j);
            }
        }
    }

    //заполняем ячейки организмами

public void fill(){
    Map<Class<?>,Parameters> gameMap= GameParameters.getParameters();
    Organism organism;
    for(Map.Entry<Class<?>,Parameters> object:gameMap.entrySet()){
        int countInCell = object.getValue().getMaxCount();
        try{
            organism=(Organism) object.getKey().getConstructors()[0].newInstance(object.getValue());
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e){
            throw new GameException("not found Entity constructor",e);
        }
        for(Cell[] cell:cells){
            for (Cell value : cell) {
                Set<Organism> organismSet = new HashSet<>();
                int count = Randomizer.get(2, countInCell);
                for (int j = 0; j < count; j++) {
                    organismSet.add((Organism) organism.clone());
                }
                value.setOrganisms(object.getKey(), organismSet);
            }
        }
    }

}

public void getNextCells(){
    for (Cell[] row :
            cells) {
        for (Cell cell :
                row) {
            List<Cell> nextCells = new ArrayList<>();
            int currentRow = cell.getRow();
            int currentCol = cell.getCol();
            int rowsValue = getRows();
            int collsValue = getCols();
            if (currentRow>=1){
                nextCells.add(cells[currentRow-1][currentCol]);
            }
            if (currentCol >= 1) {
                nextCells.add(cells[currentRow][currentCol - 1]);
            }
            if (currentRow + 1 < rowsValue) {
                nextCells.add(cells[currentRow + 1][currentCol]);
            }
            if (currentCol + 1 < collsValue) {
                nextCells.add(cells[currentRow][currentCol + 1]);
            }
            cell.setNextCells(nextCells);
        }
    }
}

    //Todo FOR testing purpose, can be deleted after
    public void printNextCells() {
        for (Cell[] row : cells) {
            for (Cell cell : row) {
                int currentRow = cell.getRow();
                int currentCol = cell.getCol();
                System.out.print(currentRow + "," + currentCol + "=>");

                List<Cell> nextCells = cell.getNextCells();
                for (Cell nextCell : nextCells) {
                    int nextRow = nextCell.getRow();
                    int nextCol = nextCell.getCol();
                    System.out.print(nextRow + "," + nextCol + "; ");

                }
                System.out.println();
            }
        }
    }


    // вывод на экран карты
//   TODO разобрать
//    public void print() {
//        Map<String, Integer> map = new HashMap<>();
//        for (Cell[] row : cells) {
//            for (Cell cell : row) {
//                System.out.print("|\t");
//                Map<Type, Set<Organism>> organismsMap = cell.getOrganisms();
//                organismsMap.values()
//                        .stream()
//                        .filter(s -> s.size() > 0)
//                        .forEach(s -> map.put(s.stream().findFirst().get().toString(), s.size()));
//                System.out.print(map);
//                System.out.print("|\t");
//            }
//            System.out.println();
//        }
//    }



    public void printInfo() {
        Map<String, Integer> map = new HashMap<>();
        for (Cell[] row : cells) {
            for (Cell cell : row) {
                System.out.print("|\t");
                Map<Type, Set<Organism>> organismsMap = cell.getOrganisms();
                organismsMap.values()
                        .stream()
                        .filter(s -> s.size() > 0)
                        .forEach(s -> map.put(s.stream().findFirst().get().toString(), s.size()));
                System.out.println("\t|" + cell.getRow() + "/" + cell.getCol() + "|\t"+map);
                //System.out.print("|\t");
            }
            System.out.println();
        }
        int totalCount = 0;

        for (Cell[] cell : cells) {
            for (int j = 0; j < cell.length; j++) {
                Map<Type, Set<Organism>> map1 = cell[j].resident;
                for (Set<Organism> value : map1.values()) {
                    for (Organism alive : value) {
                        totalCount++;
                    }
                }
            }
        }
        System.out.println("Total value of Organisms are  " + totalCount);
    }



    public Cell[][] getCells() {
        return cells;
    }

    public int getRows() {
        return cells.length;
    }

    public int getCols() {
        return cells[0].length;
    }

    public Cell returnCellByCoordinates(int row, int coll) {
        return cells[row][coll];
    }

}



