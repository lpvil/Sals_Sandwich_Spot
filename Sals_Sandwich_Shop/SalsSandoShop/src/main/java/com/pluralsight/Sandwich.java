package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Sandwich implements Orderable {
    private String bread;
    private ArrayList<Topping> toppings = new ArrayList<>();
    private boolean isToasted;
    private int sandwichSize;

    public Sandwich(String bread, ArrayList<Topping> toppings, boolean isToasted,int sandwichSize) {
        this.bread = bread;
        this.toppings = toppings;
        this.isToasted = isToasted;
        this.sandwichSize = sandwichSize;
    }
  public Sandwich(){
  }

    public int getSandwichSize() {
        return sandwichSize;
    }

    public void setSandwichSize(int sandwichSize) {
        this.sandwichSize = sandwichSize;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public ArrayList<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<Topping> toppings) {
        this.toppings = toppings;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "bread='" + bread + '\'' +
                ", toppings=" + toppings +
                ", isToasted=" + isToasted +
                ", sandwichSize=" + sandwichSize +
                '}';
    }

    @Override
    public String writeToFile() {
        return toString();
    }
}


