package com.rmcgo.java.array.exercise;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = new int[]{1, 2, 4, 6, 8, 9, 34, 234, 645, 765};
		boolean flag = true;
		int head = 0;
		int end = arr.length - 1;
		int mid;
		while (head <= end) {
			mid = (head + end) / 2;
			if (arr[mid] == 10) {
				System.out.println("找到了,索引为：" + mid);
				flag = false;
				break;
			} else if (arr[mid] > 9) {
				end = mid - 1;
			} else {
				head = mid + 1;
			}
		}
		if (flag) {
			System.out.println("没有找到");
		}
	}
}
