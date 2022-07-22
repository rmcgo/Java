package chapter5;

public class JavaDemo10 {
	public static void main(String args[]) {
		System.out.println(new Book2("Java开发实战经典").getTitle());
		System.out.println(new Book2().getTitle());
		System.out.println(new Book2("Spring实战开发").getTitle());
		System.out.println(new Book2().getTitle());
	}
}
class Book2 {
	private String title ;						// 【普通成员属性】保存图书名称
	private static int count = 0 ;				// 【静态成员属性】保存对象个数
	public Book2() {
		this("MLDNTITLE - " + count ++) ;			// 调用单参构造
	}
	public Book2(String title) {
		this.title = title ;						// 保存title内容
	}
	public String getTitle() {
		return title;
	}
	// setter略 ...
}
