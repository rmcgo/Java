package chapter3;

public class JavaDemo2 {
	public static void main(String[] args) {
		int line = 5;								// 总体行数
		for (int x = 0; x < line; x++) {				// 外层循环控制三角形行数
			for (int y = 0; y < line - x; y++) {		// 每行的空格数量逐步减少
				System.out.print(" ");				// 输出空格
			}
			for (int y = 0; y <= x; y++) {			// 每行输出的“*”逐步增加
				System.out.print("* ");				// 输出“*”
			}
			System.out.println();						// 换行
		}
	}
}
