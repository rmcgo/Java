package chapter0;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

public class ReflectionTest {
	@Test
	public void test1() throws NoSuchFieldException, IllegalAccessException {
		Person p = new Person("xiaoli");
		Class aClass1 = p.getClass();
		Field f = aClass1.getDeclaredField("name");
		f.setAccessible(true);
		Object value = f.get(p);
		System.out.println(value);
	}
}
