package com.kataTest.BankAccount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankAccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankAccountApplication.class, args);

		//client 1 - depot simple
		System.out.println("client1");
		Account clientAccount1 = new Account("client 1",1500 , -200, 700);
        clientAccount1.deposit(100);
        System.out.println(clientAccount1.getBalance());

        //client 2 - retrait simple
        System.out.println("client 2");
        Account clientAccount2 = new Account("client 2",10250 , -200, 1000);
        clientAccount2.withdrawal(100);
        System.out.println(clientAccount1.getBalance());

        //client 3 - retrait plus que le plafond autorise
        System.out.println("client 3");
        Account clientAccount3 = new Account("client 3",10250 , -200, 1000);
        clientAccount3.withdrawal(1200);
        System.out.println(clientAccount1.getBalance());

        //client 4 - retrait montant superieur au solde du compte
        System.out.println("client 4");
        Account clientAccount4 = new Account("client 4",10250 , -200, 1000);
        clientAccount4.withdrawal(11000);
        System.out.println(clientAccount1.getBalance());


        //client 5 - relever de compte
        System.out.println("-------------------releve de compte--------------------");
        System.out.println("client 5");
        Account clientAccount5 = new Account("client 5",15000 , -200, 1000);
        clientAccount5.withdrawal(100);
        clientAccount5.deposit(100);
        clientAccount5.withdrawal(10);
        clientAccount5.withdrawal(90);
        clientAccount5.deposit(150);
        clientAccount5.printStatment();
        System.out.println(clientAccount5.getBalance());

	}

}
