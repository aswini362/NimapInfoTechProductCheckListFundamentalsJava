package com.nimap.infotech;

public class PrimtiveTypeCasting {

	public static void main(String[] args) {
		short s = 1;
		int x = 3 + s;
		System.out.println(x);

		double d1 = 1.1;
		double d2 = d1 + 2;
		System.out.println(d2);

		double d3 = 1.1;
		int d4 = (int) (d3 + 2);
		System.out.println(d4);

		String x1 = "1";
		int results = Integer.parseInt(x1) + 2;
		System.out.println(results);

		String x2 = "1.1";
		Double results1 = Double.parseDouble(x2) + 4;
		System.out.println(results1);
	}

}
