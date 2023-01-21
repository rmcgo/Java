package com.rmcgo.java.basicGrammer.practice;

public class Practice6 {
	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 12;

		// 最小公倍数
		int min = num1 > num2 ? num1 : num2;
		for (int i = min; i < num1 * num2; i++) {
			if (i % num1 == 0 && i % num2 == 0) {
				System.out.println("最小公倍数:" + i);
				break;
			}
		}

		// 最大公约数
		int max = num1 < num2 ? num1 : num2;
		for (int i = max; i >= 1; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				System.out.println("最大公约数:" + i);
				break;
			}
		}
	}
}
