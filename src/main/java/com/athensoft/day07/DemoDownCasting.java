package com.athensoft.day07;

/**
 * Down-casting
 * narrowing casting
 * 
 * manually
 * down casting may cause information lost or precision lost.
 * 
 * @author Athens
 *
 */
public class DemoDownCasting {

	public static void main(String[] args) {
		
		double a1 = 10.5;
		
//		int b = a;		//ERROR
		
		int b1 = (int)a1;   //down casting
		
		System.out.println(b1);
		
		
		// converting long to int
		long b = 500;  
		int a= (int)b;  
		System.out.println(a);  


	}

}
