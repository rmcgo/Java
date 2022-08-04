package chapter5;

public class JavaDemo13 {
	public static void main(String args[]) {
		new Person4();						// 实例化新对象
		new Person4();						// 实例化新对象
	}
}
class Person4 {
	public Person4() {						// 构造方法
		System.out.println("【构造方法】Person4类构造方法执行");
	}
	static {									// 静态块
		System.out.println("【静态块】静态块执行。") ;
	}
	{										// 构造块
		System.out.println("【构造块】Person4构造块执行");
	}
}
