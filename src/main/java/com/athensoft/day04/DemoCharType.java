package com.athensoft.day04;

public class DemoCharType {

	public static void main(String[] args) {
		// char type is also unsigned integer type
		
		char c1 = 'a';
		
		System.out.println(c1);
		
		char c2 = ' ';   // whitespace char is a normal char
		System.out.println("|"+c2+"|");
		
		char c3 = '\u00c9';
		System.out.println(c3);
		
		char c4 = '\t';
		System.out.println("|"+c4+"|");
		
		
		//anti-pattern or anti-example
		
//		char c5 = "a";		//error
		
//		char c6 = 'ac';		//error
		
			

	}

}
