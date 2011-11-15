package br.com.caelum.tdd.exercise3;

import java.util.List;

public class BankslipProcessor {

	public void process(List<Bankslip> bankslips, Invoice invoice) {
		for(Bankslip bankslip : bankslips) {
			Payment newPayment = new Payment(bankslip.getAmount(), PaymentMethod.BANKSLIP);
			invoice.getPayments().add(newPayment);
		}
	}
}
