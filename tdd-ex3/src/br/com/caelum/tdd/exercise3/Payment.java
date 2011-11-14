package br.com.caelum.tdd.exercise3;

public class Payment {

	private final double amount;
	private final PaymentMethod method;

	public Payment(double amount, PaymentMethod method) {
		this.amount = amount;
		this.method = method;
	}

	public double getAmount() {
		return amount;
	}

	public PaymentMethod getPaymentMethod() {
		return method;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Payment)) {
			return false;
		}
		Payment other = (Payment) obj;
		if (method != other.method
				|| Double.doubleToLongBits(amount) != Double
						.doubleToLongBits(other.amount)) {
			return false;
		}

		return true;
	}

}
