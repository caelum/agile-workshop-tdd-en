package br.com.caelum.tdd.exercise3;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class BankslipProcessorTest {

	@Test
	public void shouldNotGeneratePaymentWhenThereIsNoBankslips() {
		Invoice invoice = new Invoice("caelum", 1000.0);
		List<Bankslip> paidBankslips = Collections.emptyList();

		new BankslipProcessor().process(paidBankslips, invoice);
		
		assertEquals(0, invoice.getPayments().size());
	}
	
	@Test
	public void shouldGenerateABankslipPaymentForAnInvoice() {
		Invoice invoice = new Invoice("caelum", 1000.0);
		List<Bankslip> paidBankslips = Arrays.asList(new Bankslip(200.0), new Bankslip(500.0));
		
		new BankslipProcessor().process(paidBankslips, invoice);
		
		assertEquals(2, invoice.getPayments().size());
		assertEquals(new Payment(200.0, PaymentMethod.BANKSLIP), invoice.getPayments().get(0));
		assertEquals(new Payment(500.0, PaymentMethod.BANKSLIP), invoice.getPayments().get(1));
	}

	
}
