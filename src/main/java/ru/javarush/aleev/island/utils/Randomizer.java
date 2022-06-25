package ru.javarush.aleev.island.utils;

import java.util.concurrent.ThreadLocalRandom;


public class Randomizer {

    private Randomizer() {
    }

    public static int get(int from, int to){

        return ThreadLocalRandom.current().nextInt(from, to);
    }
    public static double get(double from, double to){

        return ThreadLocalRandom.current().nextDouble(from, to);
    }

    public static int get(int max){

        return get(0, max);
    }

    public static boolean isEating(int probability){
        boolean isEating=get(100)<probability;
        return isEating;
    }
}
