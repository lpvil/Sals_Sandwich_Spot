package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateASandwich {
    static Scanner scanner = new Scanner(System.in);
    private static int breadchoice;
    private static ArrayList<String> breadType;
    protected int sandwichSize;
    private double baseSandwichPrice;
    private static ArrayList<String> meats;
    private static ArrayList<String> cheeses;
    private ArrayList<String> regularToppings;
    private static ArrayList<String> veggies;
    private static ArrayList<String> condiments;
    private static ArrayList<String> sides;

    static {
        breadType = new ArrayList<String>();
        breadType.add("White");
        breadType.add("Wheat");
        breadType.add("Rye");
        breadType.add("Wrap");
    }

    static {
        meats = new ArrayList<>();
        meats.add("Steak");
        meats.add("Ham");
        meats.add("Salami");
        meats.add("Roast Beef");
        meats.add("Chicken");
        meats.add("Bacon");
    }

    static {
        cheeses = new ArrayList<>();
        cheeses.add("American");
        cheeses.add("Provalone");
        cheeses.add("Cheddar");
        cheeses.add("Swiss");
    }

    static {
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
    }

    static {
        condiments = new ArrayList<>();
        condiments.add("Mayo");
        condiments.add("Mustard");
        condiments.add("Ranch");
        condiments.add("ThousandIsland");
        condiments.add("Vinagrette");
    }

    static {
        sides = new ArrayList<>();
        sides.add("au jus");
        sides.add("sauce");
    }

    public double getBaseSandwichPrice() {
        switch (sandwichSize) {
            case 4:
                baseSandwichPrice = 5.50;
                break;
            case 8:
                baseSandwichPrice = 7.00;
                break;
            case 12:
                baseSandwichPrice = 8.50;
                break;
            default:
                System.out.println("please choose a sandwich size");
                break;
        }
        return baseSandwichPrice;
    }

    public static Sandwich makingSandwich() {

        Sandwich sandwich = new Sandwich();
        boolean makingsandwich = true;
        while (makingsandwich) {
            System.out.println("What kind of bread would you like?: ");
            System.out.println("(0)White, (1)Wheat, (2)Rye, (3)Wrap");
            breadchoice = scanner.nextInt();
            scanner.nextLine();

            if (breadchoice >= 0 && breadchoice < breadType.size()) {
                System.out.println("Awesome choice! we'll add " + breadType.get(breadchoice) + " bread to your order.");
            } else {
                System.out.println("not valid input");
            }

            System.out.println("\nsmall- $5.50, medium- $7.00, large- $8.50?");
            System.out.println("please choose from our three sizes 4 inch, 8 inch, 12 inch");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 4 || choice == 8 || choice == 12) {
                sandwich.setSandwichSize(choice);
            }
            boolean addingToppings = true;
            while (addingToppings) {
                System.out.println("would you like to add toppings? (y) or (n)");
                String answer = scanner.nextLine();
                if (answer.equalsIgnoreCase("y")) {
                    System.out.println("\nWhat toppings would you like?: ");
                    System.out.println("(0)lettuce,(1)peppers,(2)onions,(3)tomatoes\n" +
                            "(4)jalapenos,(5)cucumbers,(6)pickles,(7)guacamole,(8)mushrooms,(9)All Toppings");
                    int toppingChoice = scanner.nextInt();
                    scanner.nextLine();
                    sandwich.getToppings().add(new RegularToppings(veggies.get(toppingChoice)));
                } else {
                    addingToppings = false;
                }
            }
            boolean addCondiments = true;
            while (addCondiments) {
                System.out.println("would you like to add condiments? (y) or (n)");
                String addCondimentsAnswer = scanner.nextLine();
                if (addCondimentsAnswer.equalsIgnoreCase("y")) {
                    System.out.println("\nWhat Kind of condiments would you like?: ");
                    System.out.println("(0)mayo,(1)mustard,(2)ketchup,(3)ranch\n" +
                            "(4)thousand islands,(5)vinaigrette");
                    int condimentsChoice = scanner.nextInt();
                    scanner.nextLine();
                    sandwich.getToppings().add(new RegularToppings(condiments.get(condimentsChoice)));
                } else {
                    addCondiments = false;
                }
            }
            boolean addMeats = true;
            while (addMeats) {
                System.out.println("would you like to add meat? (y) or (n)");
                String addMeatAnswer = scanner.nextLine();
                if (addMeatAnswer.equalsIgnoreCase("y")) {
                    System.out.println("what kind of meat would you like?: ");
                    System.out.println("(0)steak,(1)ham,(2)salami,(3)roast beef\n" +
                            "(4)chicken,(5)bacon");
                    int meatChoice = scanner.nextInt();
                    scanner.nextLine();
                    sandwich.getToppings().add(new ExtraToppings(meats.get(meatChoice)));
                } else {
                    addMeats = false;
                }
            }
            boolean addCheese = true;
            while (addCheese) {
                System.out.println("would you like to add cheese for an additional charge? (y) or (n)");
                String addCheeseAnswer = scanner.nextLine();
                ;
                if (addCheeseAnswer.equalsIgnoreCase("y")) {
                    System.out.println("what kind of cheese would you like?: ");
                    System.out.println("(0)american, (1)provalone, (2)cheddar, (3)swiss");
                    int cheeseChoice = scanner.nextInt();
                    scanner.nextLine();
                    sandwich.getToppings().add(new ExtraToppings(cheeses.get(cheeseChoice)));
                } else {
                    addCheese = false;
                }
            }
            boolean addSide = true;
            while (addSide) {
                System.out.println("would you like to add a side?: (y) or (n) ");
                String addsideanswer = scanner.nextLine();
                if (addsideanswer.equalsIgnoreCase("y")) {
                    System.out.println("(0)au jus, or (1)sauce");
                    int sideChoice = scanner.nextInt();
                    scanner.nextLine();
                    sandwich.getToppings().add(new ExtraToppings(sides.get(sideChoice)));
                } else {
                    addSide = false;
                }
            }
            System.out.println("would you like it toasted? (y) or (n)");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                sandwich.isToasted();
                System.out.println("sandwich is toasting...");
            }
            System.out.println("would you like to add another sandwich?: (y) or (n)");
            String addSandwich = scanner.nextLine();
            if (addSandwich.equalsIgnoreCase("n")){
                makingsandwich = false;
            }
        }
        return sandwich;
    }
}