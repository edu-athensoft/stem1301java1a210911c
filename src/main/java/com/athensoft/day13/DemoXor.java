package com.athensoft.day13;

public class DemoXor {

	public static void main(String[] args) {
		//^ stands for XOR
		
		boolean a = true;
		boolean b = true;
		boolean result = a ^ b;
		System.out.println("a ^ b = "+result);
		
		 a = false;
		 b = false;
		 result = a ^ b;
		System.out.println("a ^ b = "+result);
		
		 a = true;
		 b = false;
		 result = a ^ b;
		System.out.println("a ^ b = "+result);
		
		 a = false;
		 b = true;
		 result = a ^ b;
		System.out.println("a ^ b = "+result);

	}

}
