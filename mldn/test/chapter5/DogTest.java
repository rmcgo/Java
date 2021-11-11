package chapter5;

import com.rmcgo.chapter5.three.Dog;
import org.junit.Test;

public class DogTest {
	@Test
	public void test() {
		Dog dog = new Dog("夯昊", "yellow", 2);
		System.out.println(dog.getAge());
		System.out.println(dog.getColor());
		System.out.println(dog.getName());
		System.out.println(dog);
	}
}
