package br.com.caelum.tdd.exercise7;

import java.util.Calendar;

public class Invoice {

	private final double amount;
	private final Calendar date;
	private final State state;

	public Invoice(double amount, Calendar date, State state) {
		this.amount = amount;
		this.date = date;
		this.state = state;
	}

	public double getAmount() {
		return amount;
	}

	public Calendar getDate() {
		return date;
	}

	public State getState() {
		return state;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Invoice other = (Invoice) obj;
		if (Double.doubleToLongBits(amount) != Double
				.doubleToLongBits(other.amount))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (state != other.state)
			return false;
		return true;
	}

	
}
