package chapter10.demo;

public class Singleton2 {
	private static Singleton2 instance;

	private Singleton2(){}

	public static Singleton2 getInstance() {
		if (instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}

	private void print() {
		System.out.println("I am a little sheep");
	}

	public static void main(String[] args) {
		Singleton2 instance = Singleton2.getInstance();
		instance.print();
	}
}
