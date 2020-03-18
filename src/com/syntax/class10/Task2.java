package com.syntax.class10;

public class Task2 {
public static void main(String[] args) {
//	create an array on integers and calculate the sum of 
//	all integer elements in an array.

	int [] nums= {1, 2, 3, 4, 5, 6, 7, 8, 9};
	int total=0;
	for (int i=0; i<nums.length; i++) {
		total += nums[i];
	}
	System.out.println(total);

}
}
