package com.inheritance;

public class Main {
	public static void main(String [] args) {
		Truck tk = new Truck();
		
		tk.setLoad(123);
		tk.setColor("Red");
		tk.setCc(1111);
		 System.out.println(tk.getCc());
	     System.out.println(tk.getLoad());
	     System.out.println(tk.getColor());
	}
}
