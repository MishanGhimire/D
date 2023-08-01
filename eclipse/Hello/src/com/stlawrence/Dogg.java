package com.stlawrence;

public class Dogg {
	public static void main(String[] args) {
		Dog dog = new Dog();
		
		dog.name = "Alex";
		dog.breed = "German Shepherd";
		
		Dog dog1 = new Dog();
		dog1.name = "Drama Queen";
		dog1.breed = "Husky";
		
		dog.show();
		dog1.show();
	}
}