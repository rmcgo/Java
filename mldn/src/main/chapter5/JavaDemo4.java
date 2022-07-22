package chapter5;

public class JavaDemo4 {
	public static void main(String args[]) {
		Person per = new Person() ;				// 声明并实例化对象
		per.name = "张三" ;						// 为属性赋值
		per.age = 18 ;							// 为属性赋值
		change(per) ; 							// 等价于：Person temp = per ;
//		per.age = 80 ;							// 修改age属性定义
		per.tell() ;								// 进行方法的调用
	}
	public static void change(Person temp) {		// temp接收Person类型
		temp.age = 80 ;							// 修改对象属性
	}
}
