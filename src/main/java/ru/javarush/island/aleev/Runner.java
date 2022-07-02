package ru.javarush.island.aleev;


import ru.javarush.island.aleev.entity.map.GameMap;

public class Runner {

    public static void main(String[] args) {
        GameMap gameMap = new GameMap();
        gameMap.init();
        gameMap.fill();
        gameMap.getNextCells();
//        gameMap.print();
        gameMap.printInfo();


    }


}

