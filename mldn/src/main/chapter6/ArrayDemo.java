package chapter6;

public class ArrayDemo {
	public static void main(String[] args) {
		int data[] = new int[]{11, 23, 56};            // 使用数组的静态初始化
		for (int x = 0; x < data.length; x++) {        // for循环输出数组
			System.out.print(data[x] + "、");            // 根据索引获取数组内容
		}
	}
}
