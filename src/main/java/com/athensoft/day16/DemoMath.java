package com.athensoft.day16;

public class DemoMath {
	
	final static double E = 2.717;
	
	final static double PI = 3.14159;
	
	public static double abs(double x) {
		return x>0 ? x : -x;
	}
	
	public static void main(String[] args) {
		System.out.println(DemoMath.E);
		
		System.out.println(DemoMath.abs(-1.5));
			
	}

}
