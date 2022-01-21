package com.nimap.infotech.interfaceExample;

public interface TaxCalculator {
	double calculateTax();

	static double getTaxabaleIncome(double income, double expenses) {
		return income - expenses;
	}
}
