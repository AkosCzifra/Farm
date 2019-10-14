package com.codecool.farm;

import com.codecool.farm.com.codecool.farm.plants.Almond;
import com.codecool.farm.com.codecool.farm.plants.Juniper;
import com.codecool.farm.com.codecool.farm.plants.Spruce;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Farm farm = new Farm();
        Almond a1 = new Almond();
        Almond a2 = new Almond();
        Spruce s1 = new Spruce();
        Spruce s2 = new Spruce();
        Juniper j1 = new Juniper();
        Juniper j2 = new Juniper();
        farm.addAlmondPlant(a1);
        farm.addAlmondPlant(a2);
        farm.addSprucePlant(s1);
        farm.addSprucePlant(s2);
        farm.addJuniperPlant(j1);
        farm.addJuniperPlant(j2);

        for (int i = 0; i < 80; i++) {
            farm.prepareForAlmondProduction();
            farm.prepareForJuniperProduction();
            farm.prepareForSpruceProduction();
            farm.calculateMonthlyTotalProduction();
        }
        System.out.println(farm.getTotalProduction());
    }
}
