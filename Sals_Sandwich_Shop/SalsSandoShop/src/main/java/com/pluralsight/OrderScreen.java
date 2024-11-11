package com.pluralsight;

import java.util.List;
import java.util.Scanner;

import static com.pluralsight.HomeScreen.checkoutScreen;

public class OrderScreen implements Actions {
    static Scanner scanner = new Scanner(System.in);
    private int actions;
    private int breadchoice;
    private double orderTotal;
    ExtraOptions extraOptions = new ExtraOptions();
    Sandwich sandwich = new Sandwich();
    RegularToppings regularToppings = new RegularToppings();
    ExtraToppings extraToppings = new ExtraToppings();

    public void newOrderScreen(){
        System.out.println("----NEW-ORDER----");
        System.out.println("\n what would you like to order?: ");
        System.out.println("(1)Sandwich\n(2)Drink\n(3)Chips\n(4)Checkout\n(0)Cancel Order");
        actions = scanner.nextInt();
        scanner.nextLine();
    }

    public int actionsTaken(){
        switch(actions){
            case 1:
                addSandwichToOrder();
                break;
            case 2:
                addDrinkToOrder();
                break;
            case 3:
                addChipsToOrder();
                break;
            case 4:
                checkout();
                break;
            case 0:
                cancelOrder();
                break;
            default:
                System.out.println("invalid!!! please pick an option");
        }
        return actions;
    }

    @Override
    public double addChipsToOrder() {
        extraOptions.getChipPrice();
        return orderTotal;
    }

    @Override
    public void addSandwichToOrder() {
        System.out.println("What kind of bread would you like?: ");
        System.out.println("(0)White, (1)Wheat,(2)Rye, (3)Wrap");
        breadchoice = scanner.nextInt();
        scanner.nextLine();

        List<String> breadtype = sandwich.getBreadType();

        if(breadchoice >= 0 && breadchoice < breadtype.size()){
            System.out.println("Awesome choice! we'll add " +breadtype.get(breadchoice)+" bread to your order.");
        }else {
            System.out.println("not valid input");
        }

    }

    @Override
    public double addDrinkToOrder() {
return orderTotal;
    }

    @Override
    public void checkout() {
        checkoutScreen();
    }

    @Override
    public void cancelOrder() {

    }
    public double getOrderTotal(){

        return orderTotal;
    }
}
