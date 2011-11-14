package br.com.gnarus.tdd.exercise5;

import java.util.Arrays;
import java.util.List;

public class InvestmentProcessor {

	public static void main(String[] args) {

		for(RegularBankAccount account : bankAccounts()) {
			account.plusInvestment();

			System.out.println("New balance:");
			System.out.println(account.getBalance());
		}
	}

	private static List<RegularBankAccount> bankAccounts() {
		return Arrays.asList(anAccountWith(100), anAccountWith(150), studentAccountWith(200));
	}

	private static RegularBankAccount studentAccountWith(double amount) {
		StudentBankAccount c = new StudentBankAccount();
		c.deposit(amount);
		return c;
	}

	private static RegularBankAccount anAccountWith(double amount) {
		RegularBankAccount c = new RegularBankAccount();
		c.deposit(amount);
		return c;
	}

}
