package chapter4;

public class JavaDemo {
	public static void main(String[] args) {
		String result = payAndGet(20.0);		// 调用方法并接收返回值
		System.out.println(result);			// 输出操作结果
		System.out.println(payAndGet(1.0)); 	// 返回值可以直接输出
	}

	/**
	 * 定义一个支付并获取内容的方法，该方法可以由主方法直接调用
	 * @param money 要支付的金额
	 * @return 根据支付结果获取相应的反悔信息
	 */
	public static String payAndGet(double money) {
		if (money >= 10.0) {					// 判断购买金额是否充足
			return "购买一份快餐，找零：" + (money - 10.0);
		} else {								// 金额不足
			return "对不起，您的余额不足，请先充值，或者捡漏。";
		}
	}
}
