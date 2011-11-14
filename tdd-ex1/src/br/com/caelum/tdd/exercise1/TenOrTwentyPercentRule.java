package br.com.caelum.tdd.exercise1;

public class TenOrTwentyPercentRule implements Rule {

	/* (non-Javadoc)
	 * @see br.com.caelum.tdd.exercise1.Rule#calculateOn(br.com.caelum.tdd.exercise1.Employee)
	 */
	public double calculateOn(Employee employee) {
		if(employee.getBaseSalary() > 3000.0) {
			return employee.getBaseSalary() * 0.8;
		}
		else {
			return employee.getBaseSalary() * 0.9;
		}
	}

}
