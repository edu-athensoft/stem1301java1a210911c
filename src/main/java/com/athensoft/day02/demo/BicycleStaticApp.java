package com.athensoft.day02.demo;

/**
 * No instances are required.
 * @author Athens
 *
 */
public class BicycleStaticApp {

	public static void main(String[] args) {
		System.out.println(Bicycle.numberOfBicycles);
		
		Bicycle.numberOfBicycles = 1;
		System.out.println(Bicycle.numberOfBicycles);
		
		Bicycle.numberOfBicycles = 2;
		System.out.println(Bicycle.numberOfBicycles);

	}

}
