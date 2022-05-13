package com.rmcgo.java.day1_array.java;

public class ArrayExceptionTest {
	public static void main(String[] args) {
		
		// 1. 数组索引越界异常
		int[] arr = new int[]{1,2,3,4,5};

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}

		// 2. 空指针异常
		int[] arr1 = new int[]{1,2,3};
		arr1 = null;
		System.out.println(arr1[0]);
	}
}
