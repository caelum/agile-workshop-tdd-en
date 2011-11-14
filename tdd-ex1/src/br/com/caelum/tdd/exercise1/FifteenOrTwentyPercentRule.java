package br.com.caelum.tdd.exercise1;

public class FifteenOrTwentyPercentRule implements Rule{

	public double calculateOn(Employee employee) {
		if(employee.getBaseSalary() > 5000.0) {
			return employee.getBaseSalary() * 0.80;
		}
		else {
			return employee.getBaseSalary() * 0.85;
		}
	}

}
