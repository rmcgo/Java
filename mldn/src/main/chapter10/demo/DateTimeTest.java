package chapter10.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeTest {
	public static void main(String[] args) throws ParseException {
		String date1 = "2021-5-1";
		String date2 = "2022-2-28";
		System.out.println(daysBetween(date2, date1));
	}

	/**
	 * JAVA计算两个日期相差多少天(by Date String with format "yyyy-MM-dd")
	 * @author zhengkai.blog.csdn.net
	 */
	public static int daysBetween(String date1str,String date2str) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = format.parse(date1str);
		Date date2 = format.parse(date2str);
		int a = (int) ((date1.getTime() - date2.getTime()) / (1000*3600*24));
		return a;
	}
}
