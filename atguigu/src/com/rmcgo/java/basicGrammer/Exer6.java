package com.rmcgo.java.basicGrammer;

import java.util.Scanner;

/**
 * 从键盘分别输入年、月、日，判断这一天是当年的第几天
 * 注：判断一年是否是闰年的标准：
 * 1）可以被4整除，但不可被100整除
 * 或 2）可以被400整除
 */
public class Exer6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("输入年");
		int year = scan.nextInt();
		System.out.println("输入月");
		int month = scan.nextInt();
		System.out.println("输入日");
		int day = scan.nextInt();

		int days = 0;

		switch (month) {
			case 12:
				days += 30;
			case 11:
				days += 31;
			case 10:
				days += 30;
			case 9:
				days += 31;
			case 8:
				days += 30;
			case 7:
				days += 31;
			case 6:
				days += 30;
			case 5:
				days += 31;
			case 4:
				days += 31;
			case 3:
				if ((year % 4 == 0 && year %100 != 00) || year % 400 == 0) {
					days += 28;
				} else{
					days += 29;
				}
			case 2:
				days += 31;
			case 1:
				days += day;
		}
		System.out.println(year + "年" + month + "月" + day + "日" + "是当年第" + days + "天");
	}
}
