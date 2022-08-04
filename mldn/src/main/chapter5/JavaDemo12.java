package chapter5;

public class JavaDemo12 {
	public static void main(String args[]) {
		new Person3();						// 实例化新对象
		new Person3();						// 实例化新对象
	}
}

class Person3 {
	public Person3() {						// 构造方法
		System.out.println("【构造方法】Person类构造方法执行");
	}
	{										// 构造块
		System.out.println("【构造块】Person构造块执行");
	}
}
