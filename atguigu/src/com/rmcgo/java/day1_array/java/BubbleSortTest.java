package com.rmcgo.java.day1_array.java;

/**
 * 数组的冒泡排序
 */
public class BubbleSortTest {
	public static void main(String[] args) {
		int[] array = {1, 4, 6, 3, 7, 9, 3, 5, 2, 5, 7};

		// 冒泡排序
		int temp = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
	}
}
