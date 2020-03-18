package com.syntax.class04;

import java.util.Scanner;

public class ScannerExamples {
public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter your name");
	
	String name=scan.nextLine();
	System.out.println("My name is "+ name);
	System.out.println("How old are you?");
	int age=scan.nextInt();
	System.out.println(" Your name is " + name + " your age is"+ age);
	
	
}
}

//package com.syntax.class04;
//import java.util.Scanner;
//public class ScannerExamples {
  //  public static void main(String[] args) {
        //Capture name from a user and
        //print in the format
        // My name is ______
        
        //1. Bring Scanner class into a program
        // System.in --> identifies keyboard
    //    Scanner scan=new Scanner(System.in);
        // Instruct user of what program expects
      //  System.out.println("Please enter your name");
        //capture line of Strings from a user
        //String name=scan.nextLine();
        //System.out.println("My name is "+name);
        // Instruct user of what program expects
        //System.out.println("How old are you?");
        //capture number from a user
        //int age=scan.nextInt();
        //System.out.println("Your name is "+name 
          //      +" you age is "+age);
    //}
//}





