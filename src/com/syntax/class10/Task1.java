package com.syntax.class10;

public class Task1 {
public static void main(String[] args) {
//	Create an array of animals and store
//	6 elements into it. Using 2 different loops print all 
//	elements from the array.

	String[] animals= {"Fox", "Bear", "Dog", "Cat", "Tiger", "Otter"};
	for (int i=0; i<animals.length; i++) {
		System.out.println(animals[i] + " ");
	}
	for (String animal:animals) {
		System.out.println(animal + " ");
	}


}
}
