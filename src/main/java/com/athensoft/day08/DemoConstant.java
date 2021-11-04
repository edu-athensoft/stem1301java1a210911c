package com.athensoft.day08;

/**
 * constants in Java
 * @author Athens
 *
 */
public class DemoConstant {

	public static void main(String[] args) {
		int a = 123;
		System.out.println(a);
		
		a = 456;		
		System.out.println(a);
		
		
		// final is a keyword for declaring a constant
		final double PI = 3.14;		// constant
		double r = 1.0;
		double s = PI * r * r;
//		PI = 3.14159; //ERROR
		System.out.println(s);
		
		//Pi 
		
//		final double Pi;
//		Pi = 3.14;
		
		final double Pi = 3.14;  //recommended
		

	}

}
