package com.syntax.class03;

public class TemperatureCheck {
public static void main(String[] args) {
	
	//Create a Java program and name it Temperature Check. 
	//Create variable to store temperature.
	//Your program should check if temperature is below 32 then it should 
	//print “Water will freeze with temperature __“, otherwise 
	//“Water will NOT freeze with temperature __“.
	
	
	int temp1=32;
	int temp2=68;
	
	if(temp1>temp2) {
		System.out.println("Water will freeze");
	}else {
		System.out.println("Water will Not freeze with tempeture");
	}
	
}
}
