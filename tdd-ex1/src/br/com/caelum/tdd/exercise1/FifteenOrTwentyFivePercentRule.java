package br.com.caelum.tdd.exercise1;

public class FifteenOrTwentyFivePercentRule implements Rule{

	public double calculateOn(Employee employee) {
		if(employee.getBaseSalary() > 2000.0) {
			return employee.getBaseSalary() * 0.75;
		}
		else {
			return employee.getBaseSalary() * 0.85;
		}
	}

}
