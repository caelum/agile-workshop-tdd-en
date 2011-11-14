package br.com.gnarus.tdd.exercise5;

public class StudentBankAccount extends RegularBankAccount {

	private int miles;

	public void deposit(double amount) {
		super.deposit(amount);
		this.miles += (int)amount;
	}

	public int getMiles() {
		return miles;
	}

	
}
