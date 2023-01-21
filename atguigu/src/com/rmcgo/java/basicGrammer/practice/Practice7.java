package com.rmcgo.java.basicGrammer.practice;

public class Practice7 {
	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			if (i == (i % 10)*(i % 10)*(i % 10) + (i%100/10)*(i%100/10)*(i%100/10) + (i / 100)*(i / 100)*(i / 100)) {
				System.out.println("水仙花数" + i);
			}
		}
	}
}
