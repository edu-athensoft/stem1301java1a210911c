package com.athensoft.day12;

public class DemoLogicalShortCircut {
	public static void main(String[] args) {
		
		boolean b1 = 5>3 && 3 > 5;
		System.out.println(b1);
		
		
		// short circuit
		boolean b2 = 3 > 5 && 5 > 3;
		System.out.println(b2);
		
		
		//slower, because expr2 is also calculated.
		b2 = 3 > 5 & 5 > 3;
		System.out.println(b2);
		
		
		boolean b3 = 5>3 || 3 > 5;
		System.out.println(b3);
		
		
		//slower method
		b3 = 3 > 5 | 5 > 3;
		System.out.println(b3);
		
		
		
	}
}
