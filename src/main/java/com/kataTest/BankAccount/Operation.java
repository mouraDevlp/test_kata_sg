package com.kataTest.BankAccount;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Operation {
    private String type;
    private double amount;
    private Date date;

    public Operation(String type, double amount, Date date) {
        this.type = type;
        this.amount = amount;
        this.date = date;
    }


    public String showOperation(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return type +"  "+amount+"  "+ dateFormat.format(date);
    }

}