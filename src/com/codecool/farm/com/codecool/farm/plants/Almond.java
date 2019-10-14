package com.codecool.farm.com.codecool.farm.plants;

import com.codecool.farm.com.codecool.farm.util.MyRandom;

public class Almond extends Plant implements SpecialPlantManager {
    private final Integer MIN_PRODUCTION = 40;
    private final Integer SHROOM_RATE = 8;
    private final Integer ROT_RATE = 13;
    private boolean isRotten;

    public Almond() {
        super.totalProduction = 50;
    }

    private void doubleTotalProduction() {
        setTotalProduction(getTotalProduction() * 2);
    }


    @Override
    public void growShroom() {
        if (MyRandom.randomNumberInRange(100) <= SHROOM_RATE)
            changeTotalProduction(10);
    }

    @Override
    public void rot() {
        if(MyRandom.randomNumberInRange(100) <= ROT_RATE) {
            changeTotalProduction(-18);
            isRotten = true;
            if (getTotalProduction() < MIN_PRODUCTION)
                doubleTotalProduction();
        }
    }

    public boolean isRotten() {
        return isRotten;
    }

    public void setRotten() {
        isRotten = false;
    }
}
