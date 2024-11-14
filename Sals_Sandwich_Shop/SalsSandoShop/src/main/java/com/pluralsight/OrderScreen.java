package com.pluralsight;

import java.util.List;
import java.util.Scanner;

import static com.pluralsight.HomeScreen.checkoutScreen;
import static com.pluralsight.HomeScreen.mainHomeScreen;

public class OrderScreen implements Actions {
    static Scanner scanner = new Scanner(System.in);
    private Receipt receipt = new Receipt();
    private int actions;

    private double orderTotal;
//object created in order to access class
//new order screen takes user input to choose an action
    public void newOrderScreen() {
        System.out.println("----NEW-ORDER----");
        System.out.println("\n what would you like to order?: ");
        System.out.println("(1)Sandwich\n(2)Drink\n(3)Chips\n(4)Checkout\n(0)Cancel Order");
        actions = scanner.nextInt();
        scanner.nextLine();
    }
//depending on action taken, method is executed.
    public int actionsTaken() {
        switch (actions) {
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
    public void addChipsToOrder() {
        Chip chips = new Chip();
        System.out.println("chips added to order");
        chips.getChipsPrice();
        receipt.getOrders().add(chips);
    }

    @Override
    public void addSandwichToOrder() {
        CreateASandwich.makingSandwich();
    }

    @Override
    public void addDrinkToOrder() {
        Drink drink = new Drink();
            System.out.println("what size drink would you like?: ");
            System.out.println("(0)small, (1)medium, (2)large");
            int sizeChoice = scanner.nextInt();
            drink.setDrinkSize(sizeChoice);
            newOrderScreen();
    }

    @Override
    public void checkout() {
        checkoutScreen();
    }

    @Override
    public void cancelOrder() {
        System.out.println("canceling order...\n");
        mainHomeScreen();
    }

    public double getOrderTotal() {

        return orderTotal;
    }
}
