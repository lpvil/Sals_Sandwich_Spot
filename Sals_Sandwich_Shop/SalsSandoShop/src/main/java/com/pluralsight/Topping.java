package com.pluralsight;

import java.util.ArrayList;

public class Topping {
    private String toppingName;

    public Topping(String toppingName) {
        this.toppingName = toppingName;
    }

    public Topping() {

    }

    public String getToppingName() {
        return toppingName;
    }

    public void setToppingName(String toppingName) {
        this.toppingName = toppingName;
    }
}
