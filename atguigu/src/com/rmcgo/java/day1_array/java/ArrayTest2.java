package com.rmcgo.java.day1_array.java;

import java.util.Objects;

/**
 * 数组的复制、反转、查找(线性查找、二分法查找)
 */
public class ArrayTest2 {
	public static void main(String[] args) {
		String[] arr = new String[]{"A", "B", "C", "D", "E"};

		//复制
		String[] arr2 = new String[arr.length];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr[i];
		}

		// 反转
		// method1
//		String temp = null;
//		for (int i = 0; i < arr.length / 2; i++) {
//			temp = arr[i];
//			arr[i] = arr[arr.length - i - 1];
//			arr[arr.length - i - 1] = temp;
//		}

		// method2
		String temp = null;
		for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

		//遍历输出
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();

		// 查找
		// 线性查找：
		Boolean isFlag = true;
		String dest = "B";
		for (int i = 0; i < arr.length; i++) {
			if (Objects.equals(dest, arr[i])) {
				System.out.println("找到了，位置为：" + i);
				isFlag = false;
				break;
			}
		}
		if (isFlag) {
			System.out.println("没有找到");
		}
		System.out.println();

		// 二分查找
		int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		int destination = 4;
		int head = 0;
		int end = arr3.length - 1;
		Boolean isFlag1 = true;
		while (head <= end) {
			int middle = (head + end) / 2;
			if (destination == arr3[middle]) {
				System.out.println("找到了，位置为：" + middle);
				isFlag1 = false;
				break;
			} else if(destination < arr3[middle]) {
				end = middle - 1;
			} else {
				head = middle + 1;
			}
		}
		if (isFlag1) {
			System.out.println("没有找到");
		}

	}
}
