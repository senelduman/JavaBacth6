package com.syntax.class04;

public class NestingElself {
public static void main(String[] args) {
	boolean quiz = true;
	int score = 27;
	if (quiz) {
		System.out.println("We will check your score");
		 if (score>90) {
			System.out.println("Great Job !!!");
		 }else if (score >80) {
				System.out.println("Well done !!!");
		 }else if (score> 70 ) {
					System.out.println("You could have done better !");
		 } else if (score < 70) {
						System.out.println("You failed ! ");
					}
	}else {
		System.out.println("Please do HW on time");
	}
	}
		 
}

