package com.syntax.class04;

import java.util.Scanner;

public class HW1 {
  public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Do you have credi card");
	
	String credicard = scan.nextLine();
	
	if( credicard.equals("yes")) {
		System.out.println("What is balance on the card");
		int balance=scan.nextInt();
		
		if (balance>1000) {
			System.out.println("Pay off immediately");
		}else {
			System.out.println("You can spen more");
			
		}
	
	}else if(credicard.equals("no")) {
		System.out.println("Would you like to apply");
	}else {
		System.out.println("Invalid");
	}
}
}
