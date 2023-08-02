package com.calc;

public class Main {
	public static void main(String[] args) {
		Calcv2 calc = new Calcv2();
		
		int s = calc.add(8, 9);
		int s1 = calc.sub(10, 5);
		int s2= calc.div(8, 8);
		int s3= calc.multi(10, 5);
		System.out.println(s+" : "+s1+ ": "+ s2 + " : "+ s3);
	}
}
