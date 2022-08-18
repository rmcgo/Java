package chapter6;

public class StringDemo {
	public static void main(String args[]) {
		String str = "mldnjava";							// 实例化String类对象
		byte data[] = str.getBytes(); 					// 将字符串变为字节数组
		for (int x = 0; x < data.length; x++) {			// 字节数组循环
			data[x] -= 32;								// 小写转大写
		}
		System.out.println(new String(data));				// 全部字节数组变为字符串
		System.out.println(new String(data, 0, 5));		// 部分字节数组变为字符串
	}
}