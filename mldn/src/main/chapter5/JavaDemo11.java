package chapter5;

public class JavaDemo11 {
	public static void main(String args[]) {
		{										// 普通代码块
			int x = 10 ;							// 定义局部变量
			System.out.println("x = " + x)  ;		// 输出局部变量内容
		}
		int x = 100 ;							// 定义全局变量
		System.out.println("x = " + x) ;			// 输出全局变量内容
	}
}
