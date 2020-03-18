package com.syntax.class10;

public class RetrieverElements {
public static void main(String[] args) {
	char[] grades= {'A','B','C','D','E','F'};
	//getting all elements
	for(int i =0; i<grades.length;i++) {
		System.out.println(grades[i]);
	}
  System.out.println("-----printing using advanced for loop---");
  for(char grade:grades) {
	  System.out.println(grade+" ");
	  
  }
  //create an arry of fruits and retrieve all elements.  
  String[] fruits= {"Banana", "Kiwi", "Apple", "Mango"};
  //advanced for loop, enhanced for loop, for each loop
  for(String fruit:fruits) {
	  System.out.println(fruit);
	  
  }
  
}
}
