package com.rmcgo.five.seventeen;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * this program demonstrates the use of reflection for manipulating arrays
 */
public class CopyOfTest {
	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		a = (int[]) goodCopyOf(a, 10);
		System.out.println(Arrays.toString(a));

		String[] b = {"tom", "rmcgo", "harry"};
		b = (String[]) goodCopyOf(b, 10);
		System.out.println(Arrays.toString(b));

		System.out.println("the following call will generate an exception.");
		b = (String[]) badCopyOf(b, 10);
	}

	/**
	 * this method attempts to grow an array by allocating a new array and coping all elements.
	 * @param a
	 * @param newLength
	 * @return
	 */
	public static Object badCopyOf(Object[] a, int newLength) {
		Object[] newArray = new Object[newLength];
		System.arraycopy(a, 0, newArray, 0, Math.min(a.length, newLength));
		return newArray;
	}

	/**
	 * this method attempts to grow an array by allocating a new array of the same type and coping all elements
	 * @param a
	 * @param newLength
	 * @return
	 */
	public static Object goodCopyOf(Object a, int newLength) {
		Class<?> cl = a.getClass();
		if (!cl.isArray()) return null;
		Class<?> componentType = cl.getComponentType();
		int length = Array.getLength(a);
		Object newArray = Array.newInstance(componentType, newLength);
		System.arraycopy(a, 0, newArray, 0, Math.min(length, newLength));
		return newArray;
	}
}
