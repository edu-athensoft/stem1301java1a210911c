package com.athensoft.day09;

public class DemoOperator {

	public static void testAddtion() {
		System.out.println("testAddtion()");
		int a = 1;		// operand 1
		int b = 2;		// operand 2
		
		int result = a + b ;  //expression
		// int + int -> int / long
		
		long result2 = a + b;
		System.out.println(result);	
		
		
		double d = 10.0;
//		double result3 = a + d;
		// int + double -> double
		
		float result3 = (float)(a + d);
		// int + double -> double -> float
		
		long a2 = 100L;
		int a3 = (int)a2;
		
		float f = 20.0f;
		float result4 = a + f;
		double result5 = a + f;
		// int + float -> float -> double
				
	}
	
	public static void testSub() {
		System.out.println("testSub()");
		
		int a = -1;
		
//		a = --1; //error
		a = -(-1);
		
//		--a;   //to decrease the value of a by 1
		
		
	}
	
	public static void testMulti() {
		System.out.println("testMulti()");
		
		int a = 3;
		int b = 6;
		
//		a x b 
		long result = a * b; // not sure that is big or not
//		int * int => 
		int result2 = a * b;  // be sure that it is not too big 
		
	}
	
	public static void testDivision() {
		System.out.println("testDivision()");
		
		int a = 5;
		int b = 2;
		int result = a / b;
		
		System.out.println("a / b="+result);
		
		// in python or javascript
		// a / b = 2.5
		
		double result2 = (double) a / b;
		System.out.println("a / b="+result2);
		
		double result3 = a / (double)b;
		System.out.println("a / b="+result3);
		
		
		//divided by 0
		int z = 0;
		
		// Runtime exception
		int result4 = a/z;
		
//		int result5 = a/z
				
				
	}
	
	public static void main(String[] args) {
		
		System.out.println("Program started.");	
		
		testDivision();
		
		testMulti();
		
		testSub();
		
		testAddtion();		
		
		System.out.println("Program ended.");

	}

}
