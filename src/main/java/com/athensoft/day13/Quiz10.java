package com.athensoft.day13;

public class Quiz10 {

	public static void q6() {
		boolean a = true; 
		boolean b = 9-6 >= 3; 
		System.out.println(a||b); 
	}
	
	public static void q7() {
		 boolean a = false; 
		 boolean b = 9-6 <= 3; 
		 System.out.println(a&&b); 
	}
	
	public static void q8() {
		boolean a = 9-6 >= 3; 
		 boolean b = 9-6 <= 3; 
		 boolean c = true; 
		 System.out.println(a&&b||a&&!c); 
	}
	
	public static void q9() {
		boolean a = 9-6 >= 3; 	//true
		 boolean b = 9-6 <= 3; 	//true
		 boolean c = true; 		//true
		 System.out.println(a&&b|a&&c); 

	}
	
	public static void q10() {
		 boolean a = 9-6 >= 3; 
		 boolean b = 9-6 <= 3; 
		 boolean c = true;
		 System.out.println(!a&&(b|a&&c)); 
	}
	
	public static void q11() {
		boolean a = true;  
		boolean b = false; 
		 System.out.println((a^b)+","+(!a^b)); 
	}
	
	public static void main(String[] args) {
		q6();
		
		//how to call the method of q7
		q7();
		
		q8();
		
		q9();
		q10();
		q11();
			
	}

}
