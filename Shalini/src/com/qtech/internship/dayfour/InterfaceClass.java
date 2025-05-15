 package com.qtech.internship.dayfour;

public class InterfaceClass implements InterfaceOne, InterfaceTwo {
	@Override
	public void display() {
		System.out.println("Display method");
}
@Override
public void print() {
		System.out.println("print method");
} 
public static void main(String[]args) {
	     InterfaceClass i=new InterfaceClass();
	     i.display();
	     i.print();
}

	
}	
	