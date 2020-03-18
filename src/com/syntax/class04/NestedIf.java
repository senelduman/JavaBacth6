package com.syntax.class04;

public class NestedIf {
public static void main(String[] args) {
	
	boolean classeToday = false;
	boolean flag = true;
	
	if (flag) {
		System.out.println("Hello");
		
		if (classeToday) {
			System.out.println("Hello friends");
		}else {
			System.out.println("Hello family");
		}
	
	}else {
		System.out.println("Bye");
		
	}
	System.out.println("I am outside of if condition");
	
	
}
}
