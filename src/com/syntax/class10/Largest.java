package com.syntax.class10;

public class Largest {
public static void main(String[] args) {
	// find largest element from an arry
	int[] nums= {200,30,-1,56,787,900,};
	 int largest =nums[0];
	 for(int i=0;i<nums.length;i++) {
		 if (nums[i]>largest) {
			 largest=nums[i];
			 
		 }
	 }
    System.out.println("The largest number is array is "+largest );

}
}
