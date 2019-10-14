package com.codecool.farm.com.codecool.farm.util;

import java.util.Random;

public class MyRandom {
    public static Random rnd = new Random();

    public static int randomNumberInRange(int max) {
        return rnd.nextInt(max);
    }
}
