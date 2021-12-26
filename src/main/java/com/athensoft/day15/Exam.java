package com.athensoft.day15;

/**
 * @author Athens
 *
 */
public class Exam {

	public static void q1() {
		// jkasdfasdkfjas
		System.out.print("hello world 1!");
		
		/*
		 * akaskdfjaskf
		 * asldkfjalskdfa
		 * asdl;kjals;df
		 */
		System.out.println("hello world 2!");
		System.out.println();
		System.out.print('\n');		//escape char: a new line
	}
	
	public static void q9() {
		int result = 5+5%2*2;
		System.out.println(result);
	}
	
	public static void q18() {
		 int a = 1; 
		 System.out.println(a++); 
		
	}
	
	public static void q31() {
//		 int value = 0, count = 1; 
		 
		 int value = 0;
		 int count = 1;
		 
		 value = count++ ; 
		 System.out.println("value: "+ value + "count: " + count );
	}
	
	public static void q32() {
		int a = 0, b = 10; 
		a = --b ; 
		System.out.println("a= " + a + " b= " + b ); 
	}
	
	public static void q22() {
		System.out.println(6>5?"Yes":"No");
	}
	
	public static void q23() {
		System.out.println(6<5?"Yes":"No");
	}
	
	public static void q36() {
		System.out.println(1/2);
		
		System.out.println((1/2 + 3.5) * 2.0);
	}
	
	public static void main(String[] args) {
//		q1();
//		q9();
//		q18();
//		q22();
//		q23();
//		q31();
//		q32();
		q36();
	}

}
