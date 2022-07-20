package chapter5;

public class Person {
	String name;                        // 【成员属性】人的姓名
	int age;                            // 【成员属性】人的年龄

	/**
	 * 定义一个信息获取的操作方法，此方法可以输出属性内容
	 */
	public void tell() {
		System.out.println("姓名：" + name + "、年龄：" + age);
	}
}
