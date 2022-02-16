package main.rmcgo.nine.seven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This program is demonstrate shuffle could 将元素乱序的能力
 */
public class ShuffleTest {
	public static void main(String[] args) {
		var numbers = new ArrayList<Integer>();
		for (int i = 1; i < 49; i++) {
			numbers.add(i);
		}
		Collections.shuffle(numbers);
		List<Integer> winningCombination = numbers.subList(0, 6);
		Collections.sort(winningCombination);
		System.out.println(winningCombination);
	}
}
