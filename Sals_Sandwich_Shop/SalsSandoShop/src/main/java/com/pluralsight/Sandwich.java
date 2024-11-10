package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private ArrayList<String> breadType;
    protected int sandwichSize;
    private boolean isToasted;
    private double baseSandwichPrice;

    public Sandwich() {

    }

    public ArrayList<String> getBreadType(){
        breadType = new ArrayList<String>();
        breadType.add("White");
        breadType.add("Wheat");
        breadType.add("Rye");
        breadType.add("Wrap");
        return breadType;
    }

    public Sandwich(double baseSandwichPrice,ArrayList<String> breadType, int sandwichSize, boolean isToasted) {
        this.breadType = breadType;
        this.sandwichSize = sandwichSize;
        this.isToasted = isToasted;
        this.baseSandwichPrice = baseSandwichPrice;
    }
    public double getBaseSandwichPrice() {
        switch (sandwichSize) {
            case 4:
                baseSandwichPrice = 5.50;
                break;
            case 8:
                baseSandwichPrice = 7.00;
                break;
            case 12:
                baseSandwichPrice = 8.50;
                break;
            default:
                System.out.println("please choose a sandwich size");
                break;
        }
        return baseSandwichPrice;
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
