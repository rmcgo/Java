package chapter9.proxy;

public class Factory {
	public static IEat getInstance() {
		return new EatProxy(new EatReal());
	}
}
