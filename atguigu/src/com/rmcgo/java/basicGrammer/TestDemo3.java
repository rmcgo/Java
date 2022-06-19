package com.rmcgo.java.basicGrammer;

import java.util.logging.SimpleFormatter;

/**
 * 遍历100以内的偶数
 */
public class TestDemo3 {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + "\t");
			}
		}
	}
}
