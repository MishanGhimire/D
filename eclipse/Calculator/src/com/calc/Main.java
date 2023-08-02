package com.calc;

public class Main {
	public static void main(String[] args) {
		Calc calc = new Calc();
		
		int s = calc.add(8, 9);
		int s1 = calc.sub(10, 5);
		
		System.out.println(s+" : "+s1);
	}
}
