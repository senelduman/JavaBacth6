package com.syntax.class14;

public class Car {
// define feature of the car
	String make;
	String model;
	int year;
	String color;
	int speed;
	//define behaviour
	 void drive() {
		 System.out.println("Car can drive");
	 }
    void accelerate() {
    	System.out.println("Car can accelerate");
    	 }
    void makeNoise() {
    	System.out.println("Car make noise");
    }
   void stop() {
	   System.out.println("Car stop");
   }
}
