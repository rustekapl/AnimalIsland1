package ru.javarush.aleev.island.entity.organism.animals.herbivores;


import ru.javarush.aleev.island.annotations.TypeData;
import ru.javarush.aleev.island.entity.organism.plants.Plants;

import java.util.List;

import static ru.javarush.aleev.island.cotstants.Constants.*;

@TypeData(name ="Horse",
        icon =HORSE_ICON,
        maxWeight = MAX_WEIGHT_HORSE,
        maxCount = MAX_COUNT_HORSE,
        maxSpeed = MAX_SPEED_HORSE,
        maxFood = MAX_FOOD_HORSE)
public class Horse extends Herbivore {

    public Horse(String name, String icon, double maxWeight, int maxCount, int maxSpeed, double maxFood) {
        super(name, icon, maxWeight, maxCount, maxSpeed, maxFood);
    }

    @Override
    public void eat(List<Plants> plants) {

    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void reproduct() {
        super.reproduct();
    }
}
