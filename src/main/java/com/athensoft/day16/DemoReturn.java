package com.athensoft.day16;

//import java.lang.*;

public class DemoReturn {

	public static void callMethod1() {
		System.out.println("callMethod1()");
		
//		return ;
		
	}
	
	public static int callMethod2() {
		System.out.println("callMethod2()");
		
		int a = 100;
		
		return a;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Started");
		
		callMethod1();
		
		System.out.println("Continued");
		
		int result = callMethod2();
		System.out.println(result);
		
		result = 2 * result;
		System.out.println(result);
		
		
//		System.out.println(callMethod2());
		
		System.out.println("Finished");
		
	}

}
