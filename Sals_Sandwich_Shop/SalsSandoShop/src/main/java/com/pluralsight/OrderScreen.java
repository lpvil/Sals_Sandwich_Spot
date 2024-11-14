package com.pluralsight;

import java.util.List;
import java.util.Scanner;

import static com.pluralsight.HomeScreen.checkoutScreen;
import static com.pluralsight.HomeScreen.mainHomeScreen;

public class OrderScreen implements Actions {
    static Scanner scanner = new Scanner(System.in);
    public static Receipt receipt = new Receipt();
    private int actions;

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
        System.out.println("would you like chips added to order?: (y) or (n) ");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            receipt.getOrders().add(chips);
        }
    }

    @Override
    public void addSandwichToOrder() {

        Sandwich s = CreateASandwich.makingSandwich();
        receipt.getOrders().add(s);
        newOrderScreen();
        actionsTaken();
    }

    @Override
    public void addDrinkToOrder() {
        Drink drink = new Drink();
        boolean addDrink = true;
        while (addDrink) {
            System.out.println("what size drink would you like?: ");
            System.out.println("(0)small, (1)medium, (2)large");
            int sizeChoice = scanner.nextInt();
            scanner.nextLine();
            System.out.println("would you like to add another drink? (y) or (n)");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("n")) {
                addDrink = false;
            }
            drink.setDrinkSize(sizeChoice);
            receipt.getOrders().add(drink);
        }
        newOrderScreen();
        actionsTaken();
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

}
