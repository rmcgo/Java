package com.rmcgo.java.day1_array.java;

/**
 * 求数组最大、最小、平均、总和
 */
public class ArrayTest1 {
	public static void main(String[] args) {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 90 + 10);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();

		// 求最大值
		int maxValue = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (maxValue < arr[i]) {
				maxValue = arr[i];
			}
		}
		System.out.println("最大值为：" + maxValue);

		// 求最小值
		int minValue = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (minValue > arr[i]) {
				minValue = arr[i];
			}
		}
		System.out.println("最小值为：" + minValue);

		// 求数组元素的总和
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum总和等于：" + sum);

		int average = sum / arr.length;
		System.out.println("平均值为：" + average);

	}
}
