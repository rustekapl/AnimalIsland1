package ru.javarush.island.aleev.entity.organism.animals.herbivores;



import ru.javarush.island.aleev.entity.organism.Organism;
import ru.javarush.island.aleev.entity.organism.animals.Animal;
import ru.javarush.island.aleev.parameters.Parameters;
import ru.javarush.island.aleev.utils.Randomizer;

import java.util.Iterator;
import java.util.Set;


public abstract class Herbivore extends Animal {


    public Herbivore(Parameters parameters) {
        super(parameters);
    }


    public void eat (Set<Organism> plants){
        int randomNum;
        Iterator<Organism> iterator=plants.iterator();
        while (iterator.hasNext()){
            Organism organism=iterator.next();
            randomNum= Randomizer.get(0,1);
            if(randomNum==1){
                iterator.remove();
            }
        }
    }


    public void move() {

    }

    @Override
    public void reproduct() {

    }


}
