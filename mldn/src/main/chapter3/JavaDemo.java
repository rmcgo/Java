package chapter3;

public class JavaDemo {
	public static void main(String[] args) {
		int ch = 1;										// 整型变量
		switch (ch) {									// 整型内容判断
			case 2:										// 匹配内容1
				System.out.println("【2】www.mldnjava.cn");
			case 1: {									// 匹配内容2
				System.out.println("【1】www.mldn.cn");
			}
			default: {									// 匹配不成功时执行
				System.out.println("【X】魔乐科技软件学院");
			}
		}
	}
}
