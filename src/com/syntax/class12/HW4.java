package com.syntax.class12;

import java.util.Scanner;

public class HW4 {
public static void main(String[] args) {
	 //Write a java program to reverse String? Reverse a string word by word?
	//Selam
	Scanner scan;
	String input;
	String reverse ="";
	scan=new Scanner(System.in);
	System.out.println("Enter your input");
	input=scan.nextLine();
	for(int i=input.length()-1; i>=0; i--) {
		reverse=reverse+input.charAt(i);
	}
	System.out.println(reverse);
}
}
