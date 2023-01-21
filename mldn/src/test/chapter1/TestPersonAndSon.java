package chapter1;

public class TestPersonAndSon {
	public static void main(String[] args) {
		Son son = new Son();
		son.setName("小明");
		son.setAge("18");
		System.out.println(son);

		System.out.println(String.valueOf(new StringBuilder("Hello").append("$$").append("World")));
	}
}
