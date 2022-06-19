package com.rmcgo.java.basicGrammer;

public class TestDemo2 {
	public static void main(String[] args) {
//		String str1 = Integer.toBinaryString(60);
//		System.out.println(str1);
//
//		String str2 = Integer.toHexString(60);
//		System.out.println(str2.toUpperCase());

		int number = 60;
		int num = number & 15;
		String i = (num > 9) ?(char)(num - 10 + 'A') + "" : num + "";
		number = number >>> 4;
		num = number & 15;
		String k = (num > 9) ? (char)(num - 10 + 'A') + "" : num + "";
		System.out.println(k + i);
	}
}
