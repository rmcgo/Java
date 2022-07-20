package chapter4;

public class JavaDemo5 {
	public static void main(String args[]) {
		System.out.println(sum(100)); 	// 1 - 100累加
	}
	/**
	 * 数据的累加操作，传入一个数据累加操作的最大值，而后每次进行数据的递减，将一直累加到计算数据为1
	 * @param num 要进行累加的操作
	 * @return 数据的累加结果
	 */
	public static int sum(int num) { 		// 最大的内容
		if (num == 1) { 					// 递归的结束调用
			return 1; 					// 最终的结果返回了一个1
		}
		return num + sum(num - 1); 		// 递归调用
	}
}
