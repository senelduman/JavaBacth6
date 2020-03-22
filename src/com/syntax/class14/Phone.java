package com.syntax.class14;

import java.util.Scanner;

public class Phone {
	String brand;
	String color;
	String model;
	public static void main(String[] args) {
		//creat an object from Phone class
		//instanciate Phone class
		//new Phone() creat an object of phone
		
		
		Phone iphone=new Phone();
		iphone.brand="Iphone";
		iphone.color="White";
		iphone.model="X Max";
		iphone.dial();
		iphone.text();
		iphone.pics();
		Phone android=new Phone();
		android.brand="Samsung";
		android.color="Black";
		android.model="Note10";
		android.dial();
		android.text();
		android.pics();
		Phone nokia=new Phone();
		nokia.brand="Nokia";
		nokia.color="Gray";
		nokia.model="Nokia 9";
		nokia.dial();
		nokia.text();
		nokia.pics();
	
	String str="Hello friends";
	str.replace("Hello", "Welcome");
	System.out.println(str);
	Scanner scan=new Scanner(System.in);
	scan.hasNextLine();
	
	
	}
}	


