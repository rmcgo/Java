package chapter5;

public class JavaDemo6 {
	public static void main(String args[]) {
		Message msgA = new Message();							// 实例化Message类对象
		System.out.println("【主类】msgA = " + msgA);			// 直接输出对象
		msgA.printThis();									// 调用方法输出this
		System.out.println("-----------------------------------");
		Message msgB = new Message();							// 实例化Message对象
		System.out.println("【主类】msgB = " + msgB);			// 直接输出对象
		msgB.printThis();									// 调用方法输出this
	}
}

class Message {
	public void printThis() {
		System.out.println("【Mesasge类】this = " + this); 		// 表示当前对象
	}
}