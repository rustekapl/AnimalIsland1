package ru.javarush.island.aleev.entity.organism.animals.carnivores;


import ru.javarush.island.aleev.annotations.TypeData;
import ru.javarush.island.aleev.entity.organism.animals.herbivores.Herbivore;
import ru.javarush.island.aleev.parameters.Parameters;

import java.util.List;

import static ru.javarush.island.aleev.cotstants.Constants.*;

@TypeData(name="Bear",
        icon =BEAR_ICON,
        maxWeight = MAX_WEIGHT_BEAR,
        maxCount = MAX_COUNT_BEAR,
        maxSpeed = MAX_SPEED_BEAR,
        maxFood = MAX_FOOD_BEAR)
public class Bear extends Carnivore {

    public Bear(Parameters parameters) {
        super(parameters);
    }

//    public Bear(String name, String icon, double weight, double maxWeight, int maxCount, int maxSpeed, double maxFood) {
//        super(name, icon, weight, maxWeight, maxCount, maxSpeed, maxFood);
//    }

    @Override
    public void eat(List<Herbivore> herbivores) {

    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void eat() {

    }

    @Override
    public void reproduct() {
        super.reproduct();
    }


}
