package br.com.gnarus.tdd.exercise5;

public class RegularBankAccount {

	protected double balance;

	public RegularBankAccount() {
		this.balance = 0;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		if (amount <= this.balance) {
			this.balance -= amount;
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public void plusInvestment(){
		this.balance += this.balance * 0.01;
	}

	public double getBalance() {
		return balance;
	}

}
