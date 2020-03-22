package com.syntax.class14;

public class Dog {

	String breed;
	String color;
	String name;
	int age;
	
	public static void main(String[] args) {
		
	
	Dog dog1=new Dog();
	dog1.breed="Shih tzu";
	dog1.color="yellow";
	dog1.name="Lucy";
	dog1.age=2;
	
	dog1.bark();
	dog1.eat();
	dog1.run();
	
	
	
	Dog dog2 = new Dog();
	dog2.breed = "Huskie";
	dog2.color = "White";
	dog2.age = 5;
	dog2.name = "Ghost";
	
	dog2.bark();
	dog2.eat();
	dog2.run();
	
	}
	void eat() {
		System.out.println( name +"Dog can eat");
	}
	void bark() {
		System.out.println(name +"Dog can bark");
	}
   void run() {
	System.out.println(name + "Dog can run");
   }
}
	





//	String breed;
//	String color;
//	String name;
//	int age;
//	public static void main(String[]args) {
//		Dog dog1=new Dog();
//		dog1.breed="Shih tzu";
//		dog1.color="yellow";
//		dog1.name="Lucy";
//		dog1.age=2;
//		System.out.println("My dog "+ dog1.breed+" age "+dog1.age+" has "+dog1.color+" fur and is called " +dog1.name);
//	

