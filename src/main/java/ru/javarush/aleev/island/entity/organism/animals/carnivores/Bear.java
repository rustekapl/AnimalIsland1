package ru.javarush.aleev.island.entity.organism.animals.carnivores;


import ru.javarush.aleev.island.annotations.TypeData;
import ru.javarush.aleev.island.entity.organism.animals.herbivores.Herbivore;

import java.util.List;

import static ru.javarush.aleev.island.cotstants.Constants.*;

@TypeData(name = "Bear",
        icon = BEAR_ICON,
        maxWeight = MAX_WEIGHT_BEAR,
        maxCount = MAX_COUNT_BEAR,
        maxSpeed = MAX_SPEED_BEAR,
        maxFood = MAX_FOOD_BEAR)

public class Bear extends Carnivore {

    public Bear(String name, String icon, double maxWeight, int maxCount, int maxSpeed, double maxFood) {
        super(name, icon, maxWeight, maxCount, maxSpeed, maxFood);
    }

    @Override
    public void eat(List<Herbivore> herbivores) {

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
