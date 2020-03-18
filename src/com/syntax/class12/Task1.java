package com.syntax.class12;

public class Task1 {
	public static void main(String[] args) {
		String str = "Sunday";
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.print("Reversed string is:");
		System.out.println(reverse);
}
}