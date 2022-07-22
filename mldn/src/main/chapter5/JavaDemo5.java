package chapter5;

public class JavaDemo5 {
	public static void main(String args[]) {
		Person per1 = new Person() ;				// 声明并实例化对象
		Person per2 = new Person() ;				// 声明并实例化对象
		per1.name = "张三" ;						// 为属性赋值
		per1.age = 18 ;							// 为属性赋值
		per2.name = "李四" ;						// 为属性赋值
		per2.age = 19 ;							// 为属性赋值
		per2 = per1 ;							// 引用传递
		per2.age = 80 ;							// 修改age属性定义
		per1.tell() ;							// 进行方法的调用
	}
}
