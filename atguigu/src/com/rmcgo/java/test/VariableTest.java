package com.rmcgo.java.test;

public class VariableTest {
	public static void main(String[] args) {
		char c = 'a';
		int num = 10;
		String str = "hello";
		System.out.println(c + num + str);
		System.out.println(c + str + num);

		String str1 = "123";
		System.out.println(str1);

		int num1 = Integer.parseInt(str1);
		System.out.println(num1);
	}
}
