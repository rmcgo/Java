package com.rmcgo.java.directobject.practice;

public class DemoTest1 {
	public static void main(String[] args) {
		char[] arr = new char[]{'a', 'b', 'c'};
		System.out.println(arr); //abc
		int[] arr1 = new int[]{1, 2, 3};
		System.out.println(arr1); //地址
		double[] arr2 = new double[]{1.1, 2.2, 3.3};
		System.out.println(arr2); //地址
		//char[] 重写了toString方法，int[]和double[]没有重写

		Object o1 = true ? new Integer(1) : new Double(2.0);
		System.out.println(o1); //1.0

		Object o2;
		if (true)
			o2 = new Integer(1);
		else
			o2 = new Double(2.0);
		System.out.println(o2); //1

		Integer i = new Integer(1);
		Integer j = new Integer(1);
		System.out.println(i == j);
		Integer m = 1;
		Integer n = 1;
		System.out.println(m == n);//
		Integer x = 128;
		Integer y = 128;
		System.out.println(x == y);//
	}
}
