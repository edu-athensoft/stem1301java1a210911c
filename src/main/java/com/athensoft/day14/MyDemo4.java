package com.athensoft.day14;

/**
 * 1. how to define an instance method
 * 2. how to call an instance method
 * 3. how to call an instance method within main method
 * @author Athens
 *
 */
public class MyDemo4 {

	public static void main(String[] args) {
//		foo3();  //error
		
		// to create an object
		MyDemo4 demo4 = new MyDemo4();
		
		// call the method of the object demo4
		demo4.foo3();
		

	}
	
	public void foo3() {
		System.out.println("hello instance method!");
	}

}
