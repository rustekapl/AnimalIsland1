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


public class Cell {


    int rows;
    int cols;

    public Cell(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
    }
    //Делаем сет организмов
    public Map <String, Set<Organism>> residents = new HashMap<>();

//    int countBear;
//    int countWolf;
//    int countBoar;
//    int countHorse;



//    public Map<String, Set<Organism>> getResidents() {
//        Map<String, Set<Organism>> residents = new HashMap<>();
//        //Делаем сет организмов
//
//        //Делаем сет медведей
//        Set<Organism> setBears = new HashSet<>();
//        countBear = Randomizer.get(2, Constants.MAX_COUNT_BEAR);
//        for (int k = 0; k < countBear; k++) {
//            setBears.add(new Bear(new Parameters(Constants.NAME_BEAR, Constants.BEAR_ICON,
//                    Randomizer.get(Constants.MAX_WEIGHT_BEAR - Constants.MAX_FOOD_BEAR, Constants.MAX_WEIGHT_BEAR),
//                    Constants.MAX_WEIGHT_BEAR, Constants.MAX_COUNT_BEAR, Constants.MAX_SPEED_BEAR, Constants.MAX_FOOD_BEAR)));
//        }
//        System.out.println(setBears);
//        residents.put(Bear.class.getSimpleName(), setBears);
//
//        //Делаем сет волков
//        Set<Organism> setWolves = new HashSet<>();
//        countWolf = Randomizer.get(2, Constants.MAX_COUNT_WOLF);
//        for (int k = 0; k < countWolf; k++) {
//            setWolves.add(new Wolf(new Parameters(Constants.NAME_WOLF, Constants.WOLF_ICON,
//                    Randomizer.get(Constants.MAX_WEIGHT_WOLF - Constants.MAX_FOOD_WOLF, Constants.MAX_WEIGHT_WOLF),
//                    Constants.MAX_WEIGHT_WOLF, Constants.MAX_COUNT_WOLF, Constants.MAX_SPEED_WOLF, Constants.MAX_FOOD_WOLF)));
//        }
//        System.out.println(setWolves);
//        residents.put(Wolf.class.getSimpleName(), setWolves);
//
//        //Делаем сет кабанов
//        Set<Organism> setBoars = new HashSet<>();
//        countBoar = Randomizer.get(2, Constants.MAX_COUNT_BOAR);
//        for (int k = 0; k < countBoar; k++) {
//            setBoars.add(new Boar(new Parameters(Constants.NAME_BOAR, Constants.BOAR_ICON,
//                    Randomizer.get(Constants.MAX_WEIGHT_BOAR - Constants.MAX_FOOD_BOAR, Constants.MAX_WEIGHT_BOAR),
//                    Constants.MAX_WEIGHT_BOAR, Constants.MAX_COUNT_BOAR, Constants.MAX_SPEED_BOAR, Constants.MAX_FOOD_BOAR)));
//        }
//        System.out.println(setBoars);
//        residents.put(Boar.class.getSimpleName(), setBoars);
//
//        //Делаем сет лошадей
//        Set<Organism> setHorses = new HashSet<>();
//        countHorse = Randomizer.get(2, Constants.MAX_COUNT_HORSE);
//        for (int k = 0; k < countHorse; k++) {
//            setHorses.add(new Horse(new Parameters(Constants.NAME_HORSE, Constants.HORSE_ICON,
//                    Randomizer.get(Constants.MAX_WEIGHT_HORSE - Constants.MAX_FOOD_HORSE, Constants.MAX_WEIGHT_HORSE),
//                    Constants.MAX_WEIGHT_HORSE, Constants.MAX_COUNT_HORSE, Constants.MAX_SPEED_HORSE, Constants.MAX_FOOD_HORSE)));
//        }
//        System.out.println(setHorses);
//        residents.put(Horse.class.getSimpleName(), setHorses);
//
//        //Делаем сет растений
//        Set<Organism> setPlants = new HashSet<>();
//        for (int k = 0; k < Constants.MAX_COUNT_PLANT; k++) {
//            setPlants.add(new Plant(new Parameters(Constants.NAME_PLANT, Constants.PLANT_ICON,
//                    Constants.MAX_WEIGHT_PLANT, Constants.MAX_WEIGHT_PLANT, Constants.MAX_COUNT_PLANT, 0, 0)));
//
//        }
//        System.out.println(setPlants);
//        residents.put(Plant.class.getSimpleName(), setPlants);
//
//
//        System.out.println("-----------------------------------------------------------------------------");
//
//
//        residents.forEach((key, value) -> System.out.print(key + "=" + value.size() + " "));
//        System.out.println("\n");
//        System.out.println("=============================================================================");
//
//        return residents;

//        //печатаем состав ячейки
//        Map<String, Integer> counter = new HashMap<>();
//        for (Organism organism :
//                set) {
//            int count = counter.getOrDefault(organism.getClass().getSimpleName(), 0) + 1;
//
//            counter.put(organism.getClass().getSimpleName(), count);
//        }
//        System.out.println(set.size() + " : " + counter);
//        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");


//        return set;
//    }


//public static void main(String[] args) {

//
//
//        //Делаем сет организмов
//        Set<Organism> set = new HashSet<>();
//        //Делаем сет медведей
//        int num = Randomizer.get(2, Constants.MAX_COUNT_BEAR);
//        for (int i = 0; i < num; i++) {
//            set.add(new Bear(new Parameters(Constants.NAME_BEAR, Constants.BEAR_ICON,
//                    Randomizer.get(Constants.MAX_WEIGHT_BEAR - Constants.MAX_FOOD_BEAR, Constants.MAX_WEIGHT_BEAR),
//                    Constants.MAX_WEIGHT_BEAR, Constants.MAX_COUNT_BEAR, Constants.MAX_SPEED_BEAR, Constants.MAX_FOOD_BEAR)));
//        }
//
//        System.out.println(set + " : " + set.size());
//
//
//        //Делаем сет волков
//        num = Randomizer.get(2, Constants.MAX_COUNT_WOLF);
//        for (int i = 0; i < num; i++) {
//            set.add(new Wolf(new Parameters(Constants.NAME_WOLF, Constants.WOLF_ICON,
//                    Randomizer.get(Constants.MAX_WEIGHT_WOLF - Constants.MAX_FOOD_WOLF, Constants.MAX_WEIGHT_WOLF),
//                    Constants.MAX_WEIGHT_WOLF, Constants.MAX_COUNT_WOLF, Constants.MAX_SPEED_WOLF, Constants.MAX_FOOD_WOLF)));
//        }
//
//        System.out.println(set + " : " + set.size());
//
//
//
//        //Делаем сет кабанов
//        num = Randomizer.get(2, Constants.MAX_COUNT_BOAR);
//        for (int i = 0; i < num; i++) {
//            set.add(new Boar(new Parameters(Constants.NAME_BOAR, Constants.BOAR_ICON,
//                    Randomizer.get(Constants.MAX_WEIGHT_BOAR - Constants.MAX_FOOD_BOAR, Constants.MAX_WEIGHT_BOAR),
//                    Constants.MAX_WEIGHT_BOAR, Constants.MAX_COUNT_BOAR, Constants.MAX_SPEED_BOAR, Constants.MAX_FOOD_BOAR)));
//        }
//
//        System.out.println(set + " : " + set.size());
//
//
//        //Делаем сет лошадей
//        num = Randomizer.get(2, Constants.MAX_COUNT_HORSE);
//        for (int i = 0; i < num; i++) {
//            set.add(new Horse(new Parameters(Constants.NAME_HORSE, Constants.HORSE_ICON,
//                    Randomizer.get(Constants.MAX_WEIGHT_HORSE - Constants.MAX_FOOD_HORSE, Constants.MAX_WEIGHT_HORSE),
//                    Constants.MAX_WEIGHT_HORSE, Constants.MAX_COUNT_HORSE, Constants.MAX_SPEED_HORSE, Constants.MAX_FOOD_HORSE)));
//        }
//
//        System.out.println(set + " : " + set.size());
//        System.out.println("____________________________________________");
//
//
//        System.out.println("------------------------------------------");
//        //печатаем состав ячейки
//        Map<String, Integer> counter = new HashMap<>();
//        for (Organism organism :
//                set) {
//            int count = counter.getOrDefault(organism.getClass().getSimpleName(), 0) + 1;
//
//            counter.put(organism.getClass().getSimpleName(), count);
//        }
//        System.out.println(counter);
//
//    }

//    List<Herbivore> herbivores = new ArrayList<>();
//    List<Carnivore> carnivores = new ArrayList<>();
//    List<Plants> plants = new ArrayList<>();


//    public void calculate() {

//        for(Map.Entry<OrganismType,Set<Organism>> pair: residents.entrySet()){
//            Set<Organism> organismSet= pair.getValue();
//            for(Organism organism:organismSet){
//                if(organism instanceof Carnivore){
//                    ((Carnivore)organism).eat(residents.get(OrganismType.HORSE));
//                }
//            }
//        }
    // public void getOrganism() {
//        for (int i = 0; i < carnivores.size(); i++) {
//            Carnivore carnivore = carnivores.get(i);
//            carnivore.eat(herbivores);
//            carnivore.reproduct();
//            carnivore.move();
//        }
//        for (int i = 0; i < herbivores.size(); i++) {
//            Herbivore herbivore=herbivores.get(i);
//            herbivore.eat(plants);
//            herbivore.reproduct();
//            herbivore.reproduct();
//        }
//        for (int i = 0; i < plants.size(); i++) {
//            Plants plant = plants.get(i);
//            plant.reproduct();
//        }


//    private final Map<String, Set<Organism>> residents = new HashMap<>() {
//        private void checkNull(Object key) {
//            this.putIfAbsent(key.toString(), new HashSet<>());
//        }
//
//        @Override
//        public Set<Organism> get(Object key) {
//            checkNull(key);
//            return super.get(key);
//        }
//
//        @Override
//        public Set<Organism> put(String key, Set<Organism> value) {
//            checkNull(key);
//            return super.put(key, value);
//        }
//    };

//        @Override
//    public String toString() {
//        return getResidents().values().stream()
//                .filter((list) -> list.size() > 0)
//                .sorted((o1, o2) -> o2.size() - o1.size())
//                .map(set -> set.stream().findAny().get().getLetter())
//                .map(Object::toString)
//                .collect(Collectors.joining());
//    }

//    public int getRows() {
//        return rows;
//    }
//
//    public int getCols() {
//        return cols;
//    }

    //    @Override
//    public String toString() {
//        return " || ";
//    }


    @Override
    public String toString() {
        return "\t|" + rows + "/" + cols + "|\t";
    }


}

