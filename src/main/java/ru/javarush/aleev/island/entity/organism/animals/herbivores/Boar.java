package ru.javarush.aleev.island.entity.organism.animals.herbivores;


import ru.javarush.aleev.island.annotations.TypeData;
import ru.javarush.aleev.island.entity.organism.plants.Plant;

import static ru.javarush.aleev.island.cotstants.Constants.*;

@TypeData(name ="Boar",
        icon =BOAR_ICON,
        maxWeight = MAX_WEIGHT_BOAR,
        maxCount = MAX_COUNT_BOAR,
        maxSpeed = MAX_SPEED_BOAR,
        maxFood = MAX_FOOD_BOAR)

public class Boar extends Herbivore{

    public Boar(String name, String icon, double maxWeight, int maxCount, int maxSpeed, double maxFood) {
        super(name, icon, maxWeight, maxCount, maxSpeed, maxFood);
    }

    @Override
    public void eat(Plant plant) {

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
