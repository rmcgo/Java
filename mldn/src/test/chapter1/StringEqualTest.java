package chapter1;

import java.util.ArrayList;
import java.util.List;

public class StringEqualTest {
	public static void main(String[] args) {
		String name = "你好";
		ArrayList<String> objects = new ArrayList<>();
		objects.add(name);
		String join = String.join(" or ", objects);
		System.out.println(join);

		if (name.equals("你好")) {
			System.out.println("nihao");
		}

		System.out.println("----------------------------");

		List<String> lists = new ArrayList<>();
		lists.add("hello1");
		lists.add("hello2");
		lists.add("hello3");
		lists.add("hello4");
		System.out.println(lists);
	}
}
