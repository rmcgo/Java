package com.rmcgo.java.basicGrammer.exercise;

/**
 * 求：输出100以内所有质数
 * 质数（Prime number），又称素数，指在大于1的自然数中，除了1和该数自身外，无法被其他自然数整除的数（也可定义为只有1与该数本身两个正因数的数）。
 * 大于1的自然数若不是素数，则称之为合数（也称为合成数）。例如，5是个素数，因为其正约数只有1与5。7是个素数，因为其正约数只有1与7。
 * 而4则是个合数，因为除了1与4外，2也是其正约数。
 */
public class PrimeNumber {
	public static void main(String[] args) {
		boolean flag;
		for (int i = 2; i < 100; i++) {
			flag = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.print(i + "\t");
			}
		}
	}
}
