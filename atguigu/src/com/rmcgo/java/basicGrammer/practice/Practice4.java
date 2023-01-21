package com.rmcgo.java.basicGrammer.practice;

import java.util.Scanner;

public class Practice4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个整形数据");
		int anInt = scan.nextInt();
		System.out.println(anInt);

		System.out.println("请输入一个字符串");
		String nextString = scan.next();
		System.out.println(nextString);
	}
}
