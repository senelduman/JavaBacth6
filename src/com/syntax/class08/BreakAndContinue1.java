package com.syntax.class08;

public class BreakAndContinue1 {
public static void main(String[] args) {
	// write a program that print numbers from 1 to 100
    // i do not want to print 35-55
    for (int i = 1; i <= 100; i++) {
        if (i >= 35 && i <= 55) {
            continue;
        }
        System.out.println(i);
    }
}
}
