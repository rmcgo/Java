package chapter5;

class Message3 {
	public static String getCountry() {
		return "www.mldn.cn" ;				// 该消息的内容可能来自于网络
	}
}
class Person5 {
	private static String country ;
	static {									// 静态块中可以代码
		country = Message3.getCountry() ;		// 调用静态方法
		System.out.println(country) ;			// 输出信息
	}
}
public class JavaDemo14 {
	public static void main(String args[]) {
		new Person5();						// 实例化新对象
	}
}