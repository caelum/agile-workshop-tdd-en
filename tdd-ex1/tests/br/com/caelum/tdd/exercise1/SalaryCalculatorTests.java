package br.com.caelum.tdd.exercise1;

import static br.com.caelum.tdd.exercise1.Position.*;

import static br.com.caelum.tdd.exercise1.Position.DEVELOPER;
import static br.com.caelum.tdd.exercise1.Position.TESTER;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.caelum.tdd.exercise1.Employee;
import br.com.caelum.tdd.exercise1.Position;
import br.com.caelum.tdd.exercise1.SalaryCalculator;

public class SalaryCalculatorTests {

	private SalaryCalculator calculate;

	@Before
	public void setUp() {
		calculate = new SalaryCalculator();
	}
	
	@Test
	public void shouldReturn4000MinusTaxesOf20PercentIfDeveloperEarnsMoreThan3000(){
		Employee dev = anEmployee(DEVELOPER, withBaseSalary(4000.0));
		
		double salary = calculate.incomeForA(dev);
		
		assertEquals(4000.0 * 0.8, salary, 0.000001);
	}

	@Test
	public void shouldReturn1000MinusTaxesOf10PercentIfDeveloperEarnsLessThan3000(){
		Employee dev = anEmployee(DEVELOPER, withBaseSalary(1000.0));
		
		double salary = calculate.incomeForA(dev);
		
		assertEquals(1000.0 * 0.9, salary, 0.000001);
	}


	@Test
	public void shouldReturn4000MinusTaxesOf25PercentIfDBAEarnsMoreThan2000(){
		Employee dba = anEmployee(DBA, withBaseSalary(4000.0));
		
		double salary = calculate.incomeForA(dba);
		
		assertEquals(4000.0 * 0.75, salary, 0.000001);
	}

	@Test
	public void shouldReturn1000MinusTaxesOf15PercentoIfDBAEarnsLessThan2000(){
		Employee dba = anEmployee(DBA, withBaseSalary(1000.0));
		
		double salary = calculate.incomeForA(dba);
		
		assertEquals(1000.0 * 0.85, salary, 0.000001);
	}

	@Test
	public void shouldReturn4000MinusTaxesOf25PercentIfTesterEarnsMoreThan2000(){
		Employee tester = anEmployee(TESTER, withBaseSalary(4000.0));
		
		double salary = calculate.incomeForA(tester);
		
		assertEquals(4000.0 * 0.75, salary, 0.000001);
	}

	@Test
	public void shouldReturn1000MinusTaxesOf15PercentIfTesterEarnsLessThan2000(){
		Employee tester = anEmployee(TESTER, withBaseSalary(1000.0));
		
		double salary = calculate.incomeForA(tester);
		
		assertEquals(1000.0 * 0.85, salary, 0.000001);
	}


	@Test
	public void shouldReturn6000MinusTaxesOf20PercentIfProjectManagerEarnsMoreThan5000(){
		Employee manager = anEmployee(PROJECT_MANAGER, withBaseSalary(6000.0));
		
		double salary = calculate.incomeForA(manager);
		
		assertEquals(6000.0 * 0.8, salary, 0.000001);
	}

	@Test
	public void shouldReturn1000MinusTaxesOf15PercentIfProjectManagerEarnsLessThan5000(){
		Employee manager = anEmployee(PROJECT_MANAGER, withBaseSalary(1000.0));
		
		double salary = calculate.incomeForA(manager);
		
		assertEquals(1000.0 * 0.85, salary, 0.000001);
	}

		
	private Employee anEmployee(Position position, double salary) {
		Employee employee = new Employee();
		employee.setName("John Locust");
		employee.setBaseSalary(salary);
		employee.setPosition(position);
		return employee;
	}
	

	private double withBaseSalary(double salary) {
		return salary;
	}
}
