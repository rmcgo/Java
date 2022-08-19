package chapter8_inherit.override;

class Channel {
	private void connect() {									// 父类定义方法
		System.out.println("【Channel父类】进行资源的连接。");
	}
	public void handle() {									// 父类定义方法
		// 如果子类成功覆写了此方法，那么通过子类实例化对象调用时执行的一定是子类方法
		this.connect(); 										// 调用connect()
	}
}
class DatabaseChannel extends Channel {						// 数据库连接
	public void connect() { 									// 未覆写
		System.out.println("【DatabaseChannel子类】进行数据库资源的连接。");
	}
}
public class JavaDemo {
	public static void main(String args[]) {
		DatabaseChannel channel = new DatabaseChannel() ;		// 实例化子类对象
		channel.handle() ;									// 父类提供的方法
	}
}