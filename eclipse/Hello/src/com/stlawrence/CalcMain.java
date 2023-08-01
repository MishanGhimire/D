package com.stlawrence;

import java.util.Scanner;

public class CalcMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Calc calc = new Calc();

		System.out.println("Enter the 1st number:");
		int n1 = Integer.parseInt(input.nextLine());
		System.out.println("Enter the 2nd number:");
		int n2 = Integer.parseInt(input.nextLine());
		System.out.println(calc.add(n1, n2));

	}
}
