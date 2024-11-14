package com.pluralsight;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Receipt {

    List<Sandwich> customSandwich = new ArrayList<>();

    public void addToReceipt(){
        try {
            FileWriter fileWriter = new FileWriter(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME) + "recipts.txt");
        }catch (IOException e){
            System.out.println("cannot save receipt");
        }
    }

}
