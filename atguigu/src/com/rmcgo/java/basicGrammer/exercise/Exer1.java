package com.rmcgo.java.basicGrammer.exercise;

public class Exer1 {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int max = a > b ? a : b;
		max = max > c ? max : c;
		System.out.println("max is :" + max);
	}
}
