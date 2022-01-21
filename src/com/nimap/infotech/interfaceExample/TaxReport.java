package com.nimap.infotech.interfaceExample;

public class TaxReport {
	// Dependency Injection
	private TaxCalculator calculator;

	public TaxReport(TaxCalculator calculator) {
		this.calculator = calculator;
	}

	public void show(TaxCalculator calculator) {
		double calculateTax = calculator.calculateTax();
		System.out.println(calculateTax);
	}
	
}
