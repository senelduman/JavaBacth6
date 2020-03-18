package com.syntax.class12;

public class HW1 {
	public static void main(String[] args) {
//Write a program to swap 2 numbers without a temporary variable? 
//Swap  2 strings without a temporary variable?
		int a = 2;
		int b = 4;   
//  ais a veribale
//		int temp=a;
//		a = b;
//		b = temp;
//		
//		System.out.println("a="+a);
//		System.out.println("b="+b);

	
		a=b+a;
		b=a-b;
		a=a-b;
		
		//a=a+b-(b=a);
	
	System.out.println("a="+a);
	System.out.println("b="+b);
	}
}
