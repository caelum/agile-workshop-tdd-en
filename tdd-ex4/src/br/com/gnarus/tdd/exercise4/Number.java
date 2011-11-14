package br.com.gnarus.tdd.exercise4;

public class Number {
	private final int number;
	private final Number parent;
	
	public Number(int number, Number parent) {
		this.number = number;
		this.parent = parent;
	}
	public int getValue() {
		return number;
	}

	public Number getParent() {
		return parent;
	}
}
