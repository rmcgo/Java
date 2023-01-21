package com.rmcgo.java.basicGrammer.practice;

public class Practice2 {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		int num3 = 0;
		int max = 0;
		if (num1 > num2) {
			max = num1;
		} else {
			max = num2;
		}
		if (num3 > max) {
			max = num3;
		}

		System.out.println("max = " + max);
	}
}
