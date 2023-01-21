package com.rmcgo.java.array.exercise;

/**
 * 冒泡排序
 * 比几轮、每轮比几次确定就好
 */
public class Exer2 {
	public static void main(String[] args) {
		int[] arr = new int[]{34, 5, 22, -98, 6, -76, 0, -3};
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
	}
}
