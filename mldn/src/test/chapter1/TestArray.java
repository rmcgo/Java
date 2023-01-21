package chapter1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestArray {

	@Test
	public void testMehtod() {
		int[] arr = {0};
		System.out.println(Arrays.toString(arr));

		int[] arr2 = new int[5];
		arr2[0] = 2;
		System.out.println(Arrays.toString(arr2));
	}
}
