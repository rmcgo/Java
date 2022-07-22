package chapter5;
public class JavaDemo7 {
	public static void main(String args[]) {
		// 【1】实例化一个Channel对象，并且传入要发送的消息标题与消息内容
		Channel ch = new Channel("MLDN运动会", "大家一起长跑30公里。"); // 实例化Channel对象并发送消息
	}
}

class Channel {
	private Message2 message; 							// 消息发送由Message负责
	// 【2】实例化Channel类对象，调用构造方法，接收要发送的消息标题与消息内容
	public Channel(String title, String content) {
		// 【3】实例化Message，但是需要将主类中的ch传递到Message中、this = ch
		this.message = new Message2(this, title, content);
		this.message.send(); 							// 【5】消息发送
	}
	// 以后在进行方法创建的时候如果某一个方
	// 法的名称以is开头一般都返回boolean值
	public boolean isConnect() { 						// 判断连接是否创建
		return true;									// 默认返回true
	}
}


class Message2 {
	private Channel channel; 						// 保存消息发送通道
	private String title; 							// 消息标题
	private String content; 							// 消息内容
	// 【4】调用此构造实例化，此时的channel = 主类ch
	public Message2(Channel channel, String title, String content) {
		this.channel = channel; 						// 保存消息通道
		this.title = title;							// 设置title属性
		this.content = content;						// 设置content属性
	}
	public void send() {
		// 【6】判断当前通道是否可用，那么此时的this.channel就是主类中的ch
		if (this.channel.isConnect()) { 				// 连接成功
			System.out.println("【消息发送】title = " + this.title + "、content = " + this.content);
		} else { 									// 没有连接
			System.out.println("【ERROR】没有可用的连接通道，无法进行消息发送。");
		}
	}
}