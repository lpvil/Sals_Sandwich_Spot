package com.pluralsight;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Receipt {
    List<Orderable> orders = new ArrayList<>();

    public void addToReceipt(){
        try {
            FileWriter fileWriter = new FileWriter(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME) + "recipts.txt");
            for(Orderable o :orders){
                fileWriter.write(o.writeToFile());

            }
            fileWriter.close();
        }catch (IOException e){
            System.out.println("cannot save receipt");
        }
    }

    public List<Orderable> getOrders() {
        return orders;
    }

    public void setOrders(List<Orderable> orders) {
        this.orders = orders;
    }
}
