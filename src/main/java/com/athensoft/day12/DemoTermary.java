package com.athensoft.day12;

public class DemoTermary {

	/**
	 * there is a given number n, 
	 * if it is an even number , it shows 'Even'
	 * otherwise it shows 'Odd'
	 * @param args
	 */
	
	public static void isOddOrEven() {
		int n = 7;
		String result = "";
		
		result = n % 2 == 0 ? "Even": "Odd";
		
		System.out.println(result);
			
	}
	
	/**
	 * if a given number is greater than 0, output the number is positive.
	 * otherwise output the number is not positive.
	 */
	
	public static void isPositive() {
		int n = -10;
		String result = "";
		
		result = n>0 ? "Positive": "Not positive";
		
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		isPositive();
		isOddOrEven();
	}

}
