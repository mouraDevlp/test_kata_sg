package com.kataTest.BankAccount;

import java.util.ArrayList;
public class Statement {
    private ArrayList <Operation> operations;

    // Constructeur
    public Statement(){
        operations= new ArrayList <Operation> ();
    }
    //Ajouter une operation
    public void addOperation(Operation newOperation){
        operations.add(newOperation);
    }


    public String showStatment(){
        String AllOperations=new String();
        for(int i=0;i<operations.size();i++)
        {
            AllOperations+=operations.get(i).showOperation();
            AllOperations+="\n";
        }
        return AllOperations;
    }

}