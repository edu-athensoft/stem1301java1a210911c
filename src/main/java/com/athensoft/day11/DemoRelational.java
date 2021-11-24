package com.athensoft.day11;

public class DemoRelational {

	
	public static void testEquality() {
		int a = 10;
		int b = 9;
		
		System.out.println(a==b);
		
		int c = 10;
		
		System.out.println(a==c);
			
	}
	
	public static void testInequality() {
		int a = 10;
		int b = 9;
		
		System.out.println(a!=b);
		
		int c = 10;
		
		System.out.println(a!=c);
			
	}
	
	/**
	 * To check if all are true, then it returns true, otherwise it returns false 
	 */
	public static void testLogicalAnd() {
		boolean s1 = false;
		boolean s2 = false;
		
		System.out.println(s1 && s2);
		
		s1 = true;
		s2 = false;
		
		System.out.println(s1 && s2);
		
		s1 = false;
		s2 = true;
		
		System.out.println(s1 && s2);
		
		s1 = true;
		s2 = true;
		
		System.out.println(s1 && s2);	
	}
	
	
	/**
	 * To check if any is true, then it returns true, otherwise it returns false 
	 */
	public static void testLogicalOr() {
		boolean s1 = false;
		boolean s2 = false;
		
		System.out.println(s1 || s2);
		
		s1 = true;
		s2 = false;
		
		System.out.println(s1 || s2);
		
		s1 = false;
		s2 = true;
		
		System.out.println(s1 || s2);
		
		s1 = true;
		s2 = true;
		
		System.out.println(s1 || s2);
		
		boolean s3 = 5 > 3;	//true
		boolean s4 = 5 < 3; //false
		
		System.out.println(s3 || s4);
		
	}
	
	
	/**
	 * To get the reversed logical value
	 */
	public static void testLogicalNot() {
		boolean flag = true;
		
		System.out.println(flag);
		
		System.out.println(!flag);
		
		boolean flag2 = false;
		
		System.out.println(!flag2);
	}
	
	public static void testLogicalOper() {
		boolean expr1 = 5> 3;
		boolean expr2 = 5> 2;
		
		boolean result1 = expr1 && expr2;
		System.out.println(result1);
		
		boolean result2 = expr1 || expr2;
		System.out.println(result2);
		
		boolean result3 = !expr1 || !expr2;
		System.out.println(result3);
		
		result3 = (!expr1) || (!expr2);
		System.out.println(result3);
			
	}
	
	public static void main(String[] args) {
		testLogicalOper();
//		testLogicalOr();
//		testLogicalAnd();

	}

}
