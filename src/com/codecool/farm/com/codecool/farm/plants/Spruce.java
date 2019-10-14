package com.codecool.farm.com.codecool.farm.plants;

import com.codecool.farm.com.codecool.farm.util.MyRandom;

public class Spruce extends EverGreen implements SpecialPlantManager {
    private final Integer SHROOM_RATE = 5;
    private final Integer ROT_RATE = 4;
    private boolean isRotten;

    public Spruce() {
        super.totalProduction = 26;
    }

    @Override
    public void growShroom() {
        if (MyRandom.randomNumberInRange(100) <= SHROOM_RATE)
            changeTotalProduction(15);
    }

    @Override
    public void rot() {
        if (MyRandom.randomNumberInRange(100) <= ROT_RATE) {
            changeTotalProduction(-20);
            isRotten = true;
        }
    }

    public boolean isRotten() {
        return isRotten;
    }

    public void setRotten() {
        isRotten = false;
    }
}
