package ru.javarush.island.aleev.entity.organism.animals;


import ru.javarush.island.aleev.entity.map.Cell;
import ru.javarush.island.aleev.entity.organism.Organism;
import ru.javarush.island.aleev.interfaces.Movable;
import ru.javarush.island.aleev.parameters.Parameters;


public abstract class Animal extends Organism implements Movable {
    public Animal(Parameters parameters) {
        super(parameters);
    }




    @Override
    public void move(Cell currentCell) {
//            int steps = this.getSpeed();
//            Cell target = start.getLastCell(steps);
//            target.addOrganismToSet(this.getClass(), this);
//            start.removeOrganismFromSet(this.getClass(), this);
    }


    public abstract void eat();

    public abstract void reproduct();


}
