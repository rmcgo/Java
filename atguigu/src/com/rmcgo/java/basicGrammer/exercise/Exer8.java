package com.rmcgo.java.basicGrammer.exercise;

import java.util.Scanner;

/**
 * 题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
 * 比如：12和20的最大公约数是4，最小公倍数是60。
 */
public class Exer8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入第一个数字：");
		int a = scan.nextInt();
		System.out.println("请输入第二个数字");
		int b = scan.nextInt();

		int yueshu = (a < b) ? a : b;
		for (int i = yueshu; i >= 1; i--) {
			if (a % i == 0 && b % i == 0) {
				System.out.println("最大公约数是" + i);
				break;
			}
		}

		int beishu = (a>b) ? a : b;
		for (int i = beishu; i <= a*b; i++) {
			if (i % a == 0 && i % b ==0) {
				System.out.println("最小公倍数是：" + i);
				break;
			}
		}
	}
}
