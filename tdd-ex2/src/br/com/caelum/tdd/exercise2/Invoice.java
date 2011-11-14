package br.com.caelum.tdd.exercise2;


public class Invoice {

	private int id;
	private double bruteAmount;
	private double taxes;

	public Invoice(int id, double bruteAmount, double taxes) {
		this.id = id;
		this.bruteAmount = bruteAmount;
		this.taxes = taxes;
	}

	public Invoice(double bruteAmount, double taxes) {
		this(0, bruteAmount, taxes);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBruteAmount() {
		return bruteAmount;
	}
	public double getTaxes() {
		return taxes;
	}
	public double getLiquidAmount() {
		return this.bruteAmount - this.taxes;
	}

}
