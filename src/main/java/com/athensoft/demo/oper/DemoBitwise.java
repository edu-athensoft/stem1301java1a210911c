package com.athensoft.demo.oper;

public class DemoBitwise {


	/**
	 * 0b0101 & 0b0100 = 0b0100 => 4
	 */
	public static void bitwiseAnd() {
		int a = 5;
		int b = 4;
		int result = a & b;
		System.out.println(a+"&"+b+"="+result);
	}
	
	/**
	 * 0b0101 | 0b0100 = 0b0101 => 5
	 */
	public static void bitwiseOr() {
		int a = 5;
		int b = 4;
		int result = a | b;
		System.out.println(a+"|"+b+"="+result);
	}
	
	/**
	 * 0b0101 ^ 0b0100 = 0b0001 => 1
	 */
	public static void bitwiseXor() {
		int a = 5;
		int b = 4;
		int result = a ^ b;
		System.out.println(a+"^"+b+"="+result);
	}
	
	/**
	 * 0b0101 | 0b0100 = 0b0101 => 5
	 */
	public static void bitwiseNot() {
		int a = 5;
		int result = ~a;
		System.out.println("~"+a+"="+result);
	}
	
	
	/**
	 * 0b01111111 >> 3 = 0b00001111
	 */
	public static void bitwiseRightShift() {
		int a = 127;
		int b = 3;
		int result = a>>b;
		System.out.println(a+">>"+b+"="+result);
	}
	
	/**
	 * 0b00001111 << 3 = 0b01111111
	 */
	public static void bitwiseLeftShift() {
		int a = 15;
		int b = 2;
		int result = a<<b;
		System.out.println(a+"<<"+b+"="+result);
	}
	
	/**
	 * 0b11111111 >>> 3 = 536870911
	 */
	public static void bitwiseUnsignedRightShift() {
		int a = -1;
		int b = 3;
		int result = a>>>b;
		System.out.println(a+">>>"+b+"="+result);
	}
	
	public static void main(String[] args) {
		bitwiseAnd();
		bitwiseOr();
		bitwiseXor();
		bitwiseNot();
		
		bitwiseRightShift();
		bitwiseLeftShift();
		bitwiseUnsignedRightShift();
	}
}
