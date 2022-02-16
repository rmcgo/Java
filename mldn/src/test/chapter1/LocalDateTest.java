package chapter1;

import java.time.LocalDate;

public class LocalDateTest {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println("now() : " + now);
		String s = LocalDate.now().toString();
		System.out.println("now() : " + s);
	}
}
