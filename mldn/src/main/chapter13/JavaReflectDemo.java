package chapter13;

class Member{};

public class JavaReflectDemo {
	public static void main(String[] args) throws Exception {
		// method one
//		Date date = new Date();
//		System.out.println(date.getClass());

		// method one
//		Member member = new Member();
//		Class<? extends Member> aClass = member.getClass();
//		System.out.println(aClass);

		// method two
//		Class<?> aClass = Member.class;
//		System.out.println(aClass);

		// method three
//		Class<?> aClass = Class.forName("chapter13.Member");
//		System.out.println(aClass);
	}
}
