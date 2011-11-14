package br.com.caelum.tdd.exercise7;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class InvoiceFilter {

	public List<Invoice> filter(List<Invoice> originalList) {
		
		List<Invoice> filteredList = new ArrayList<Invoice>();
		
		for(Invoice invoice : originalList) {
			if(!rule1(invoice) && !rule2(invoice)) {
				filteredList.add(invoice);
			}
		}
		
		return filteredList;
		
	}

	private boolean rule2(Invoice invoice) {
		Calendar aMonthAgo = Calendar.getInstance();
		aMonthAgo.add(Calendar.MONTH, -1);
		
		return invoice.getAmount()> 2000 && invoice.getAmount()<2500 && invoice.getDate().before(aMonthAgo);
	}

	private boolean rule1(Invoice invoice) {
		return invoice.getAmount() < 2000;
	}
}
