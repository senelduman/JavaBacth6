package com.syntax.class08;

public class loopMoreReview {
public static void main(String[] args) {
	//write a pogram to calculate sum of odd and sum of 
	//even numbers  1 to 99

	int sumEven=0;
    int sumOdd=0;			
	for (int i = 1; i <=100; i++)  {
		if (i%2==0) {
			sumEven=sumEven+i;
		}else {
			sumOdd=sumOdd+1;
		}
   }System.out.println("even number"+sumEven);
	System.out.println("odd numbers#="+sumOdd);

}
}