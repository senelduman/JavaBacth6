package com.syntax.class19;

public class Task2 {
	String book1;
    String book2;
    Task2(String a , String b){
        this();
        book1=a;
        book2=b;
        System.out.println(a+b);
}
    Task2() {
        
        System.out.println("i like this book");
    }
    
    public static void main(String[] args) {
        
        
    	Task2 obj = new Task2("Lie","Life");
        

}
}