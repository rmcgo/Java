package chapter11;

public class JavaDemo {
	/**
	 * 	主方法中使用throws继续抛出可能产生的异常，一旦出现异常则交由JVM进行默认异常处理
 	 */
	public static void main(String args[]){
		try {
			System.out.println(MyMath.div(10, 0));
		} catch (Exception e) {
			System.out.println("an exception occurred");
		}
	}
}

class MyMath {
	public static int div(int x, int y) throws Exception {
		return x / y;
	}
}
