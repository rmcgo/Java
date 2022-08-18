package chapter6;

public class StringDemo2 {
	public static void main(String args[]) {
		String str = "www.mldn.cn"; 						// 定义String类对象
		System.out.println(str.indexOf("mldn"));			// 查找索引
		System.out.println(str.indexOf("hello"));			// 查找索引
		if (str.indexOf("mldn") != -1) {					// 如果索引返回不是-1表示查询到
			System.out.println("要查询的子字符串存在。");	// 输出查询结果
		}

		String str2 = "www.mldn.cn"; 					// 定义String类对象
		System.out.println(str2.lastIndexOf(".")) ;		// 由后向前查找

		String str3 = "mldn java yootk jixianit"; 			// 定义String类对象
		String result[] = str3.split(" "); 					// 空格拆分
		for (int x = 0; x < result.length; x++) {			// 循环输出
			System.out.print(result[x] + "、");			// 拆分结果
		}
		System.out.println();
		String str4 = "mldn java "; 						// 定义String类对象
		String result2[] = str4.split(""); 					// 空格拆分
		for (int x = 0; x < result2.length; x++) {			// 循环输出
			System.out.print(result2[x] + "、");			// 拆分结果
		}
		System.out.println();
		String str5 = "mldn java yootk jixianit"; 			// 定义String类对象
		String result3[] = str5.split(" ", 1); 				// 部分空格拆分
		for (int x = 0; x < result3.length; x++) {			// 循环输出
			System.out.print(result3[x] + "、");			// 拆分结果
		}

		String str6 = "张三:20|李四:21|王五:22";			// 定义字符串
		String result4[] = str6.split("\\|");			// 第一次拆分
		for (int x = 0; x < result4.length; x++) {
			String temp[] = result4[x].split(":");		// 第二次拆分
			System.out.println("姓名：" + temp[0] + "，年龄：" + temp[1]);
		}

		String str7 = "mldn-photo-李兴华.jpg";			// 字符串结构：“用户id-photo-姓名.后缀”
		int beginIndex = str7.indexOf("-", str7.indexOf("photo")) + 1;	// 开始索引
		int endIndex = str7.lastIndexOf(".");							// 结束索引
		System.out.println(str7.substring(beginIndex, endIndex));

		String str8 = "   MLDN Java   ";			// 字符串对象，前、中、后都有空格
		System.out.println(str8.length()); 			// 长度计算（包括所有空格）
		String trimStr = str8.trim();				// 去掉前后空格（中间空格保留）
		System.out.println(str8);					// 原始字符串
		System.out.println(trimStr);				// trim()处理后的字符串
		System.out.println(trimStr.length());		// trim()处理后的字符串长度


		String name = "张三";					// 姓名
		int age = 18;						// 年龄
		double score = 98.765321;				// 成绩，有多余小数位
		String str9 = String.format("姓名：%s、年龄：%d、成绩：%5.2f。",
				name, age, score);		// 格式化字符串
		System.out.println(str9);
	}
}