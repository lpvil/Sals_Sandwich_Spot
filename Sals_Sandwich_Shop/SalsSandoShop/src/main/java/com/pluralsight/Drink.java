package com.pluralsight;

public class Drink {
    private int drinkSize;
    private double drinkPrice;

    public Drink(double drinkPrice, int drinkSize) {
        this.drinkPrice = drinkPrice;
        this.drinkSize = drinkSize;
    }
    public Drink(){

    }

    public int getDrinkSize() {
        return drinkSize;
    }

    public void setDrinkSize(int drinkSize) {
        this.drinkSize = drinkSize;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }

    public void setDrinkPrice(double drinkPrice) {
        this.drinkPrice = drinkPrice;
    }
}
