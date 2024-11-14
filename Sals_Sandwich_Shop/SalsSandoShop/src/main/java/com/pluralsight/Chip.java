package com.pluralsight;

public class Chip {
    private double chipsPrice;

    public Chip(double chipsPrice) {
        this.chipsPrice = chipsPrice;
    }
    public Chip(){

    }

    public double getChipsPrice() {
        return chipsPrice;
    }

    public void setChipsPrice(double chipsPrice) {
        this.chipsPrice = chipsPrice;
    }
}
