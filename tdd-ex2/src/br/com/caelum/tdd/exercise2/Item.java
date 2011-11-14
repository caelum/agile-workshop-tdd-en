package br.com.caelum.tdd.exercise2;

public class Item {

	private final String name;
	private final int qty;
	private final double unitAmount;
	
	public Item(String name, int qty, double unitAmount) {
		this.name = name;
		this.qty = qty;
		this.unitAmount = unitAmount;
	}
	public String getName() {
		return name;
	}
	public int getQty() {
		return qty;
	}
	public double getUnitAmount() {
		return unitAmount;
	}

	public double total() {
		return qty * unitAmount;
	}
	
}
