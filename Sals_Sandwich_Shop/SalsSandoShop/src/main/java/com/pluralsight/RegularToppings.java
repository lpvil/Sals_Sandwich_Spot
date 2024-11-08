package com.pluralsight;

import java.util.ArrayList;

public class RegularToppings {
    private ArrayList<String> veggies;
    private ArrayList<String> condiments;

    public ArrayList<String> getVeggies() {
        veggies = new ArrayList<>();
        veggies.add("Lettuce");
        veggies.add("Peppers");
        veggies.add("Onions");
        veggies.add("Tomatoes");
        veggies.add("Jalapenos");
        veggies.add("Cucumbers");
        veggies.add("Pickles");
        veggies.add("Guacamole");
        veggies.add("Mushrooms");
        return veggies;
    }

    public ArrayList<String> getCondiments() {
        condiments = new ArrayList<>();
        condiments.add("Mayo");
        condiments.add("Mustard");
        condiments.add("Ranch");
        condiments.add("ThousandIsland");
        condiments.add("Vinagrette");
        return condiments;
    }
}
