package com.codecool.farm;

import com.codecool.farm.com.codecool.farm.plants.Almond;
import com.codecool.farm.com.codecool.farm.plants.Juniper;
import com.codecool.farm.com.codecool.farm.plants.Spruce;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Farm farm = new Farm();

        for (int i = 0; i < 2; i++) {
            farm.addAlmondPlant();
            farm.addJuniperPlant();
            farm.addSprucePlant();
        }

        for (int i = 0; i < 80; i++) {
            farm.prepareForAlmondProduction();
            farm.prepareForJuniperProduction();
            farm.prepareForSpruceProduction();
            farm.calculateMonthlyTotalProduction();
        }
        System.out.println(farm.getTotalProduction());
    }
}
