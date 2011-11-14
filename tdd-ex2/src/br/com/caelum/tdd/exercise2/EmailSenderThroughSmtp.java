package br.com.caelum.tdd.exercise2;

public class EmailSenderThroughSmtp implements EmailSender {

	public void sendMail(Invoice nf) {
		System.out.println("envia email da nf " + nf.getId());
	}

}
