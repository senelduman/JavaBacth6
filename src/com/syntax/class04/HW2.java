package com.syntax.class04;

import java.util.Scanner;

public class HW2 {
public static void main(String[] args) {
	Scanner scan=new Scanner (System.in);
	System.out.println("Please enter your work year..");
	int year=scan.nextInt();
	System.out.println("Please enter your annual salary..");
	int salary = scan.nextInt();
	
	if(year >=5) {
		if (salary>50000) {
		System.out.println("Bounus is 5000");
		}else
			System.out.println("Bonus is 3000");
	}else
		System.out.println("You are not elligiable for the bonus");
	
	}
}

