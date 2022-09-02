package com.athensoft.day16;

public class DemoString {


	public static void createString1() {
		char[] ch = {'j','a','v','a','s','t','r','i','n','g'};  
		String s = new String(ch); 
		
		//test
		System.out.println(s);
	}
	
	public static void createString2() {
		 
		String s = "javastring2";
		
		//test
		System.out.println(s);
	}
	
	
	public static void main(String[] args) {
		createString1();
		createString2();
	}

}
