package com.rmcgo.java.array.exercise;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = new int[]{34, 5, 22, -98, 6, -76, 0, -3};
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 22) {
				System.out.println("22存在，索引（下标）为：" + i);
				return;
			}
		}
		System.out.println("没有找到");
	}
}
