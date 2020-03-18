package com.syntax.class04;

public class Task1 {
	public static void main(String[] args) {
		boolean Diploma = true;
		double gpa = 3.3;
		if (Diploma) {
			System.out.println("Congratulations");
			if (gpa >= 3.5) {
				System.out.println("You are eligible for scholarship");

			} else if (gpa < 3.5) {
				System.out.println("You should have studied harder");
			}

		} else {
			System.out.println("Please consider getting a degree");
		}
	}

}
