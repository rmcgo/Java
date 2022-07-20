package chapter4;

public class JavaDemo3 {
	public static void main(String args[]) {
		int resultA = sum(10, 20); 				// 调用两个int参数的方法
		int resultB = sum(10, 20, 30); 			// 调用三个int参数的方法
		int resultC = sum(11.2, 25.3);			// 调用两个double参数方法
		System.out.println("加法执行结果：" + resultA);
		System.out.println("加法执行结果：" + resultB);
		System.out.println("加法执行结果：" + resultC);
	}
	/**
	 * 实现两个整型数据的加法计算
	 * @param x 计算数字1
	 * @param y 计算数字2
	 * @return 加法计算结果
	 */
	public static int sum(int x, int y) {
		return x + y;							// 两个数字相加
	}
	/**
	 * 实现三个整型数据的加法计算
	 * @param x 计算数字1
	 * @param y 计算数字2
	 * @param z 计算数字3
	 * @return 加法计算结果
	 */
	public static int sum(int x, int y, int z) {
		return x + y + z;						// 三个数字相加
	}
	/**
	 * 实现两个浮点数据的加法计算
	 * @param x 计算数字1
	 * @param y 计算数字2
	 * @return 加法计算结果，去掉小数位
	 */
	public static int sum(double x, double y) {
		return (int) (x + y);						// 两个数字相加
	}
}
