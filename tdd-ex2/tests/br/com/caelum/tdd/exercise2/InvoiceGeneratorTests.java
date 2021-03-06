package br.com.caelum.tdd.exercise2;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;

import br.com.caelum.tdd.exercise2.Basket;
import br.com.caelum.tdd.exercise2.EmailSender;
import br.com.caelum.tdd.exercise2.Invoice;
import br.com.caelum.tdd.exercise2.InvoiceDao;
import br.com.caelum.tdd.exercise2.InvoiceGenerator;
import br.com.caelum.tdd.exercise2.Item;

public class InvoiceGeneratorTests {

	private static final double DELTA = 0.00001;
	private EmailSender email;
	private InvoiceDao dao;
	private InvoiceGenerator generator;

	@Before
	public void setUp() {
		email = mock(EmailSender.class);
		dao = mock(InvoiceDao.class);

		generator = new InvoiceGenerator(email, dao);
	}
	
	@Test
	public void shouldGenerateInvoiceWith6PercentOfTaxes() {
		Basket basket = new Basket("customer 1");
		basket.addItem(new Item("Product 1", 10, 100.0));
		
		Invoice nf = generator.generate(basket);
		
		assertEquals(1000 * 0.06, nf.getTaxes(), DELTA);
	}
	
	@Test
	public void shouldSendEmailWithTheInvoice() {
		Basket basket = new Basket("customer 1");
		basket.addItem(new Item("Product 1", 10, 100.0));
		
		Invoice nf = generator.generate(basket);
		
		verify(email).sendMail(nf);
	}
	
	@Test
	public void shouldPersistTheGenerateInvoice() {
		Basket basket = new Basket("customer 1");
		basket.addItem(new Item("Product 1", 10, 100.0));
		
		Invoice nf = generator.generate(basket);
		
		verify(dao).persist(nf);
	}
}
