package ru.javarush.aleev.island;

import ru.javarush.aleev.island.entity.map.GameMap;

public class Runner {

    public static void main(String[] args) {
        GameMap gameMap = new GameMap();
        gameMap.print();
        gameMap.fill();
        gameMap.print();
    }

}

