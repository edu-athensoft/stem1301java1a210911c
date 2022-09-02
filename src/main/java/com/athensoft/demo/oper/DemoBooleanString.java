package com.athensoft.demo.oper;

public class DemoBooleanString {

	public static void main(String[] args) {
		boolean b1 = true;
		String s1 = String.valueOf(b1);
		System.out.println("s1="+s1);
		
		String s2 = "false";
		boolean b2 = Boolean.valueOf(s2);
		System.out.println("b2="+b2);
		
		boolean b3 = Boolean.parseBoolean(s2);
		System.out.println("b3="+b3);
		
	}

}
