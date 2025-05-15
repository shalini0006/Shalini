package com.qtech.internship.daythree;

public class MethodOverloading {
    int add(int a, int b) {
    return a+b;

}
        
	int add(int a, int b, int c) {
    return a+b+c;
	}
	    
	float add(int a, float b) {
	return a+b;
	}
	float add(float a, int b) {
    return a+b;
	}

public static void main(String[]args)
{
    MethodOverloading m=new MethodOverloading();
	System.out.println(m.add(45,34));
    System.out.println(m.add(45,78,56));
    System.out.println(m.add(76, 45.3f));
    System.out.println(m.add(76.6f, 46));

}

}
        
        

        
	
	




