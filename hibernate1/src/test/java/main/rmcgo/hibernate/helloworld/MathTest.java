package main.rmcgo.hibernate.helloworld;

import org.junit.Test;

public class MathTest {
	@Test
	public void testBinarySearch() {
		int key = 2;
		int[] a = {1,2,3,4,5,6,7,8,9};
		int rank = rank(key, a, 0, a.length - 1);
		System.out.println("index = " + rank);
	}

	public static int rank(int key, int[] a, int low, int high) {
		if (low > high) return -1;
		int mid = low + (high - low) / 2;
		if (key < a[mid]) return rank(key, a, low, mid - 1);
		if (key > a[mid]) return rank(key, a, mid + 1, high);
		else return mid;
	}
}
