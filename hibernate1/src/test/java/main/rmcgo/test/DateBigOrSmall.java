package main.rmcgo.test;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class DateBigOrSmall {

	public static void main(String[] args) {
		List<Long> dingTalkDeptIds = new ArrayList<Long>();
		dingTalkDeptIds.add(1l);
		dingTalkDeptIds.add(2l);
		dingTalkDeptIds.add(3l);
		String s = new Gson().toJson(dingTalkDeptIds);
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == '[' || chars[i] == ']') {
				chars[i] = '\"';
			}
		}
		String s1 = String.valueOf(chars);
		System.out.println(s1);
	}
}