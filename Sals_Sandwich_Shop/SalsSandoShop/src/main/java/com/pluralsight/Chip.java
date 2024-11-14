package com.pluralsight;

public class Chip implements Orderable {
    private double chipsPrice;
    private boolean chipsAdded = true;

    public Chip(double chipsPrice) {
        this.chipsPrice = chipsPrice;
    }
    public Chip(){

    }

    public void setChipsAdded(boolean chipsAdded) {
        this.chipsAdded = chipsAdded;
    }

    public double getChipsPrice() {
        return chipsPrice;
    }

    public void setChipsPrice(double chipsPrice) {
        this.chipsPrice = chipsPrice;
    }

    @Override
    public double getPrice() {
        return chipsPrice;
    }

    @Override
    public String toString() {
        return "Chip{" +
                "chipsPrice=" + chipsPrice +
                ", chipsAdded=" + chipsAdded +
                '}';
    }

    @Override
    public String writeToFile() {
        return toString();
    }
}
