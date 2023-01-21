package com.rmcgo.java.basicGrammer.practice;

public class Practice5 {
	public static void main(String[] args) {
		for (int i = 1; i < 151; i++) {
//			if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
//				System.out.println(i + " foo biz baz");
//			} else if (i % 3 == 0 && i % 5 == 0) {
//				System.out.println(i + " foo biz");
//			} else if (i % 5 == 0 && i % 7 == 0) {
//				System.out.println(i + " biz baz");
//			} else if (i % 3 == 0) {
//				System.out.println(i + " foo");
//			} else if (i % 5 == 0) {
//				System.out.println(i + " biz");
//			} else if (i % 7 == 0) {
//				System.out.println(i + " baz");
//			}
//			System.out.println(i);

			System.out.print(i + " ");

			if (i % 3 == 0) {
				System.out.print("foo ");
			}

			if (i % 5 == 0) {
				System.out.print("biz ");
			}

			if (i % 7 == 0) {
				System.out.print("baz ");
			}
			System.out.println();
		}
	}
}
