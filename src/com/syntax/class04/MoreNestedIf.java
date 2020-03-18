package com.syntax.class04;

public class MoreNestedIf {
public static void main(String[] args) {
	//declare date and a day.
	//if day is friday -->if date is 13---watch a scary movie
                        //if date is not 13    watch a comdy
	
	   boolean isFriday= false;
	   int date=14;
	   
	   if(isFriday) {
	   System.out.println("Today is friday, I am going to a movies");
	   }else {
		   System.out.println("Today is not friday, I am staying home");
		   
		   if (date==13) {
			   System.out.println("I will wactch scary movie");
		   }else {
			   System.out.println("I will watch a comedy");
		   }
		   
	   }
			   



}
}
