package chapter9.proxy;

public class EatReal implements IEat{
	@Override
	public void get() {
		System.out.println("去老乡鸡吃饭");
	}
}
