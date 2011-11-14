package br.com.caelum.tdd.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket {

	private final String customer;
	private final List<Item> items;

	public Basket(String customer) {
		
		this.customer = customer;
		items = new ArrayList<Item>();
	}
	public String getCustomer() {
		return customer;
	}
	public List<Item> getItems() {
		return items;
	}

	public void addItem(Item item) {
		items.add(item);
	}
	public double total() {
		double sum = 0;
		
		for (Item item : items) {
			sum+= item.total();
		}
		
		return sum;
	}
	
}
