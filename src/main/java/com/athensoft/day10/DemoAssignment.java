package com.athensoft.day10;

/**
 * Compound assignment operator
 * @author Athens
 *
 */
public class DemoAssignment {

	
	public static void testCompoundAssignment() {
		int x = 9;
		System.out.println(x);
		
//		x = x + 1;		//assignment
		
		x += 1;
		
		System.out.println(x);
		
		x -= 1;
		
		x *= 2;
		
		x /= 2;
		
		x %= 2;
		
		
	}
	
	public static void main(String[] args) {
		testCompoundAssignment();

	}

}
