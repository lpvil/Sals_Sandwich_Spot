package com.pluralsight;

import java.util.ArrayList;

public class ExtraToppings extends Topping {
    private double extraPrice;
    private double basePrice;
    private String toppingName;

    public ExtraToppings(double extraPrice, double basePrice, String toppingName) {
        this.extraPrice = extraPrice;
        this.basePrice = basePrice;
        this.toppingName = toppingName;
    }

    public ExtraToppings(String toppingName) {
        super(toppingName);
    }

    public double getExtraPrice() {
        return extraPrice;
    }

    public void setExtraPrice(double extraPrice) {
        this.extraPrice = extraPrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    @Override
    public String getToppingName() {
        return toppingName;
    }

    @Override
    public void setToppingName(String toppingName) {
        this.toppingName = toppingName;
    }
}


    /*
    public double getMeatsPrice(){
        if(getSandwichSize()== 4){
            meatsPrice = 1.00;}
        else if(getSandwichSize()== 8){
            meatsPrice = 2.00;}
        else if(getSandwichSize()== 12){
            meatsPrice = 3.00;}
        return meatsPrice;
    }

    public double getExtraMeatPrice() {
        if(extraMeats.equalsIgnoreCase("y") && (getSandwichSize() == 4)){
            extraMeatPrice = .50;}
        else if(extraMeats.equalsIgnoreCase("y") && (getSandwichSize() == 8)){
            extraMeatPrice = 1.00;}
        else if(extraMeats.equalsIgnoreCase("y") && (getSandwichSize() == 12)){
            extraMeatPrice = 1.50;}

        return extraMeatPrice;
    }

    public double getExtraCheesePrice() {
        if(extraCheeses.equalsIgnoreCase("y") && (getSandwichSize() == 4)){
            extraCheesePrice = .30;}
        else if(extraCheeses.equalsIgnoreCase("y") && (getSandwichSize() == 8)){
            extraCheesePrice = .60;}
        else if(extraCheeses.equalsIgnoreCase("y") && (getSandwichSize() == 12)){
            extraCheesePrice = .90;
        }
        return extraCheesePrice;
    }

    public String getExtraMeats() {

        return extraMeats;
    }

    public void setExtraMeats(String extraMeats) {

        this.extraMeats = extraMeats;
    }

    public String getExtraCheeses() {

        return extraCheeses;
    }

    public void setExtraCheeses(String extraCheeses) {

        this.extraCheeses = extraCheeses;
    }
}
*/