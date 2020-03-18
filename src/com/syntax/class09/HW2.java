package com.syntax.class09;

public class HW2 {
public static void main(String[] args) {
//	Create an array of names and store all names of your group. 
//	Then print your name from that array.
//	(use 2 different ways of creating an array).

   String[]testersOnDuty = new String[6];
   testersOnDuty[0]="Yunus";
   testersOnDuty[1]="Tuker";
   testersOnDuty[2]="Gulsum";
   testersOnDuty[3]="Selma";
   testersOnDuty[4]="Rayhan";
   testersOnDuty[5]="Senel";
System.out.println(testersOnDuty[5]);

//2nd way
String[]testersOnDuty1= {"Yunus","Tuker","Gulsum","Selma","Rayhan","Senel"};
System.out.println(testersOnDuty1[5]);

 
}
}
