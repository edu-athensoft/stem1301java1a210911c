package com.athensoft.day11;

public class Quiz8 {

	public static void q9() {
		int a = 9;
		int b = -9;
		int c = 4;
		int d = -4;
		
//		System.out.println(c%a);
//		System.out.println(d%a);
//		System.out.println(c%b);
//		System.out.println(d%b);
		
		System.out.println(c%a+d%a+c%b+d%b);
	}
	
	public static void q10() {
		int a = 9;
		int b = -9;
		int c = 4;
		int d = -4;
		
		System.out.println(c%a);
		System.out.println(d%a*c%b);
		System.out.println(d%b);
		
		System.out.println(c%a+d%a*c%b-d%b);

	}
	
	public static void q11() {
		double a = 0;
		double b = 0;

		System.out.println(a/b);
	}
	
	public static void q12() {
		int a = 0;
		double b = 0;

		System.out.println(a/b);
	}
	
	public static void q13() {
		double a = 0;
		int b = 0;

		System.out.println(a/b);
	}
	
	public static void q14() {
		double a = 0;
		String b = 0+" ";
//		System.out.println(a/b);
	}
	
	public static void q15() {
		double a = 0;
//		int b = Integer.parseInt(0+" ");
		int b = Integer.parseInt(0+"");
		System.out.println(a/b);
		
		System.out.println(Integer.parseInt("123"));
	}
	
	public static void main(String[] args) {
		q15();
//		q10();
//		q9();
	}

}
