package chapter1;

public class Son extends Person{
	private String name;
	private String age;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getAge() {
		return age;
	}

	@Override
	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Son{" +
				"name='" + name + '\'' +
				", age='" + age + '\'' +
				'}';
	}
}
