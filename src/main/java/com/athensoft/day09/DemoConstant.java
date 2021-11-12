package com.athensoft.day09;

/**
 * A constant is a variable which cannot be changed at any time
 * @author Athens
 *
 */
public class DemoConstant {

	public static void main(String[] args) {
		
		// to declare a constant with final
		final double PI = 3.14;			//constant  //recommended
		
		// we cannot reassign for a constant
		// even with the same value
//		PI = 3.14;
		
		// the modifier should before the keyword of data type
//		double final a ;  //ERROR
		
		// to initialize it immediately
		final double E;
//		System.out.println();  //not recommended
		E = 2.7;
		
		// name convention for constant in Java
		final String NAME = "Athensoft";
		
		final int MY_YEAR = 2015;
		
//		final int MY-YEAR = 205;
		
		final int MyYear = 2015;	// constant
		
//		final String name = "Athensoft";	//correct but not recommended.
		
		
		}

}
