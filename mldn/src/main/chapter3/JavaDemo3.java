package chapter3;

public class JavaDemo3 {
	public static void main(String[] args) {
		point: for (int x = 0; x < 3; x++) {		// 外层for循环，定义代码标记
			for (int y = 0; y < 3; y++) {			// 内存for循环
				if (x == y) {
					continue point; 				// 循环跳转到指定外层循环
				}
				System.out.print(x + "、");		// 输出内容
			}
			System.out.println();					// 换行
		}
	}
}
