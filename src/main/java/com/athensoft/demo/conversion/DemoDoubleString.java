package com.athensoft.demo.conversion;

public class DemoDoubleString {

	public static void main(String[] args) {
		double d1 = 123.0;
		String s1 = String.valueOf(d1);
		System.out.println("s1="+s1);
		
		String s2 = "456.0";
		double d2 = Double.parseDouble(s2);
		System.out.println("d2="+d2);

	}

}
