package chapter5;

class Book1 {
	private int bid ;	// 编号
	private String title ;	// 书名
	private double price ;	// 价格
	private static int count = 0 ;
	public Book1(String title,double price) {
		this.bid = count + 1 ;	// 先赋值再进行count的自增
		this.title = title ;
		this.price = price ;
		count ++ ;
	}
	// setter、getter略
	public String getInfo() {
		return "图书编号：" + this.bid + "、名称：" + this.title + "、价格：" + this.price ;
	}
	public static int getCount() {
		return count ;
	}
}
public class Book {
	public static void main(String args[]) {
		Book1 b1 = new Book1("Java",89.2) ;
		Book1 b2 = new Book1("Oracle",79.2) ;
		System.out.println(b1.getInfo()) ;
		System.out.println(b2.getInfo()) ;
		System.out.println("图书总册书：" + Book1.getCount()) ;
	}
}