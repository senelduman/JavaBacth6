package com.syntax.class05;

import java.util.Scanner;

public class HW2 {
public static void main(String[] args) {
	/*
	 * Write a pogram for user to enter his/her birth month. 
	 * Based on the month define the season.
	 * Example: If user is born in June . july or Agust --season= "Summer".
	 * At the end of the program we should see output as "You were born--".
	 * 
	 */

     Scanner scan=new Scanner (System.in);
     System.out.println("What is your birth month? ");
     String month=scan.nextLine();
     String season=null;
     if (month.equalsIgnoreCase("August")||month.equalsIgnoreCase("June")|| month.equalsIgnoreCase ("July"))
    	 season="Summer";
     else if(month.equalsIgnoreCase("Sptember")||month.equalsIgnoreCase("October")|| month.equalsIgnoreCase ("November"))
    	 season="Fall";
     else if (month.equalsIgnoreCase("march")||month.equalsIgnoreCase("April")|| month.equalsIgnoreCase ("May"))
    	 season="Spring";
     else if (month.equalsIgnoreCase("December")||month.equalsIgnoreCase("January")|| month.equalsIgnoreCase ("February"))
           season="Winter";
     System.out.println("You were born in " + season);
     
     



}

}
