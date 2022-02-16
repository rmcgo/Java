package chapter10.demo;

public class Singleton {
	private static final Singleton INSTANCE = new Singleton();

	public static Singleton getInstance() {
		return INSTANCE;
	}

	public void print() {
		System.out.println("I am rmcgo.");
	}

	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		instance.print();
	}
}
