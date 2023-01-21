package com.rmcgo.java.basicGrammer.practice;

public class Practice3 {
	public static void main(String[] args) {
		double num1 = 9.0;
		double num2 = 14.0;
		if (num1 > 10.0 && num2 < 20) {
			System.out.println("num1 + num2 = " + (num1+num2));
		} else {
			System.out.println("num1*num2=" + num1*num2);
		}

		int a1 = 2;
		int a2 = 3;
		int temp = 0;
		System.out.println("a1=" + a1 + ", a2=" + a2);
		temp = a1;
		a1 = a2;
		a2 = temp;
		System.out.println("a1=" + a1 + ", a2=" + a2);
	}
}
