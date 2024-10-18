import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FinacialTrackingApp {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       String choice = showHomescreen();
    handleChoiceHomescreen(choice);
    String pickone = showLedger();
    ledgerChoice(pickone);
    }

//homescreen allows user to input a choice
    public static String showHomescreen() {
        System.out.println("Welcome to Finacial Tracker");
        System.out.println("What would you like to do?: ");
        System.out.println("Deposit(D), Make a Payment(P), Display ledger(L), Exit(E) ");

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine().toUpperCase();
        return choice;
    }
//takes input and chooses method depending on their option
    public static void handleChoiceHomescreen(String choice) {
        switch (choice) {
            case "D":
                makeDeposit();
                break;
            case "P":
                makePayment();
                break;
            case "L":
                showLedger();
                break;
            case "E":
                exit();
                break;
        }
    }
        public static void makeDeposit () {
            // get input using scanner
            System.out.println("how much would you like to deposit?: ");
            double amount = sc.nextDouble();
            sc.nextLine();
            LocalDate date = LocalDate.now();
            LocalTime time = LocalTime.now();
            System.out.println("who is the vendor?: ");
            String vendor = sc.nextLine();
            System.out.println("give brief desciption of deposit: ");
            String dscrpt = sc.nextLine();
            // create a transaction string with the input
            String transaction = date.toString() + "|" + time.toString() + "|" + dscrpt + "|" + vendor + "|" + amount;
            // call the method to add the transaction
            addTransaction(transaction);
        }
        public static void makePayment () {
            // same as make deposti, but preceed amount by a -
            System.out.println("how much of a payment would you like to make?: ");
            double amount = sc.nextDouble()*-1;
            sc.nextLine();
            LocalDate date = LocalDate.now();
            LocalTime time = LocalTime.now();
            System.out.println("who is the vendor?: ");
            String vendor = sc.nextLine();
            System.out.println("give brief desciption of payment: ");
            String dscrpt = sc.nextLine();
            // create a transaction string with the input
            String transaction = date.toString() + "|" + time.toString() + "|" + dscrpt + "|" + vendor + "|" + amount;
            // call the method to add the transaction
            addTransaction(transaction);
        }
        public static String showLedger () {
            System.out.println("Welcome to ledger screen!");
            System.out.println("here are some options:");
            System.out.println("Display All (A), Display Deposits(B), Display Payments(C), Home(H) ");
            String pickone = sc.nextLine().toUpperCase();
            return pickone;
        }
        public static void ledgerChoice(String pickone){
        switch (pickone){
            case "A":
                displayAllTransactions();
                break;
            case "B":
                displayDesposits();
                break;
            case "C":
                displayPayments();
                break;
            case "H":
                goHome();
                break;
        }
        }
        public static void exit () {
               System.out.println("closing application...");
        }
        public static void displayPayments(){
        try{
            FileReader freader = new FileReader("src\\transactions.csv");
            BufferedReader reader = new BufferedReader(freader);

        } catch(IOException e) {
            System.out.println(e.getMessage());
}
        }
        public static void displayDesposits(){

        }
        public static void displayAllTransactions(){
        try {
            FileReader fr = new FileReader("src\\transactions.csv");
            BufferedReader br = new BufferedReader(fr);
            String file1;
            while ((file1 = br.readLine()) != null) {
                String[] fileInfo = file1.split(Pattern.quote("|"));
                System.out.println(file1);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void goHome(){
        showHomescreen();
    }
        //helper method by maaike
    public static List<String[]> getTransactionsFromFile() {
        List<String[]> transactions = new ArrayList<>();
        // we'll read transactions from file and add them tot our list
        try {
            BufferedReader bf = new BufferedReader(new FileReader("src\\transactions.csv"));
            bf.readLine();
            String line;
            while((line = bf.readLine()) != null) {
                String[] transaction = line.split("\\|");
                transactions.add(transaction);
            }
            bf.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
        return transactions;
    }

    // helper method by maaike
    public static void addTransaction(String transaction) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("src\\transactions.csv", true));
            bw.write("\n" + transaction);
            bw.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}