package com.syntax.class03;

public class IfCondition {

	public static void main(String[] args) {
		
		System.out.println("Starting coding");
		
		int num= 178;
		
		if(num>100) {
			System.out.println("My number is large");
         }
		
		System.out.println("End of the pogram");
		
		System.out.println("-----------");
		
		int exepectedHours =15;
		int actualHours=15;
		
		if(actualHours>=exepectedHours) {
			System.out.println("You will love Java");
		
		}else {
			System.out.println("You will not like Java");
		}
		
		System.out.println("------------------");
		
		double budget=10000;
		double CarPrice=12000;
		
		if(budget>CarPrice) {
			System.out.println("I will buy this carn today");
		}else {
			System.out.println("I will not buy this car today," + "I will go learn Java");
			
		}
		
		System.out.println("I am code after if condition");
		
		
		
	}
	
}
