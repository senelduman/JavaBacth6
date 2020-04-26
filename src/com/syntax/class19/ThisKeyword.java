package com.syntax.class19;

public class ThisKeyword {

	int a;
	int b;

	public ThisKeyword() {
		System.out.println("I am non argumant constructor");
	}

	public ThisKeyword(int a, int b) {
		this.a = a;
		this.b = b;

	}

	public void sum(int a, int b) {
		// sum of which variables am I calculation?
		System.out.println("Sum of local variable " + (a + b));
		System.out.println("Sum of instance variable" + (this.a + this.b));
	}

	public static void main(String[] args) {

		ThisKeyword obj = new ThisKeyword(10, 20);
		obj.sum(100, 200);
		
		System.out.println("-------");
		ThisKeyword obj2 = new ThisKeyword(10, 20);
		obj2.sum(20, 40);

	}

}
