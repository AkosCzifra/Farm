package com.codecool.farm.com.codecool.farm.plants;

public abstract class EverGreen extends Plant {
    protected Integer plantAge = 0;
    private final Integer PRODUCTION_INCREASED_BY_LEAVES = 8;
    private final Integer MAX_PRODUCTION = 70;

    public void increasePlantAge() {
        plantAge++;
    }

    public void growLeaves() {
        if (plantAge % 5 == 0) {
            changeTotalProduction(PRODUCTION_INCREASED_BY_LEAVES);
            if (totalProduction > MAX_PRODUCTION) {
                setTotalProduction(MAX_PRODUCTION);
                speak();
            }
        }
    }

    public void speak() {
        System.out.println("This plant has reached it's full potential!");
    }

    @Override
    public void changeTotalProduction(Integer value) {
        super.changeTotalProduction(value);
        if (totalProduction > 70) {
            setTotalProduction(70);
//            speak();
        }
        if (totalProduction < 0)
            setTotalProduction(0);
    }
}
