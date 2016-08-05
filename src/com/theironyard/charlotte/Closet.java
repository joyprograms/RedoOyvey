package com.theironyard.charlotte;

import javax.print.DocFlavor;

/**
 * Created by guest on 8/4/16.
 */
public class Closet {
    String typeOfClothes;
    int numberOfClothes;
    boolean areTheyInGoodCondition;

    public String getTypeOfClothes() {
        return typeOfClothes;
    }

    public Closet(String typeOfClothes) {
        this.typeOfClothes = typeOfClothes;
    }

    public void setTypeOfClothes(String typeOfClothes) {
        this.typeOfClothes = typeOfClothes;
    }

    public int getNumberOfClothes() {
        return numberOfClothes;
    }

    public Closet(int numberOfClothes) {
        this.numberOfClothes = numberOfClothes;
    }

    public void setNumberOfClothes(int numberOfClothes) {
        this.numberOfClothes = numberOfClothes;
    }

    public boolean isAreTheyInGoodCondition() {
        return areTheyInGoodCondition;
    }

    public Closet(boolean areTheyInGoodCondition) {
        this.areTheyInGoodCondition = areTheyInGoodCondition;
    }

    public void setAreTheyInGoodCondition(boolean areTheyInGoodCondition) {
        this.areTheyInGoodCondition = areTheyInGoodCondition;
    }
}
