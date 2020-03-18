package com.syntax.class05;

import java.util.Scanner;

public class HW4 {
public static void main(String[] args) {
	//program to find largest number use three numbers using nested if provided
	//by a user (number must be distinct)
	
	Scanner scan=new Scanner(System.in);
	int number =0;
	System.out.println("Please enter your first number:");
	int fnum=scan.nextInt();
	System.out.println("Please enter your Second number:");
	int snum=scan.nextInt();
	System.out.println("Please enter your third number:");
	int tnum=scan.nextInt();
	
	if (fnum>snum&& fnum>tnum) {
		number=fnum;
	}else if (snum >fnum && snum>tnum) {
		number=snum;
	}else if (tnum>fnum && tnum>snum) {
		number=tnum;
		System.out.println("The largest is " + number);
	}
	

}
}
