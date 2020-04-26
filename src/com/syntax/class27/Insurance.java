package com.syntax.class27;

public abstract class Insurance {
 String insuranceName;
 Insurance (String insuranceName){
	 this.insuranceName=insuranceName;
 }
    abstract void getQuote();
    abstract void cancelInsurance();
    
}

 class Car extends Insurance{
	 String carModel;
	 Car(String insuranceName,String carModel){
		 super(insuranceName);
		 this.carModel=carModel;
		
		 void getQuote() {
			 System.out.println(insuranceName+ "cheapest quote"+carModel);
			 
		 }
		 void cancelInsrace() {
			 System.out.println(insuranceName);
		 }
		 
	 }
	 
 }
