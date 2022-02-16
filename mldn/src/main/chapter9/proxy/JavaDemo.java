package chapter9.proxy;

public class JavaDemo {
	public static void main(String[] args) {
		IEat eat = Factory.getInstance();
		eat.get();
	}
}
