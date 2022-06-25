package ru.javarush.aleev.island.entity.organism.animals.carnivores;


import ru.javarush.aleev.island.annotations.TypeData;
import ru.javarush.aleev.island.entity.organism.animals.herbivores.Herbivore;

import static ru.javarush.aleev.island.cotstants.Constants.*;

@TypeData(name = "Wolf",
        icon = WOLF_ICON,
        maxWeight = MAX_WEIGHT_WOLF,
        maxCount = MAX_COUNT_WOLF,
        maxSpeed = MAX_SPEED_WOLF,
        maxFood = MAX_FOOD_WOLF)

public class Wolf extends Carnivore {
    public Wolf(String name, String icon, double maxWeight, int maxCount, int maxSpeed, double maxFood) {
        super(name, icon, maxWeight, maxCount, maxSpeed, maxFood);
    }

    @Override
    public void eat(Herbivore herbivore) {

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
