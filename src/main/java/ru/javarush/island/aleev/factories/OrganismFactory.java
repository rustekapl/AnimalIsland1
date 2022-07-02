package ru.javarush.island.aleev.factories;

import ru.javarush.island.aleev.cotstants.OrganismType;
import ru.javarush.island.aleev.entity.organism.Organism;
import ru.javarush.island.aleev.entity.organism.animals.carnivores.Bear;
import ru.javarush.island.aleev.entity.organism.animals.carnivores.Wolf;
import ru.javarush.island.aleev.entity.organism.plants.Plant;
import ru.javarush.island.aleev.exception.GameException;
import ru.javarush.island.aleev.parameters.GameParameters;

import static ru.javarush.island.aleev.cotstants.OrganismType.*;

public class OrganismFactory {
    static OrganismFactory organismFactory;

    private OrganismFactory(){}

    public static OrganismFactory getInstance(){
        if(organismFactory==null){
            organismFactory=new OrganismFactory();
        }
        return organismFactory;
    }

    public Organism getNewOrganism(OrganismType organismType){
        Organism organism;
        organism = switch (organismType){

            case WOLF -> new Wolf(GameParameters.getInstance().getParameters().get(WOLF));
            case PLANT -> new Plant(GameParameters.getInstance().getParameters().get(PLANT));
            case BEAR -> new Bear(GameParameters.getInstance().getParameters().get(BEAR));
            case BOAR -> new Boar(GameParameters.getInstance().getParameters().get(BOAR));
            case BOA ->


            default -> throw new GameException("Unexpected value: " + organismType);
        };
        return organism;
    }

}
