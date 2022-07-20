package chapter4;

public class JavaDemo2 {
	public static void main(String args[]) {
		sale(-3);					// 调用方法
		sale(3);						// 调用方法
	}
	/**
	 * 定义销售方法，可以根据金额输出销售信息
	 * @param amount 要销售的数量，必须为正数
	 */
	public static void sale(int amount) {
		if (amount <= 0) { 			// 销售数量出现错误
			return; 					// 后续代码不执行了
		}
		System.out.println("销售出" + amount + "本图书。");
	}
}
