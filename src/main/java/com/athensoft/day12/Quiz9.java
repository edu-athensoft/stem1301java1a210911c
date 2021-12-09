package com.athensoft.day12;

public class Quiz9 {
	
	public static void q8() {
		int b = 9;	
		
		
		System.out.println(b--);
		
		
		System.out.println(b--);
	}
	
	public static void q7() {
		int b = 9;		
		System.out.println(--b);
		System.out.println(--b);
	}
	
	public static void q6() {
		int a = 8;
		System.out.println(a++);  // a= 8
		
		System.out.println(a);	 // a =
	}
	
	public static void q5() {
		int a = 8;
		System.out.println(++a);  // a= 9
		
		System.out.println(a);	 // a =9	
	}
	
	public static void q4() {
		int a = 8;
		System.out.println(++a);
	}
	
	public static void main(String[] args) {
		q8();
//		q7();
//		q6();
//		q5();
//		q4();
	}
}
