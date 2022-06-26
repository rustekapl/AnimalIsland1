package ru.javarush.aleev.island.entity.map;



import ru.javarush.aleev.island.cotstants.Constants;

import ru.javarush.aleev.island.entity.organism.Organism;
import ru.javarush.aleev.island.entity.organism.animals.carnivores.Bear;
import ru.javarush.aleev.island.entity.organism.animals.carnivores.Wolf;
import ru.javarush.aleev.island.entity.organism.animals.herbivores.Boar;
import ru.javarush.aleev.island.entity.organism.animals.herbivores.Horse;
import ru.javarush.aleev.island.entity.organism.plants.Plant;

import ru.javarush.aleev.island.parameters.Parameters;
import ru.javarush.aleev.island.utils.Randomizer;

import java.util.*;

public class GameMap {

    public static Cell[][] cells = new Cell[2][2];

    //создаем массив ячеек игрового поля
    public void init() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j] = new Cell(i, j);
            }
        }
    }

    //заполняем ячейки организмами
    public void fill() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {

                int countBear;
                int countWolf;
                int countBoar;
                int countHorse;
                //Делаем сет организмов
                Set<Organism> set = new HashSet<>();
                //Делаем сет медведей
                countBear = Randomizer.get(2, Constants.MAX_COUNT_BEAR);
                for (int k = 0; k < countBear; k++) {
                    set.add(new Bear(new Parameters(Constants.NAME_BEAR, Constants.BEAR_ICON,
                            Randomizer.get(Constants.MAX_WEIGHT_BEAR - Constants.MAX_FOOD_BEAR, Constants.MAX_WEIGHT_BEAR),
                            Constants.MAX_WEIGHT_BEAR, Constants.MAX_COUNT_BEAR, Constants.MAX_SPEED_BEAR, Constants.MAX_FOOD_BEAR)));
                }
                cells[i][j].residents.put(Bear.class.getSimpleName(),set);

                //Делаем сет волков
                countWolf = Randomizer.get(2, Constants.MAX_COUNT_WOLF);
                for (int k = 0; k < countWolf; k++) {
                    set.add(new Wolf(new Parameters(Constants.NAME_WOLF, Constants.WOLF_ICON,
                            Randomizer.get(Constants.MAX_WEIGHT_WOLF - Constants.MAX_FOOD_WOLF, Constants.MAX_WEIGHT_WOLF),
                            Constants.MAX_WEIGHT_WOLF, Constants.MAX_COUNT_WOLF, Constants.MAX_SPEED_WOLF, Constants.MAX_FOOD_WOLF)));
                }
                cells[i][j].residents.put(Wolf.class.getSimpleName(),set);

                //Делаем сет кабанов
                countBoar = Randomizer.get(2, Constants.MAX_COUNT_BOAR);
                for (int k = 0; k < countBoar; k++) {
                    set.add(new Boar(new Parameters(Constants.NAME_BOAR, Constants.BOAR_ICON,
                            Randomizer.get(Constants.MAX_WEIGHT_BOAR - Constants.MAX_FOOD_BOAR, Constants.MAX_WEIGHT_BOAR),
                            Constants.MAX_WEIGHT_BOAR, Constants.MAX_COUNT_BOAR, Constants.MAX_SPEED_BOAR, Constants.MAX_FOOD_BOAR)));
                }
                cells[i][j].residents.put(Boar.class.getSimpleName(),set);

                //Делаем сет лошадей
                countHorse = Randomizer.get(2, Constants.MAX_COUNT_HORSE);
                for (int k = 0; k < countHorse; k++) {
                    set.add(new Horse(new Parameters(Constants.NAME_HORSE, Constants.HORSE_ICON,
                            Randomizer.get(Constants.MAX_WEIGHT_HORSE - Constants.MAX_FOOD_HORSE, Constants.MAX_WEIGHT_HORSE),
                            Constants.MAX_WEIGHT_HORSE, Constants.MAX_COUNT_HORSE, Constants.MAX_SPEED_HORSE, Constants.MAX_FOOD_HORSE)));
                }
                cells[i][j].residents.put(Horse.class.getSimpleName(),set);

                //Делаем сет растений
                for (int k = 0; k < Constants.MAX_COUNT_PLANT; k++) {
                    set.add(new Plant(new Parameters(Constants.NAME_PLANT, Constants.PLANT_ICON,
                            Constants.MAX_WEIGHT_PLANT, Constants.MAX_WEIGHT_PLANT, Constants.MAX_COUNT_PLANT, 0, 0)));

                }
                cells[i][j].residents.put(Plant.class.getSimpleName(),set);

                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                System.out.println(set.size() + " : " + set);
                System.out.println("=============================================================================");


                //печатаем состав ячейки
                Map<String, Integer> counter = new HashMap<>();
                for (Organism organism :
                        set) {
                    int count = counter.getOrDefault(organism.getClass().getSimpleName(), 0) + 1;

                    counter.put(organism.getClass().getSimpleName(), count);
                }
                System.out.println(set.size() + " : " + counter);
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");



            }
        }
    }
//                int countBear = 0;
//                int countWolf = 0;
//                int countBoar = 0;
//                int countHorse = 0;
//                //Делаем сет организмов
//                Set<Organism> set = new HashSet<>();
//                //Делаем сет медведей
//                countBear = Randomizer.get(2, Constants.MAX_COUNT_BEAR);
//                for (int k = 0; k < countBear; k++) {
//                    set.add(new Bear(new Parameters(Constants.NAME_BEAR, Constants.BEAR_ICON,
//                            Randomizer.get(Constants.MAX_WEIGHT_BEAR - Constants.MAX_FOOD_BEAR, Constants.MAX_WEIGHT_BEAR),
//                            Constants.MAX_WEIGHT_BEAR, Constants.MAX_COUNT_BEAR, Constants.MAX_SPEED_BEAR, Constants.MAX_FOOD_BEAR)));
//                }
//                cells[i][j].residents.put("Bear",set);
//
//                //Делаем сет волков
//                countWolf = Randomizer.get(2, Constants.MAX_COUNT_WOLF);
//                for (int k = 0; k< countWolf; k++) {
//                    set.add(new Wolf(new Parameters(Constants.NAME_WOLF, Constants.WOLF_ICON,
//                            Randomizer.get(Constants.MAX_WEIGHT_WOLF - Constants.MAX_FOOD_WOLF, Constants.MAX_WEIGHT_WOLF),
//                            Constants.MAX_WEIGHT_WOLF, Constants.MAX_COUNT_WOLF, Constants.MAX_SPEED_WOLF, Constants.MAX_FOOD_WOLF)));
//                }
//                cells[i][j].residents.put("Wolf",set);
//
//                //Делаем сет кабанов
//                countBoar = Randomizer.get(2, Constants.MAX_COUNT_BOAR);
//                for (int k = 0; k < countBoar; k++) {
//                    set.add(new Boar(new Parameters(Constants.NAME_BOAR, Constants.BOAR_ICON,
//                            Randomizer.get(Constants.MAX_WEIGHT_BOAR - Constants.MAX_FOOD_BOAR, Constants.MAX_WEIGHT_BOAR),
//                            Constants.MAX_WEIGHT_BOAR, Constants.MAX_COUNT_BOAR, Constants.MAX_SPEED_BOAR, Constants.MAX_FOOD_BOAR)));
//                }
//                cells[i][j].residents.put("Boar",set);
//
//                //Делаем сет лошадей
//                countHorse = Randomizer.get(2, Constants.MAX_COUNT_HORSE);
//                for (int k = 0; i < countHorse; k++) {
//                    set.add(new Horse(new Parameters(Constants.NAME_HORSE, Constants.HORSE_ICON,
//                            Randomizer.get(Constants.MAX_WEIGHT_HORSE - Constants.MAX_FOOD_HORSE, Constants.MAX_WEIGHT_HORSE),
//                            Constants.MAX_WEIGHT_HORSE, Constants.MAX_COUNT_HORSE, Constants.MAX_SPEED_HORSE, Constants.MAX_FOOD_HORSE)));
//                }
//                cells[i][j].residents.put("Horse",set);
//
//                //Делаем сет растений
//
//                for (int k = 0; i < Constants.MAX_COUNT_PLANT; k++) {
//                    set.add(new Plant(new Parameters(Constants.NAME_PLANT, Constants.PLANT_ICON,
//                            Constants.MAX_WEIGHT_PLANT, Constants.MAX_WEIGHT_PLANT,Constants.MAX_COUNT_PLANT,0,0)));
//
//                }
//                cells[i][j].residents.put("Plant",set);
//
//                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//                System.out.println(set.size() + " : " + set);
//                System.out.println("=============================================================================");
//
//
//                //печатаем состав ячейки
//                Map<String, Integer> counter = new HashMap<>();
//                for (Organism organism :
//                        set) {
//                    int count = counter.getOrDefault(organism.getClass().getSimpleName(), 0) + 1;
//
//                    counter.put(organism.getClass().getSimpleName(), count);
//                }
//                System.out.println(counter);
//                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//
//
//            }
//        }
//    }

    //    public void fill() {
//
//        //Создаем медведя
//        for (int i = 0; i < cells.length; i++) {
//            for (int j = 0; j < cells[i].length; j++) {
//                int num = Randomizer.get(2, Constants.MAX_COUNT_BEAR);
//                Set<Organism> organismSet = new HashSet<>();
//                for (int k = 0; k < num; k++) {
//                    organismSet.add(new Bear(GameParameters.getInstance().getMap().get(OrganismType.BEAR)));
//                }
//                cells[i][j].residents.put(OrganismType.BEAR, organismSet);
//
//
//                //создаем волка
//
//                num = Randomizer.get(2, Constants.MAX_COUNT_WOLF);
//                for (int k = 0; k < num; k++) {
//                    organismSet.add(new Wolf(GameParameters.getInstance().getMap().get(OrganismType.WOLF)));
//                }
//                cells[i][j].residents.put(OrganismType.WOLF, organismSet);
//
//                //создаем кабана
//
//                num = Randomizer.get(2, Constants.MAX_COUNT_BOAR);
//                for (int k = 0; k < num; k++) {
//                    organismSet.add(new Boar(GameParameters.getInstance().getMap().get(OrganismType.BOAR)));
//                }
//                cells[i][j].residents.put(OrganismType.BOAR, organismSet);
//
//                //создаем лошадь
//                num = Randomizer.get(2, Constants.MAX_COUNT_HORSE);
//                for (int k = 0; k < num; k++) {
//                    organismSet.add(new Horse(GameParameters.getInstance().getMap().get(OrganismType.HORSE)));
//                }
//                cells[i][j].residents.put(OrganismType.HORSE, organismSet);
//
//                //создаем траву
//                num = Randomizer.get(Constants.MAX_COUNT_PLANT);
//                for (int k = 0; k < num; k++) {
//                    organismSet.add(new Plant(GameParameters.getInstance().getMap().get(OrganismType.PLANT)));
//                }
//                cells[i][j].residents.put(OrganismType.PLANT, organismSet);
//            }
//        }
//
//    }
//
    // вывод на экран карты
    public void print() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                System.out.print(cells[i][j]);
            }
            System.out.println();
        }
    }

    public void printInfo() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                System.out.print(cells[i][j] + "\t");
                System.out.println(cells[i][j].residents);


//                Map<String, Integer> counter = new HashMap<>();
//                for (Organism organism :
//                        cells[i][j].set) {
//                    int count = counter.getOrDefault(organism.getClass().getSimpleName(), 0) + 1;
//
//                    counter.put(organism.getClass().getSimpleName(), count);
//                }
//                System.out.println(cells[i][j].getCellSet().size() + " : " + cells[i][j].getCellSet());
//                System.out.println("_____________________________________________________________________________");
//                System.out.println(cells[i][j]+""+ counter);
//                System.out.println("=============================================================================");
//                System.out.println();
            }
            System.out.println();
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
