package com.syntax.class07;

import java.util.Scanner;

public class Calculator1 {
	public static void main(String[] args) {
		// Using scanner class create calculator.
		// Allow user to enter 2 numbers and operator(+,-,*,/).
		// Based on operator provide the result to user.

		Scanner input;
		double x, y;
		char op;
		double summary = 0;

		input = new Scanner(System.in);

		System.out.println("Please enter first number ");
		x = input.nextInt();
		System.out.println("Please enter your second number");
		y = input.nextInt();
		System.out.println("please enter operator");
		op = input.next().charAt(0);

		switch (op) {

		case '+':
			summary = x + y;
			break;
		case '-':
			summary = x - y;
			break;
		case '*':
			summary = x * y;
			break;
		case '/':
			summary = x / y;
			break;
		default:
			System.out.println("Please enter a valid number");

		}

		System.out.println("Result of the " + x + op + y + " = " + summary);

	}
}
