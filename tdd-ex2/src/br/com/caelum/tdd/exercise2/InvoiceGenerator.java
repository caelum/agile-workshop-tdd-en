package br.com.caelum.tdd.exercise2;

public class InvoiceGenerator {

	private final EmailSender email;
	private final InvoiceDao dao;

	public InvoiceGenerator(EmailSender email, InvoiceDao dao) {
		this.email = email;
		this.dao = dao;
	}
	
	public Invoice generate(Basket basket) {
		
		double basketTotalAmount = basket.total();
		
		Invoice invoice = new Invoice(basketTotalAmount, taxesOver(basketTotalAmount));
		
		email.sendMail(invoice);
		dao.persist(invoice);

		return invoice;
	}

	private double taxesOver(double valor) {
		return valor * 0.06;
	}
}
