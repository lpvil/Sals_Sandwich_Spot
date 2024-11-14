package com.pluralsight;

public class Drink implements Orderable {
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

    @Override
    public double getPrice() {
        switch (drinkSize) {
            case 0:
                drinkPrice = 2.00;
                break;
            case 1:
                drinkPrice = 2.50;
                break;
            case 2:
                drinkPrice = 3.00;
                break;
            default:
                System.out.println("no drink added");
                break;


        }
        return drinkPrice;
    }
//Nima, Cesar, Joezari helped with toString and write and writeToFile
    @Override
    public String toString() {
        return "Drink{" +
                "drinkSize=" + drinkSize +
                ", drinkPrice=" + drinkPrice +
                '}';
    }

    @Override
    public String writeToFile() {
        return toString();
    }
}
