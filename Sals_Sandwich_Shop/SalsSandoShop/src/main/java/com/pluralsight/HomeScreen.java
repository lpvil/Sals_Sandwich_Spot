package com.pluralsight;

import java.util.Scanner;

public class HomeScreen {
    public static void main(String[] args) {
        mainHomeScreen();
    }

    public static void mainHomeScreen() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("------Welcome-To-Sal's-Sandwich-Shop-------");
        System.out.println("How could we help you?:");
        System.out.println("(1)NEW ORDER \n(0)EXIT");
        choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                newOrderScreen();
                break;
            case 0:
                System.out.println("Thanks For Stopping By!...");
                break;
        }
    }

    public static void newOrderScreen() {
        OrderScreen screen = new OrderScreen();
        screen.newOrderScreen();
        screen.actionsTaken();
    }

    public static void checkoutScreen() {
    OrderScreen.receipt.addToReceipt();
    for(Orderable order : OrderScreen.receipt.getOrders()){
        System.out.println("Here is your receipt for your order:\n " + order);
    }
    }
}
