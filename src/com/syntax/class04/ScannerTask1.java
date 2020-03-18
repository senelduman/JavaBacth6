package com.syntax.class04;

import java.util.Scanner;

public class ScannerTask1 {
public static void main(String[] args) {
//You are a loan specialist and you need to ask user what is the amount of loan is needed.
//If loan is less than 200,000 then you would lend the money otherwise you 
//would reject the client.
	
	Scanner at1=new Scanner(System.in);

	System.out.println("How much loan do you need?");
    int loan=at1.nextInt();
    System.out.println(loan + "dollars");
    
    if (loan<200000) {
    	System.out.println("I will loan you same monye");
    }else {
    	System.out.println("you cannot get a loan");
    }




}
}



