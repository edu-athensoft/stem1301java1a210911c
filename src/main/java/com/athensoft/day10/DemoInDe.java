package com.athensoft.day10;

public class DemoInDe {

	/**
	 * ++
	 */
	public static void testIncreament() {
		int n = 0;
		System.out.println(n);
		
//		n++;
		++n;
		
		System.out.println(n);
		
	}
	
	public static void testIncreament2() {
		int n = 0;
		System.out.println(n);
	
//		System.out.println(n++);
		
		System.out.println(++n);
		
//		System.out.println(n);
		
	}
	
	public static void testDeceament() {
		int n = 0;
		System.out.println(n);
		
//		n--;
		--n;
		
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		
		testIncreament2();
//		testDeceament();
//		testIncreament();
	}

}
