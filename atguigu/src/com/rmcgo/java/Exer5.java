package com.rmcgo.java;

public class Exer5 {
	public static void main(String[] args) {
		String season = "summer";
		switch (season) {
			case "spring" :
				System.out.println("春天");
				break;
			case "summer":
				System.out.println("夏天");
				break;
			case "autumn":
				System.out.println("秋天");
				break;
			case "winter":
				System.out.println("冬天");
				break;
			default:
				System.out.println("季节输入有误");
				break;
		}
	}
}
