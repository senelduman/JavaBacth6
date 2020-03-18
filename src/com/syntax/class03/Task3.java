package com.syntax.class03;

import java.util.Scanner;

public class Task3 {
public static void main(String[] args) {
	//Create a Java program and declare int variable that will hold a month.
	//Based on the value of the variable your program should print the name of the month.
	//Write a program to check whether number is positive or negative.
	//Interview Question
	//Write a Java Program to check whether number is Even or Odd.
 Scanner scan=new Scanner (System.in);
System.out.println("Please enter a month");
 int month = scan.nextInt();
     
      if (month==1) {
	 System.out.println("January");
     }else if (month==2) {  
    	System.out.println("February");
     }else if(month==3) {
    	 System.out.println("March");
     } else if (month==4) { 
    	 System.out.println("April");
     }else if(month==5) {
        System.out.println("May");
     }else if (month==6) {
    	 System.out.println("June");
     }else if (month==7) {
    	 System.out.println("JUly");
     }else if (month==8 ) {
    	 System.out.println("August");
    	 System.out.println("it is September");
		}else if(month==10) {
				System.out.println("it is October");
		}else if(month==11) {
				System.out.println("it is Nowember");
		}else if(month==12){
			    System.out.println("it is December");
		}else {
			System.out.println("unvalied month");
		}
     }
}





