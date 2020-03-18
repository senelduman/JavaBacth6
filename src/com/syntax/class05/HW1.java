package com.syntax.class05;

import java.util.Scanner;

public class HW1 {
public static void main(String[] args) {
	/*
	 * write a program that will read three inputs of scores(quiz,mid,term, and final score) 
	 * and determine the grade based on the following rules:
	 * if the average score>=90--grade=A
	 * if the average score>=70 and <90-- grade=B
	 * if the average score>=50and<70--grade=c
	 * if the average score>=50--grade=F
	 */
      Scanner scan=new Scanner(System.in);
      int score;
      System.out.println("What is your quiz score? ");
      int q =scan.nextInt();
      
      System.out.println("What is your midterm score? ");
      int m= scan .nextInt();
      
      System.out.println("What is your final score? ");
      int f = scan.nextInt();
      
      if (((q + f + m )/3)>=90) {
    	  System.out.println("Your grade is A");
      }else if (((q + f + m)/3)>=70 && ((q + f + m )/3)<90) {
    	  System.out.println("Your  grade is B");
    	  
      }else if (((q + f + m)/3)>=50 && ((q + f + m )/3)<70) {
    	  System.out.println("Your grade is C");
    	  
      }else if (((q + f + m)/3)>=50 && ((q + f + m )/3)>=0) {
    	  System.out.println("Your grade is F");
      }else{
    	  System.out.println("Invalid Entery");
      }


}
}
