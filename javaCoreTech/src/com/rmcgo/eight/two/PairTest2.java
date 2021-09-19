package com.rmcgo.eight.two;

import com.rmcgo.eight.one.Pair;

import java.time.LocalDate;

public class PairTest2 {
	public static void main(String[] args) {
		LocalDate[] birthdays = {
				LocalDate.of(1949,1,1),
				LocalDate.of(1961,1,1),
				LocalDate.of(1966,1,1),
				LocalDate.of(1976,1,1),
				LocalDate.of(1978,1,1),
		};
		Pair<LocalDate> mm = ArrayAlg.minmax(birthdays);
		System.out.println("min = "  + mm.getFirst());
		System.out.println("max = "  + mm.getSecond());
	}
}

class ArrayAlg {
	/**
	 * Gets the minimum and maximum of an array of objects of type T.
	 */
	public static <T extends Comparable> Pair<T> minmax(T[] a) {
		if (a == null || a.length == 0) return null;
		T min = a[0];
		T max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min.compareTo(a[i]) > 0) min = a[i];
			if (max.compareTo(a[i]) < 0) max = a[i];
		}
		return new Pair<>(min, max);
	}
}