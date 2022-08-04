package chapter0;

import java.util.ArrayList;
import java.util.HashMap;

public class Hello {
	public static void main(String[] args) {
		System.out.println("课程资源请访问：www.mldn.cn");

		HashMap<Object, Object> map = new HashMap<>();
		map.put("hello", "你好");
		System.out.println(map.get("hello"));

		ArrayList<Object> list = new ArrayList<>();
		list.add("1");
//		list.add("2");
//		list.add("3");
//		list.add("4");
		for (int i = 1; i <= 4; i++) {
			if (list.size()<i){
				map.put(i, null);
			}
		}
		System.out.println(map.get(3));
	}
}
