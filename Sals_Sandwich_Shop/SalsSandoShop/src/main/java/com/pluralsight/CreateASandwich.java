package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class CreateASandwich {
    Scanner scanner = new Scanner(System.in);
    private int breadchoice;

    ExtraOptions extraOptions = new ExtraOptions();
    Sandwich sandwich = new Sandwich();
    RegularToppings regularToppings = new RegularToppings();
    ExtraToppings extraToppings = new ExtraToppings();

    public void makingSandwich() {
        System.out.println("What kind of bread would you like?: ");
        System.out.println("(0)White, (1)Wheat, (2)Rye, (3)Wrap");
        breadchoice = scanner.nextInt();
        scanner.nextLine();

        List<String> breadtype = sandwich.getBreadType();

        if (breadchoice >= 0 && breadchoice < breadtype.size()) {
            System.out.println("Awesome choice! we'll add " + breadtype.get(breadchoice) + " bread to your order.");
        } else {
            System.out.println("not valid input");
        }

        System.out.println("\nsmall- $5.50, medium- $7.00, large- $8.50?");
        System.out.println("please choose from our three sizes 4 inch, 8 inch, 12 inch");
        int choice = scanner.nextInt();

        if (choice == sandwich.getSandwichSize()) {
            System.out.println("great!");
        } else {
            System.out.println("not valid try again");
            ;
        }


        System.out.println("\nWhat Kind of toppings would you like?: ");
        System.out.println("(0)lettuce,(1)peppers,(2)onions,(3)tomatoes\n" +
                "(4)jalapenos,(5)cucumbers,(6)pickles,(7)guacamole,(8)mushrooms,(9)All Toppings");
        List<String> regToppings = regularToppings.getVeggies();

    }
}