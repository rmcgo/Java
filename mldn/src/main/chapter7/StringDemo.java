package chapter7;

public class StringDemo {
	public static void main(String[] args) {
		//7.8.3
//		String str = "hello world";
//		byte[] data = str.getBytes(StandardCharsets.UTF_8);
//		for (int i = 0; i < data.length; i++) {
//			data[i] -= 32;
//		}
//		System.out.println(new String(data));
//		System.out.println(new String(data, 0, 5));

		//7.8.4
//		String str = "have a nice day";
//		System.out.println("Have a nice day".equals(str));
//		System.out.println("Have a nice day".equalsIgnoreCase(str));

//		String strA = "hello";
//		String strB = "hellO";
//		System.out.println(strA.compareTo(strB));
//		System.out.println(strB.compareTo(strA));
//		System.out.println("Hello".compareTo("Hello"));
//		System.out.println(strA.compareToIgnoreCase(strB));

		// 7.8.5 字符串查找
//		String str = "www.hrsaas.com";
//		System.out.println(str.contains("hrsaas"));
//		System.out.println(str.contains("world"));

//		String str = "www.hrsaas.com";
//		System.out.println(str.indexOf("hrsaas"));
//		System.out.println(str.indexOf("hello"));
//		if (str.indexOf("hrsaas") != -1) {
//			System.out.println("have String in str");
//		}
//
//		System.out.println(str.lastIndexOf("com"));
//		System.out.println(str.indexOf("www"));

//		String str = "**@@www.hrsaas.com##";
//		System.out.println(str.startsWith("**"));
//		System.out.println(str.startsWith("@@", 2));
//		System.out.println(str.endsWith("##"));

		// 7.8.6 字符串替换
//		String str = "www.hrsaas.com";
//		System.out.println(str.replaceFirst("w", "*"));
//		System.out.println(str.replaceAll("w", "*"));

		// 7.8.7 字符串拆分
//		String str = "hello world with people";
//		String result[] = str.split(" ");
//		for (int i = 0; i < result.length; i++) {
//			System.out.print(result[i] + "、 ");
//		}
//		String result2[] = str.split("");
//
//		for (int i = 0; i < result2.length; i++) {
//			System.out.print(result2[i] + "、 ");
//		}
//
//		String result3[] = str.split(" ", 3);
//		for (int i = 0; i < result3.length; i++) {
//			System.out.println(result3[i] + "、 ");
//		}

		String str = "zhangshan:20|lisi:21|wangwu:22";
		String result[] = str.split("\\|");
		for (int i = 0; i < result.length; i++) {
			String temp[] = result[i].split("\\:");
			System.out.println("name: " + temp[0] + ", " + "age: " + temp[1]);
		}

		// 7.8.8
	}
}
