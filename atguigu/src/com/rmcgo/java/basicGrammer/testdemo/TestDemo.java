package com.rmcgo.java.basicGrammer.testdemo;

/**
 * 数字xxx的百位、十位、个位分别是多少？
 */
public class TestDemo {
	public static void main(String[] args) {
		int number = 123;
		int bai = number / 100;
		int shi = number % 100 / 10;
		int ge = number %10;

		System.out.println("百位：" + bai);
		System.out.println("十位：" + shi);
		System.out.println("个位：" + ge);
	}
}
