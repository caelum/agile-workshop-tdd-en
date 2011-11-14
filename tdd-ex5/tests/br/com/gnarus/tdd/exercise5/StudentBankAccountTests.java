package br.com.gnarus.tdd.exercise5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.gnarus.tdd.exercise5.StudentBankAccount;

public class StudentBankAccountTests {

	@Test
	public void shouldEarnMilesForEachDepositedDollar() {
		StudentBankAccount account = new StudentBankAccount();
		assertEquals(0, account.getMiles(), 0.00001);
		
		account.deposit(150);
		
		assertEquals(150, account.getMiles());
	}
}
