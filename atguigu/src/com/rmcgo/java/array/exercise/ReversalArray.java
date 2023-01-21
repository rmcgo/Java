package com.rmcgo.java.array.exercise;

public class ReversalArray {
	public static void main(String[] args) {
		int[] arr = new int[]{34, 5, 22, -98, 6, -76, 0, -3};
		/**
		 * 方法一
		 */
//		for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
//			int temp = arr[i];
//			arr[i] = arr[j];
//			arr[j] = temp;
//		}

		/**
		 * 方法二
		 */
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}


		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
