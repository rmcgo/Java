package com.rmcgo.java.day1_array.java;

import java.util.Arrays;

/**
 * java.util.Arrays:操作数据组的工具类
 *
 */
public class ArraysTest {
	public static void main(String[] args) {

		//equals(int[] a,int[] a2)
		int[] arr1 = new int[]{1,2,3,4};
		int[] arr2 = new int[]{1,3,2,4};
		boolean isEquals = Arrays.equals(arr1, arr2);
		System.out.println(isEquals);

		//String.toString(int[] a)
		System.out.println(Arrays.toString(arr1));

		//public static void fill(int[] a,int val)
		Arrays.fill(arr1, 10);
		System.out.println(Arrays.toString(arr1));

		// public static void sort(int[] a,int fromIndex,int toIndex)
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));

		//public static int binarySearch(int[] a,int key)
		int[] arr3 = new int[]{1,23,5,1,24,5,43,53,4653,46536,34};
		int index = Arrays.binarySearch(arr3, 3);
		if (index >= 0) {
			System.out.println(index);
		} else {
			System.out.println("未找到");
		}

	}
}
