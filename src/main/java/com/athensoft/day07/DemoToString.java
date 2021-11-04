package com.athensoft.day07;

/**
 * Converting primitive type to String
 * 
 * How to get the data type of a variable or literal
 * @author Athens
 *
 */
public class DemoToString {

	public static void main(String[] args) {
		int a = 10;
		
		//solution 1. convert int to String
		String s1 = a + "";
		//get the type name of a variable or literal
		System.out.println(s1.getClass().getTypeName());
		
		// type()  in python
		
		String s2 = "" + a;
		System.out.println(s2.getClass().getTypeName());
		
		System.out.println("testString".getClass().getTypeName());
		
		//solution 2. String.valueOf()
		double d1 = 10.5;
		String s3 = String.valueOf(d1);	
		System.out.println(s3);
		
		
		

	}

}
