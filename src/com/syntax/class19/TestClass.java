package com.syntax.class19;

public class TestClass {
public static void main(String[] args) {
	Dog dog =new Dog();
	dog.breed="Husky";
	dog.color="Grey";
	dog.fur="Too much";
	dog.size="Big";
	
	dog.bark();
	dog.beWild();
	dog.eat();
	dog.sleep();
	//Dog.age=2;
	//Dog.display();
	
	Animals animal=new Animals();
	
//	animal.color="Any";
//	animal.size="Any";
//	animal.fur="Any";
	
	animal.sleep();
	animal.eat();
	animal.beWild();
}
}
