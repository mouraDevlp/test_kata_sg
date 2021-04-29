package com.kataTest.BankAccount;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Assert;

@SpringBootTest
class BankAccountApplicationTests {

	@Test
	void contextLoads() {
	}

	//cree un compte
	//retirer
	//deposer
	//afficher les operation

	@Test
	void testDeposit(){
		Account account = new Account("Clien 1", 1200, -200, 1000);
		account.deposit(100);
		Assert.assertEquals((double)1300, account.getBalance(),0);
	}

	@Test
	void testDeposit_1(){
		Account account = new Account("Clien 1", 1200, -200, 1000);
		account.deposit(100);
		Assert.assertEquals((double)1400, account.getBalance(),100);
	}

	@Test
	void testwithdrawal(){
		Account account = new Account("Clien 1", 1200, -200, 1000);
		account.withdrawal(100);
		Assert.assertEquals((double)1100, account.getBalance(),0);
	}

	@Test
	void testwithdrawal_1(){
		Account account = new Account("Clien 1", 1200, -200, 1000);
		account.withdrawal(100);
		Assert.assertEquals((double)1200, account.getBalance(),100);
	}


}
