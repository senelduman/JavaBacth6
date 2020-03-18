package com.syntax.class03;

public class AdditionVsConcatenation {
	public static void main(String[] args) {
		int a =10;
		int b =20;
		
		String x ="Hello";
		
		String y = "Bye";
		
		System.out.println(a+b+x+y);//30hellobye
		System.out.println(a+x+b+y);//10hello20bye
		System.out.println(x+y+a+b);//hellobye 1020
	
		System.out.println(x+y+(a+b));//hellonye30
		System.out.println(a+""+b+x+y);//1020hellobye
	
	}

}
