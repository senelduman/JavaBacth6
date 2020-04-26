package com.syntax.class18;

public class TASK2 {
	/*Create a method that will take a String as a 
	 * parameter and returns reverse String. 
	 * Method should be available to all classes within your 
	 * projects and accessible by class name.
	 */
	public static String word;
	public static void method1() {
		char reverse;
		for ( int a=word.length(); a>0; --a) {
			reverse=word.charAt(a-1);
			System.out.print(reverse);	}
	}
		public static void main(String[] args) {
			TASK2 obj= new TASK2();
			obj.word=“syntax”;
			method1();
}
}

