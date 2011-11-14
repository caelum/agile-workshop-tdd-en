package br.com.caelum.tdd.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Invoice {

	private String customer;
	private double amount;
	private List<Payment> payments;
	
	public Invoice(String customer, double amount) {
		this.customer = customer;
		this.amount = amount;
		this.payments = new ArrayList<Payment>();
	}

	public String getCustomer() {
		return customer;
	}

	public double getAmount() {
		return amount;
	}

	public List<Payment> getPayments() {
		return payments;
	}

	public boolean isPaid() {
		double total = 0;
		for(Payment p: payments) {
			total += p.getAmount();
		}
		return total >= amount;
	}

	public void add(Payment newPayment) {
		this.payments.add(newPayment);
	}
	
	
}
