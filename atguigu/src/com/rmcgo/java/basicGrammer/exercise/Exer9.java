package com.rmcgo.java.basicGrammer.exercise;

import java.util.Scanner;

/**
 * 从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入
 * 为0时结束程序。
 * 最简单“无限” 循环格式：while(true) , for(;;),无限循环存在的原因是并不
 * 知道循环多少次，需要根据循环体内部某些条件，来控制循环的结束。
 */
public class Exer9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int num = scanner.nextInt();
			if (num == 0) {
				break;
			}
		}
	}
}
