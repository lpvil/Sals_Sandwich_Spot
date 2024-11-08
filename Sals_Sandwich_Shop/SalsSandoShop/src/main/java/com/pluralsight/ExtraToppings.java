package com.pluralsight;

import java.util.ArrayList;

public class ExtraToppings {
    private ArrayList<String> meats;
    private ArrayList<String> cheeses;
    private ArrayList<String> regularToppings;
    private String extraMeats;
    private String extraCheeses;

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

    public ExtraToppings(ArrayList<String> meats, ArrayList<String> cheeses, ArrayList<String> regularToppings, String extraMeats, String extraCheeses) {
        this.meats = meats;
        this.cheeses = cheeses;
        this.regularToppings = regularToppings;
        this.extraMeats = extraMeats;
        this.extraCheeses = extraCheeses;
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
