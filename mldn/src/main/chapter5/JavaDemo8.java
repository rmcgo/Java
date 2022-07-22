package chapter5;

class Dept {									// 类名称可以明确描述出某类事物
	private long deptno ;						// 类中成员属性封装
	private String dname ;					// 类中成员属性封装
	private String loc ;						// 类中成员属性封装
	public Dept() {} 							// 提供有无参
	public Dept(long deptno, String dname, String loc) {
		this.deptno = deptno ;				// 设置deptno属性内容
		this.dname = dname ;					// 设置dname属性内容
		this.loc = loc ;						// 设置loc属性内容
	}
	public String getInfo() {					// 获取对象信息
		return "【部门信息】部门编号：" + this.deptno + "、部门名称：" + this.dname + "、部门位置：" + this.loc ;
	}
	// setter、getter略
}
public class JavaDemo8 {
	public static void main(String args[]) {
		Dept dept = new Dept(10,"技术部","北京") ;		// 实例化类对象
		System.out.println(dept.getInfo()) ;		// 获取对象信息
	}
}