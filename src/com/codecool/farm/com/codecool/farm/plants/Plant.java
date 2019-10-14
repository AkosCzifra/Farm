package com.codecool.farm.com.codecool.farm.plants;

public abstract class Plant {
    protected Integer totalProduction = 0;
    private final Integer MONTHLY_GROWTH_NUM = 4;

    public Integer produceFood() {
        return totalProduction;
    }

    public Integer getTotalProduction() {
        return totalProduction;
    }

    public void setTotalProduction(Integer value) {
        totalProduction = value;
    }

    public void changeTotalProduction(Integer value) {
        totalProduction += value;
    }

    public void growMonthlyProduction() {
        changeTotalProduction(MONTHLY_GROWTH_NUM);
    }
}
