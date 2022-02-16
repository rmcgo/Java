package chapter9.proxy;

public class EatProxy implements IEat {
	private IEat eat;

	public EatProxy(IEat eat) {
		this.eat = eat;
	}

	@Override
	public void get() {
		prepare();
		eat.get();
		clear();
	}

	public void prepare() {
		System.out.println("1. 买菜");
		System.out.println("2. 处理食材");
	}

	public void clear() {
		System.out.println("3. 收拾碗筷");
	}
}
