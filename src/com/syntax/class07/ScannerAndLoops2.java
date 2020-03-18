package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoops2 {
public static void main(String[] args) {
/*
 * we are playing a lottery and luck number is 17;
 * we want to keep asking user any number from 1-20
 * until he guess the lucky number -->congrats
 */
    Scanner scan=new Scanner(System.in);
    int num=1;
    while(num<+17) {
    	System.out.println("Enter any number between 1-20");
    	num=scan.nextInt();
    	num++;
    	
    }
    System.out.println("Congrets you are lucky");

}
}


//Scanner input;
//int num=17;
//
//input=new Scanner(System.in);
//
//while(num<=17 || num>=17) {
//    System.out.println("Please enter any number between 1 - 20");
//    num=input.nextInt();
//    if(num==17) {
//        System.out.println("you win");
//        num++;
//
//break;
//}
//
//}





//int num=17;
//input=new Scanner(System.in);
//while(num<=17 || num>=17) {
//	System.out.println("Please enter any number between 1 - 20");
//	num=input.nextInt();
//	if(num==17) {
//		System.out.println("you win");
//		num++;
//break;
//}else {
//	System.out.println("Please try again");
//}
//}