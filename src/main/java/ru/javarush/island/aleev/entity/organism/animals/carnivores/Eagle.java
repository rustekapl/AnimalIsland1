package ru.javarush.island.aleev.entity.organism.animals.carnivores;

import ru.javarush.island.aleev.entity.organism.animals.herbivores.Herbivore;
import ru.javarush.island.aleev.parameters.Parameters;

import java.util.List;

public class Eagle extends Carnivore{
    public Eagle(Parameters parameters) {
        super(parameters);
    }

    @Override
    public void eat(List<Herbivore> herbivores) {

    }

    @Override
    public void eat() {

    }

}
