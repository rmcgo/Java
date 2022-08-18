package chapter5;

class Message4 {
	public void printThis() {
		System.out.println("【Mesasge类】this = " + this); 		// 表示当前对象
	}
}
public class JavaDemo20 {
	public static void main(String args[]) {
		Message4 msgA = new Message4();							// 实例化Message类对象
		System.out.println("【主类】msgA = " + msgA);			// 直接输出对象
		msgA.printThis();									// 调用方法输出this
		System.out.println("-----------------------------------");
		Message4 msgB = new Message4();							// 实例化Message对象
		System.out.println("【主类】msgB = " + msgB);			// 直接输出对象
		msgB.printThis();									// 调用方法输出this
	}
}