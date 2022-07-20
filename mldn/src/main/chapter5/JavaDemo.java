package chapter5;

public class JavaDemo {
	public static void main(String args[]) {
		Person per = new Person(); 		// 声明并实例化对象
		per.name = "张三";				// 为成员属性赋值
		per.age = 18;					// 为成员属性赋值
		per.tell();						// 进行方法的调用
	}
}
