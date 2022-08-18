package chapter5;

class Person9 {
	public Person9() {						// 构造方法
		System.out.println("【构造方法】Person类构造方法执行");
	}
	static {									// 静态块
		System.out.println("【静态块】静态块执行。") ;
	}
	{										// 构造块
		System.out.println("【构造块】Person构造块执行");
	}
}
public class JavaDemo21 {
	public static void main(String args[]) {
		new Person9();						// 实例化新对象
		new Person9();						// 实例化新对象
	}
}
