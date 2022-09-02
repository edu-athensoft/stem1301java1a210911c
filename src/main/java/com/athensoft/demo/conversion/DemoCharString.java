package com.athensoft.demo.conversion;

public class DemoCharString {

	public static void main(String[] args) {
		//char to String
		char c1 = 'a';
		System.out.println("char c1="+c1);
		
		String s1 = 'a'+"";
		System.out.println("String s1="+s1);
		
		String s2 = String.valueOf('a');
		System.out.println("String s2="+s2);
		
		
		//String to char
		String s3 = "A";
		char c3 = s3.charAt(0);
	}

}
