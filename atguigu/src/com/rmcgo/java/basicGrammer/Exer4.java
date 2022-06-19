package com.rmcgo.java.basicGrammer;

import java.util.Scanner;

public class Exer4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入狗狗的年龄：");
		int age = scan.nextInt();
		if (age < 0) {
			System.out.println("请输入正确的年龄");
		} else if (age <= 2) {
			System.out.println("相当于人类：" + 10.5 * age);
		} else {
			System.out.println("相当于人类：" + (21 + 4 * (age - 2)));
		}
	}
}
