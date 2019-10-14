package com.codecool.farm;

import com.codecool.farm.com.codecool.farm.plants.Almond;
import com.codecool.farm.com.codecool.farm.plants.Juniper;
import com.codecool.farm.com.codecool.farm.plants.Spruce;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    private List<Almond> almondPlants = new ArrayList<>();
    private List<Juniper> juniperPlants = new ArrayList<>();
    private List<Spruce> sprucePlants = new ArrayList<>();
    private Integer totalProduction = 0;
    private boolean isPlantationRotting = false;

    public void prepareForAlmondProduction() {
        for (Almond almondPlant : almondPlants) {
            almondPlant.setRotten();
            almondPlant.growMonthlyProduction();
            almondPlant.growShroom();
            almondPlant.rot();
            if (almondPlant.isRotten())
                isPlantationRotting = true;
        }
    }

    public void prepareForSpruceProduction() {
        for (Spruce sprucePlant : sprucePlants) {
            sprucePlant.setRotten();
            sprucePlant.growMonthlyProduction();
            sprucePlant.increasePlantAge();
            sprucePlant.growLeaves();
            sprucePlant.growShroom();
            sprucePlant.rot();
            if (sprucePlant.isRotten())
                isPlantationRotting = true;
        }
    }

    public void prepareForJuniperProduction() {
        for (Juniper juniperPlant : juniperPlants) {
            juniperPlant.growMonthlyProduction();
            juniperPlant.increasePlantAge();
            juniperPlant.growLeaves();
        }
    }

    public void calculateMonthlyTotalProduction() {
        if (!isPlantationRotting) {
            for (Almond almondPlant : almondPlants) {
                totalProduction += almondPlant.getTotalProduction();
            }
            for (Juniper juniperPlant : juniperPlants) {
                totalProduction += juniperPlant.getTotalProduction();
            }
            for (Spruce sprucePlant : sprucePlants) {
                totalProduction += sprucePlant.getTotalProduction();
            }
        } else
            isPlantationRotting = false;
    }

    public Integer getTotalProduction() {
        return totalProduction;
    }

    public List<Almond> getAlmondPlants() {
        return almondPlants;
    }

    public void addAlmondPlant() {
        almondPlants.add(new Almond());
    }

    public List<Juniper> getJuniperPlants() {
        return juniperPlants;
    }

    public void addJuniperPlant() {
        juniperPlants.add(new Juniper());
    }

    public List<Spruce> getSprucePlants() {
        return sprucePlants;
    }

    public void addSprucePlant() {
        sprucePlants.add(new Spruce());
    }
}
