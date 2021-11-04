package com.athensoft.day08;

/**
 * A-Z
 * ABCDEFGHI...Z
 * 
 * to get the 10th letter
 * 
 * to get the 3rd letter to verify
 * 
 * @author Athens
 *
 */
public class DemoChar {

	public static void main(String[] args) {
		
		char c1 = 'A';
		System.out.println(c1);
		
		int a1 = c1;
		System.out.println(a1);
		
		int a2 = a1 + 10 -1;		//important, A is already counted.
		System.out.println(a2);
		
		char c2 = (char)a2;
		System.out.println(c2);
		
	}
}
