package com.rmcgo.java;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入你的姓名");
		String name = scan.next();
		System.out.println(name);

		System.out.println("请输入你的芳龄");
		int age = scan.nextInt();
		System.out.println(age);

		System.out.println("请输入你的体重");
		double weight = scan.nextDouble();
		System.out.println(weight);

		System.out.println("是否相中");
		boolean isLove = scan.nextBoolean();
		System.out.println(isLove);

		System.out.println("请输入你的性别");
		String gender = scan.next();
		char genderChar = gender.charAt(0);
		System.out.println(genderChar);
	}
}
