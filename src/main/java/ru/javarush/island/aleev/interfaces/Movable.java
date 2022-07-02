package ru.javarush.island.aleev.interfaces;

import ru.javarush.island.aleev.entity.map.Cell;

@FunctionalInterface
public interface Movable {
    boolean move(Cell currentCell);
}
