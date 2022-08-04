package chapter5;

class Dog {
	private String name ;
	private String color ;
	private int age ;
	public Dog() {}
	public Dog(String name,String color,int age) {
		this.name = name ;
		this.color = color ;
		this.age = age ;
	}
	// setter、getter略
	public String getInfo() {
		return "狗的名字：" + this.name + "、狗的颜色：" + this.color + "、狗的年龄：" + this.age ;
	}
}
public class JavaDemo18 {
	public static void main(String args[]) {
		Dog dog = new Dog("高高","黑色",1) ;
		System.out.println(dog.getInfo()) ;
	}
}