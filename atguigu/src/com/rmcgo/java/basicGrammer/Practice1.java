package com.rmcgo.java.basicGrammer;

/**
 * @author 14702
 */
public class Practice1 {
	public static void main(String[] args) {
		int num = 125;

		int bai = num / 100;
		int shi = num % 100 / 10;
		int ge = num % 10;

		System.out.println("bai = " + bai);
		System.out.println("shi = " + shi);
		System.out.print("ge = " + ge);
	}
}
