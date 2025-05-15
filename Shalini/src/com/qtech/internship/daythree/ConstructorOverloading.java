package com.qtech.internship.daythree;

public class ConstructorOverloading {
	//Default constructor
	public ConstructorOverloading() {
		System.out.println("default constructor");
	}
	int ConstructorOverloading(int a, int b) {
		return a+b;
	}
	int ConstructorOverloading(int a) {
		return a;
	}
	
	public static void main (String[] args) {
		ConstructorOverloading c = new ConstructorOverloading();
	    System.out.println(c.ConstructorOverloading(67));
        System.out.println(c.ConstructorOverloading(45, 78));
	
	}

}
