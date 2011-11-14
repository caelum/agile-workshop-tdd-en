package br.com.caelum.tdd.exercise2;

public class InvoiceDaoMySql implements InvoiceDao {

	public void persist(Invoice nf) {
		System.out.println("salva nf no banco");
	}

}
