package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoops {
	public static void main(String[] args) {
		// we want to ask user's name and print Good Afternoon;
		Scanner input;
		String name;
		int num = 1;
		
		input = new Scanner(System.in);
		
		while (num <= 5) {
		
			System.out.println("What is your name");
			
			name = input.nextLine();
			//num++;
			System.out.println("Good afternoon " + name);
			num++;

		}
	}
}