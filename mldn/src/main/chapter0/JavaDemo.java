package chapter0;

public class JavaDemo {
	public static void main(String[] args) {
		System.out.println(1 > 2 && 10 / 0 == 0); // 短路导致不会执行后面的10 / 0
	}
}
