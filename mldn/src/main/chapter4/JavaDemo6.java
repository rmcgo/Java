package chapter4;

public class JavaDemo6 {
	public static void main(String args[]) {
		System.out.println(sum(3));				// 实现阶乘操作
	}
	/**
	 * 实现阶乘数据的累加操作，根据每一个数字进行阶乘操作
	 * @param num 要处理的数字
	 * @return 指定数字的阶乘结果
	 */
	public static double sum(int num) {
		if (num == 1) {							// 递归结束条件
			return factorial(1);					// 返回1的阶乘
		}
		return factorial(num) + sum(num - 1);		// 保存阶乘结果
	}
	/**
	 * 定义方法实现阶乘计算
	 * @param num 根据传入的数字实现阶乘
	 * @return 阶乘结果
	 */
	public static double factorial(int num) {
		if (num == 1) { 							// 定义阶乘结束条件
			return 1;							// 返回“1 * 1”的结果；
		}
		return num * factorial(num - 1); 			// 递归调用
	}
}
