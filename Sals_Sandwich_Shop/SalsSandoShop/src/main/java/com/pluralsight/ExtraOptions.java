package com.pluralsight;

public class ExtraOptions {
    private String drinkSize;
    private double drinkPrice;
    private String chips;
    private double chipsPrice;

    public ExtraOptions(String drinkSize, double drinkPrice,String chips, double chipsPrice){
        this.drinkSize = drinkSize;
        this.drinkPrice = drinkPrice;
        this.chips = chips;
        this.chipsPrice = chipsPrice;
    }

    public ExtraOptions() {

    }


    public double getDrinkPrice(){
        switch (drinkSize){
            case "small":
                drinkPrice = 2.00;
                break;
            case "medium":
                drinkPrice = 2.50;
                break;
            case "large":
                drinkPrice = 3.00;
                break;
            default:
                System.out.println("no drink added");
                break;

        }
        return drinkPrice;
    }
    public double getChipPrice(){
        if(getChips().equalsIgnoreCase("y")){
            chipsPrice = 1.50;
        }
        return chipsPrice;
    }
    public String getDrinkSize(){
        return drinkSize;
    }

    public void setDrinkSize(String drinkSize) {
        this.drinkSize = drinkSize;
    }

    public String getChips() {
        return chips;
    }

    public void setChips(String chips) {
        this.chips = chips;
    }
}
