package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private ArrayList<String> breadType;
    private int sandwichSize;
    private boolean isToasted;

    public ArrayList<String> getBreadType(){
        breadType = new ArrayList<String>();
        breadType.add("White");
        breadType.add("Wheat");
        breadType.add("Rye");
        breadType.add("Wrap");
        return breadType;
    }

    public Sandwich(ArrayList<String> breadType, int sandwichSize, boolean isToasted) {
        this.breadType = breadType;
        this.sandwichSize = sandwichSize;
        this.isToasted = isToasted;
    }

    public int getSandwichSize() {
        return sandwichSize;
    }

    public void setSandwichSize(int sandwichSize) {
        this.sandwichSize = sandwichSize;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }
}
