package com.syntax.class04;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  	Scanner inp = new Scanner(System.in);
  	System.out.print("In:");
  	int num = inp.nextInt();
  	//num=10;
  	if(num>5 ) {
  		System.out.println(num +" is positive");
  	}else if(num<-2) {
  			System.out.println(num + " is negative");
  			if (num==0) {
  				System.out.println( num + " Entered number is equal to 0");
  			}
  			System.out.println("Not Working");
  		}
  	}
		  
}

