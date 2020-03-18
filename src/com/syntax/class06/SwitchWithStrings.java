package com.syntax.class06;

import java.util.Scanner;

public class SwitchWithStrings {
public static void main(String[] args) {
	
	Scanner scan;
	String country;
	String favoriteFood;
	
	scan=new Scanner(System.in);
	System.out.println("Please enter your country");
	country=scan.nextLine();
	
	switch(country) {
	case "Morocco":
		favoriteFood="couscous";
		break;
	case"Tajikistan":
	favoriteFood="osh";
		break;
	case"Turkey":
		favoriteFood="Baklava";
	break;
	case "Afghanistan":
		favoriteFood="Mantu";
		break;
		default:
			favoriteFood="Unknown";
	}
	 System.out.println("Your favorite food is "+ favoriteFood);
}
}
