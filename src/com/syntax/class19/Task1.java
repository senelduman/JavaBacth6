package com.syntax.class19;

public class Task1 {
	 String studentName;
	    String studentAddress;
	    
	    
	    Task1(){
	        studentName="Senel";
	        studentAddress="Lyndhurst";
	        
	        
	    }
	    void displayInfo() {
	        
	        System.out.println(studentName+" address "+studentAddress);
	    }
	    
	    public static void main(String[] args) {
	        
	        Task1 obj = new Task1();
	        
	        obj.displayInfo();
	        
	    }

}
