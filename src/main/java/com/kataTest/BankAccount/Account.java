package com.kataTest.BankAccount;

import com.kataTest.BankAccount.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Account {

    private String name;
    private double balance;
    //releve du compte
    private Statement statement = new Statement();
    //minimum du solde sur compte
    private double minBalance;
    //valeur max de retrait
    private double maxWithdrawal;

    public Account(String name, double balance, double minBalance, double maxWithdrawal) {
        this.name = name;
        this.balance = balance;
        this.minBalance = minBalance;
        this.maxWithdrawal = maxWithdrawal;
    }

    //retrait
    public void withdrawal(double amount){
        try{
            // tester si le montant restant apres l'operation soit superieur au solde minimum qu'il faut dans le compte
            if((balance-amount) >= minBalance){
                //tester si le montant de retrait ne depasse pas le plafond
                if(amount > maxWithdrawal){
                    System.out.println("retrait refusé - depacement du plafond (plafond acctuel = "+maxWithdrawal+")");
                }else {
                    balance-=amount;
                    Operation op = new Operation("WITHDRAWAL",amount, new Date());
                    statement.addOperation(op);
                    System.out.println("Retrait accepté - Operation de retrait OK");
                }
            }
            else{
                System.out.println("retrait refusé - solde de compte n'est pas suffisant");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("retrait refusé - Erreur inattendue");
        }
    }

    //depot
    public void deposit(double amount){
        try{
            Operation op = new Operation("DEPOSIT   ",amount, new Date());
            balance+=amount;
            statement.addOperation(op);
            System.out.println("depot accepté - Operation de depot OK");
        } catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("depot refusé - Erreur inattendue");
        }
    }


    //affichage releve du compte.
    public void  printStatment(){
        System.out.println("releve de compte de M/MM: "+name);
        System.out.println("OPERATION    MONTANT    DATE ");
        System.out.println(statement.showStatment());
        System.out.println("Solde restant:   "+balance);
    }

    public double getBalance() {
        return balance;
    }

}