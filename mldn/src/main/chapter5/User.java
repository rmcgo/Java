package chapter5;

class User1 {
	private String uid ;
	private String password ;
	private static int count = 0 ;
	public User1() {
		this("NOID","mldn") ;
	}
	public User1(String uid) {
		this(uid,"mldnjava") ;
	}
	public User1(String uid,String password) {
		this.uid = uid ;
		this.password = password ;
		count ++ ;	// 个数追加
	}
	public static int getCount() {	// 获取用户个数
		return count ;
	}
	// setter、getter略
	public String getInfo() {
		return "用户名：" + this.uid + "、密码：" + this.password ;
	}
}
public class User {
	public static void main(String args[]) {
		User1 userA = new User1() ;
		User1 userB = new User1("小强") ;
		User1 userC = new User1("大强","我不行") ;
		System.out.println(userA.getInfo()) ;
		System.out.println(userB.getInfo()) ;
		System.out.println(userC.getInfo()) ;
		System.out.println("用户个数：" + User1.getCount()) ;
	}
}