package com.athensoft.day10;

public class Quiz8 {

	public static void q1() {
		System.out.println("q1()");
		
		int a = 10;
		float b = 5.5f;
		System.out.println(a+b);

	}
	
	public static void q2() {
		System.out.println("q2()");
		
		int a = 10;
		float b = 5.5f;
		String c = "abc";
		System.out.println(a+b+c);

	}
	
	public static void q3() {
		System.out.println("q3()");
		
		int a = 10;
		float b = 5.5f;
		String c = "abc";
		System.out.println(c+b+a);
	}
	
	public static void q4() {
		System.out.println("q4()");
		
		int a = 9;
		int b = 6;
//		int c = 3;
		int c = 4;
		
		System.out.println(a/c+b*c);

	}
	
	public static void q5() {
		System.out.println("q5()");
		
		int a = 9;
		int b = 6;
		int c = 0;
		System.out.println(a/c+b*c);

	}
	
	public static void q7() {
		System.out.println("q7()");
		
		int a = -9;
		int b = 6;
		double c = 0.0;
		System.out.println(a/c+b*c);
	}
	
	public static void q8() {
		System.out.println("q8()");
		
		int a = 9;
		int b = 6;
		int c = 3;
		System.out.println((a+c)/c/b*a-c);

	}
	
	
	public static void main(String[] args) {
		
		q8();
//		q7();
//		q5();
		
//		q4();
//		q3();
//		q2();
//		q1();

	}

}
