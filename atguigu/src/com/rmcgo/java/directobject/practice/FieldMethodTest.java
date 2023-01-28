package com.rmcgo.java.directobject.practice;

public class FieldMethodTest {
	public static void main(String[] args) {
		Sub s = new Sub();
		System.out.println(s.count); //20
		s.display(); //20
		Base b = s;
		System.out.println(b == s); //true
		System.out.println(b.count); //10 -- 成员变量不具有多态性，所以就是输出base中count的值
		b.display(); // 20
	}
}
