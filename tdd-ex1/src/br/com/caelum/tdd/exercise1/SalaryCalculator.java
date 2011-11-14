package br.com.caelum.tdd.exercise1;


public class SalaryCalculator {

	public double incomeForA(Employee employee) {
		return employee.getPosition().getRule().calculateOn(employee);
	}

}
