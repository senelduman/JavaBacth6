package com.syntax.class12;

import java.util.Scanner;

public class HW2 {
	public static void main(String[] args) {
//Write a java program to check whether a given number is prime or not?
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scan.nextInt();
		
		boolean flag = false;
		for (int i = 2; i <= number/2; ++i) {
			if (number % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("It is a Prime number ");
		} else {
			System.out.println("It is not Prime number ");
		}
	}
}
