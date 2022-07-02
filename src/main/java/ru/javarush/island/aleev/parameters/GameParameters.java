package ru.javarush.island.aleev.parameters;

import ru.javarush.island.aleev.cotstants.Constants;
import ru.javarush.island.aleev.entity.organism.animals.carnivores.Bear;
import ru.javarush.island.aleev.entity.organism.animals.carnivores.Wolf;
import ru.javarush.island.aleev.entity.organism.animals.herbivores.Boar;
import ru.javarush.island.aleev.entity.organism.animals.herbivores.Horse;
import ru.javarush.island.aleev.entity.organism.plants.Plant;

import java.util.HashMap;
import java.util.Map;


public class GameParameters {
//    private Map<OrganismType,Parameters> preferences = new HashMap<>();
//    private static final GameParameters instance = new GameParameters();
//
//    private GameParameters(){initParameters();}
//
//    public void initParameters(){
//        preferences.put(OrganismType.BEAR,new Parameters(Constants.NAME_BEAR,Constants.BEAR_ICON,Constants.MAX_WEIGHT_BEAR,Constants.MAX_WEIGHT_BEAR,Constants.MAX_COUNT_BEAR, Constants.MAX_SPEED_BEAR, Constants.MAX_FOOD_BEAR));
//        preferences.put(OrganismType.WOLF,new Parameters(Constants.NAME_WOLF,Constants.WOLF_ICON,Constants.MAX_WEIGHT_WOLF,Constants.MAX_WEIGHT_WOLF,Constants.MAX_COUNT_WOLF, Constants.MAX_SPEED_WOLF, Constants.MAX_FOOD_WOLF));
//        preferences.put(OrganismType.BOAR,new Parameters(Constants.NAME_BOAR,Constants.BOAR_ICON,Constants.MAX_WEIGHT_BOAR,Constants.MAX_WEIGHT_BOAR,Constants.MAX_COUNT_BOAR, Constants.MAX_SPEED_BOAR, Constants.MAX_FOOD_BOAR));
//        preferences.put(OrganismType.HORSE,new Parameters(Constants.NAME_HORSE,Constants.HORSE_ICON,Constants.MAX_WEIGHT_HORSE,Constants.MAX_WEIGHT_HORSE,Constants.MAX_COUNT_HORSE, Constants.MAX_SPEED_HORSE, Constants.MAX_FOOD_HORSE));
//        preferences.put(OrganismType.PLANT,new Parameters(Constants.NAME_PLANT,Constants.PLANT_ICON,Constants.MAX_WEIGHT_PLANT,Constants.MAX_WEIGHT_PLANT,Constants.MAX_COUNT_PLANT, Constants.MAX_SPEED_PLANT, Constants.MAX_FOOD_PLANT));
//
//    }

    private final Map<Class<?>, Parameters> parameters = new HashMap<>();

    private static final GameParameters instance = new GameParameters();
    private GameParameters(){initParameters();}

    private void initParameters(){
        parameters.put(Bear.class,new Parameters(Constants.NAME_BEAR,Constants.BEAR_ICON,Constants.MAX_WEIGHT_BEAR,Constants.MAX_WEIGHT_BEAR,Constants.MAX_COUNT_BEAR, Constants.MAX_SPEED_BEAR, Constants.MAX_FOOD_BEAR));
        parameters.put(Wolf.class,new Parameters(Constants.NAME_WOLF,Constants.WOLF_ICON,Constants.MAX_WEIGHT_WOLF,Constants.MAX_WEIGHT_WOLF,Constants.MAX_COUNT_WOLF, Constants.MAX_SPEED_WOLF, Constants.MAX_FOOD_WOLF));
        parameters.put(Boar.class,new Parameters(Constants.NAME_BOAR,Constants.BOAR_ICON,Constants.MAX_WEIGHT_BOAR,Constants.MAX_WEIGHT_BOAR,Constants.MAX_COUNT_BOAR, Constants.MAX_SPEED_BOAR, Constants.MAX_FOOD_BOAR));
        parameters.put(Horse.class,new Parameters(Constants.NAME_HORSE,Constants.HORSE_ICON,Constants.MAX_WEIGHT_HORSE,Constants.MAX_WEIGHT_HORSE,Constants.MAX_COUNT_HORSE, Constants.MAX_SPEED_HORSE, Constants.MAX_FOOD_HORSE));
        parameters.put(Plant.class,new Parameters(Constants.NAME_PLANT,Constants.PLANT_ICON,Constants.MAX_WEIGHT_PLANT,Constants.MAX_WEIGHT_PLANT,Constants.MAX_COUNT_PLANT, Constants.MAX_SPEED_PLANT, Constants.MAX_FOOD_PLANT));
    }




    public static Map<Class<?>, Parameters> getParameters() {
        return instance.parameters;
    }

}