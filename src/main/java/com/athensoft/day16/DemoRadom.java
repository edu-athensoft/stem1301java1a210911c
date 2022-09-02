package com.athensoft.day16;

public class DemoRadom {

	public static void getRandom() {
		// range 0 to 1
		double r = Math.random();
		
		System.out.println(r);
	}
	
	public static int getRandom0toA(int a) {
		// range 0 to a		
		// upper bound is a
		// lower bound is 0
		
		int R = (int)(a * Math.random());
		return R;
		
//		return ;
		
	}
	
	
	/**
	 * hidden bug
	 * @param a
	 * @param b
	 * @return
	 */
	public static int getRandomAtoB(int a, int b) {
		int lowerBound = a;
		int upperBound = b;

		// upperBound will also be included
		int range = (upperBound - lowerBound) + 1;
		int randomNum = (int)(Math.random() * range) + lowerBound;

		return randomNum;
	}
	
	
	public static void main(String[] args) {
//		getRandom();
//		getRandom();
//		getRandom();
//		getRandom();
//		getRandom();	
		
//		System.out.println(getRandom0toA(6));
//		System.out.println(getRandom0toA(6));
//		System.out.println(getRandom0toA(6));
//		System.out.println(getRandom0toA(6));
//		System.out.println(getRandom0toA(6));
//		System.out.println(getRandom0toA(6));
		
		
		System.out.println(getRandomAtoB(1, 6));
		System.out.println(getRandomAtoB(1, 6));
		System.out.println(getRandomAtoB(1, 6));
		System.out.println(getRandomAtoB(1, 6));
		System.out.println(getRandomAtoB(1, 6));
		System.out.println(getRandomAtoB(1, 6));
		
		System.out.println(getRandomAtoB(1, 6));
		System.out.println(getRandomAtoB(1, 6));
		System.out.println(getRandomAtoB(1, 6));
		System.out.println(getRandomAtoB(1, 6));
		System.out.println(getRandomAtoB(1, 6));
		System.out.println(getRandomAtoB(1, 6));
		
		System.out.println(getRandomAtoB(1, 6));
		System.out.println(getRandomAtoB(1, 6));
		System.out.println(getRandomAtoB(1, 6));
		System.out.println(getRandomAtoB(1, 6));
		System.out.println(getRandomAtoB(1, 6));
		System.out.println(getRandomAtoB(1, 6));
		
	}

}
