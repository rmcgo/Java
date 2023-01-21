package com.rmcgo.java.basicGrammer.exercise;

public class Exer10 {
	public static void main(String[] args) {
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 6; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
