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


//    public final Cell[][] cells = new Cell[2][2];

    public static final int rows = Constants.WIDTH_ISLAND;
    public static final int colls = Constants.LENGTH_ISLAND;

    public static Cell[][] cells=new Cell[rows][colls];

//    public GameMap(int rows, int colls) {
//        this.cells = new Cell[rows][colls];
//    }


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

//    public void fill() {
//        for (Cell[] cell : cells) {
//            for (Cell item : cell) {
//
//
//                //Делаем сет медведей
//
//
//                Set<Organism> setBears = new HashSet<>();
//                countBear = Randomizer.get(2, Constants.MAX_COUNT_BEAR);
//                for (int k = 0; k < countBear; k++) {
//                    setBears.add(new Bear(new Parameters(Constants.NAME_BEAR, Constants.BEAR_ICON,
//                            Randomizer.get(Constants.MAX_WEIGHT_BEAR - Constants.MAX_FOOD_BEAR, Constants.MAX_WEIGHT_BEAR),
//                            Constants.MAX_WEIGHT_BEAR, Constants.MAX_COUNT_BEAR, Constants.MAX_SPEED_BEAR, Constants.MAX_FOOD_BEAR)));
//                }
//                System.out.println(setBears);
//                item.residents.put(Bear.class.getSimpleName(), setBears);
//
//                //Делаем сет волков
//                Set<Organism> setWolves = new HashSet<>();
//                countWolf = Randomizer.get(2, Constants.MAX_COUNT_WOLF);
//                for (int k = 0; k < countWolf; k++) {
//                    setWolves.add(new Wolf(new Parameters(Constants.NAME_WOLF, Constants.WOLF_ICON,
//                            Randomizer.get(Constants.MAX_WEIGHT_WOLF - Constants.MAX_FOOD_WOLF, Constants.MAX_WEIGHT_WOLF),
//                            Constants.MAX_WEIGHT_WOLF, Constants.MAX_COUNT_WOLF, Constants.MAX_SPEED_WOLF, Constants.MAX_FOOD_WOLF)));
//                }
//                System.out.println(setWolves);
//                item.residents.put(Wolf.class.getSimpleName(), setWolves);
//
//                //Делаем сет кабанов
//                Set<Organism> setBoars = new HashSet<>();
//                countBoar = Randomizer.get(2, Constants.MAX_COUNT_BOAR);
//                for (int k = 0; k < countBoar; k++) {
//                    setBoars.add(new Boar(new Parameters(Constants.NAME_BOAR, Constants.BOAR_ICON,
//                            Randomizer.get(Constants.MAX_WEIGHT_BOAR - Constants.MAX_FOOD_BOAR, Constants.MAX_WEIGHT_BOAR),
//                            Constants.MAX_WEIGHT_BOAR, Constants.MAX_COUNT_BOAR, Constants.MAX_SPEED_BOAR, Constants.MAX_FOOD_BOAR)));
//                }
//                System.out.println(setBoars);
//                item.residents.put(Boar.class.getSimpleName(), setBoars);
//
//                //Делаем сет лошадей
//                Set<Organism> setHorses = new HashSet<>();
//                countHorse = Randomizer.get(2, Constants.MAX_COUNT_HORSE);
//                for (int k = 0; k < countHorse; k++) {
//                    setHorses.add(new Horse(new Parameters(Constants.NAME_HORSE, Constants.HORSE_ICON,
//                            Randomizer.get(Constants.MAX_WEIGHT_HORSE - Constants.MAX_FOOD_HORSE, Constants.MAX_WEIGHT_HORSE),
//                            Constants.MAX_WEIGHT_HORSE, Constants.MAX_COUNT_HORSE, Constants.MAX_SPEED_HORSE, Constants.MAX_FOOD_HORSE)));
//                }
//                System.out.println(setHorses);
//                item.residents.put(Horse.class.getSimpleName(), setHorses);
//
//                //Делаем сет растений
//                Set<Organism> setPlants = new HashSet<>();
//                for (int k = 0; k < Constants.MAX_COUNT_PLANT; k++) {
//                    setPlants.add(new Plant(new Parameters(Constants.NAME_PLANT, Constants.PLANT_ICON,
//                            Constants.MAX_WEIGHT_PLANT, Constants.MAX_WEIGHT_PLANT, Constants.MAX_COUNT_PLANT, 0, 0)));
//
//                }
//                System.out.println(setPlants);
//                item.residents.put(Plant.class.getSimpleName(), setPlants);
//
//
//                System.out.println("-----------------------------------------------------------------------------");
//
//
//                item.residents.forEach((key, value) -> System.out.print(key + "=" + value.size() + " "));
//                System.out.println("\n");
//                System.out.println("=============================================================================");
//
//
//
//            }
//        }
//    }

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

//    public void print() {
//        for (Cell[] cell : cells) {
//            for (Cell value : cell) {
//                System.out.print(value);
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
                System.out.print(map);
                System.out.print("|\t");
            }
            System.out.println();
        }
    }

//    public void printInfo() {
//        for (Cell[] cell : cells) {
//            for (Cell item : cell) {
//                System.out.print(item + "\t");
//
//                item.getOrganisms().forEach((key, value) -> System.out.print(key + "=" + value.size() + " "));
//                System.out.println("\n");
//
//            }
//        }
//    }

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



