package chapter5;

public class JavaDemo9 {
	public static void main(String args[]) {
		new Book2("Java开发实战经典");                // 实例化新的Book类对象
		new Book2("Spring实战开发");                // 实例化新的Book类对象
		new Book2("Spring微架构实战开发");            // 实例化新的Book类对象
	}
}

class Book {
	private String title;                        // 【普通成员属性】保存图书名称
	private static int count = 0;                // 【静态成员属性】保存对象个数

	/**
	 * 构造方法，初始化title属性内容，同时进行对象个数的累加
	 *
	 * @param title 要设置的title属性内容
	 */
	public Book(String title) {
		this.title = title;                        // 保存title内容
		count++;                                // 对象个数累加
		System.out.println("第" + count + "本图书创建出来。");
	}
	// setter、getter略 ...
}