package com.syntax.class04;

public class Task2 {
	public static void main(String[] args) {
		double mortgageRate = 4.1;
		int mortgagePrice = 250000;

		if (mortgageRate > 4.5) {
			System.out.println("You cannot buyu a house");
		} else {
			System.out.println("You will buy a house");
			if (mortgagePrice > 200000) {
				System.out.println("You will need a loan");
			} else {
				System.out.println("You will pay cash");
			}
		}
	}
}
