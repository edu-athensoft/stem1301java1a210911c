package com.athensoft.demo;

public class DemoCharInt {
	public static void main(String[] args) {
		char c1 = 'a';
		System.out.println("char c1="+c1);
		
		int a1 = (int)c1;
		System.out.println("int a1="+a1);
		
		int a2 = c1 + 1;
		System.out.println("int a2="+a2);
		
		char c2 = (char)(a1);
		System.out.println("char c2="+c2);	
	}
}
