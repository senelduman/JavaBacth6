package com.syntax.class07;
public static void main (String[]args) {
//	As long as it is workDay print “I need a day off” and increase day.
//	Once day is 6 print “I do not need a day off any more”

 
  boolean workDay = true;
  int day = 1;
  
  while (workDay ) {
      if (day <= 6) {
          System.out.println("I need a day off");
      }else {
          System.out.println("I do not need a day off anymore");
      workDay =false;
      }
      day ++;
  }

}
}
//boolean workDay=true;
//int day=1;
//
//if (workDay) {
//    System.out.println("I need a day off");
//    
//    while(day<6) {
//        day++;
//        System.out.println(day);
//    }System.out.println("I dont need day off any more");
//    
//}