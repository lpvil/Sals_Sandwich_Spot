package com.pluralsight;

import java.util.ArrayList;

public class ExtraToppings extends RegularToppings {
    private ArrayList<String> meats;
    private ArrayList<String> cheeses;
    private ArrayList<String> regularToppings;
    private String extraMeats;
    private String extraCheeses;
    private double extraMeatPrice;
    private double extraCheesePrice;
    private double meatsPrice;

    public void sandoMeats(){
        meats = new ArrayList<>();
        meats.add("Steak");
        meats.add("Ham");
        meats.add("Salami");
        meats.add("Roast Beef");
        meats.add("Chicken");
        meats.add("Bacon");
    }
    public void sandoCheeses(){
        cheeses = new ArrayList<>();
        cheeses.add("American");
        cheeses.add("Provalone");
        cheeses.add("Cheddar");
        cheeses.add("Swiss");
    }

    public ExtraToppings(ArrayList<String> meats, ArrayList<String> cheeses, ArrayList<String> regularToppings, String extraMeats, String extraCheeses, double extraMeatPrice, double extraCheesePrice) {
        super();
        this.meats = meats;
        this.cheeses = cheeses;
        this.regularToppings = regularToppings;
        this.extraMeats = extraMeats;
        this.extraCheeses = extraCheeses;
        this.extraCheesePrice = extraCheesePrice;
        this.extraMeatPrice = extraMeatPrice;
    }
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
