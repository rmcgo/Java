package com.rmcgo.java.basicGrammer.practice;

/**
 * 1~100所有质数
 */
public class Practice9 {
	public static void main(String[] args) {
		boolean breakFlag = true;
		for (int i = 2; i < 100; i++) {
			breakFlag = true;
			for (int j = 2; j < Math.sqrt(i); j++) {
				if (i % j == 0) {
					breakFlag = false;
					break;
				}
			}
			if (breakFlag) {
				System.out.println(i);
			}
		}
	}
}
