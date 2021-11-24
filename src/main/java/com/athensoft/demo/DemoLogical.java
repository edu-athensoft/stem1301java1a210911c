package com.athensoft.demo;

public class DemoLogical {
	
	public static void q8() {
		System.out.print("question 8. ");
		boolean a = 9-6 >= 3;
		boolean b = 9-6 <= 3;
		boolean c = true;
		System.out.println(a&&b||a&&!c);
	}
	
	public static void q9() {
		System.out.print("question 9. ");
		boolean a = 9-6 >= 3;
		boolean b = 9-6 <= 3;
		boolean c = true;
		System.out.println(a&&b|a&&c);
	}
	
	public static void q10() {
		System.out.print("question 10. ");
		boolean a = 9-6 >= 3;
		boolean b = 9-6 <= 3;
		boolean c = true;
		System.out.println(!a&&(b|a&&c));
	}
	
	public static void q11() {
		System.out.print("question 11. ");
		boolean a = true;
		boolean b = false;
		System.out.println((a^b)+","+(!a^b));
	}
	
	public static void main(String[] args) {
		q8();
		q9();
		q10();
		q11();
	}
	
	

}
