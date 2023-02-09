package chapter13;

import java.lang.reflect.InvocationTargetException;

class Member2 {
	public Member2() {
		System.out.println("Member2的构造方法在执行");
	}

	@Override
	public String toString() {
		return "输出Member2实例化对象时会输出这句话";
	}
}

public class JavaReflectDemo2 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
		Class<?> aClass = Class.forName("chapter13.Member2");
		Object obj = aClass.getDeclaredConstructor().newInstance();
		System.out.println(obj);
	}
}
