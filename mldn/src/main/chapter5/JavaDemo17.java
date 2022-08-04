package chapter5;

class Employee {
	private long empno ;
	private String ename ;
	private double salary ;
	private double rate ;
	public Employee() {}
	public Employee(long empno,String ename,double salary,double rate) {
		this.empno = empno ;
		this.ename = ename ;
		this.salary = salary ;
		this.rate = rate ;
	}
	public double salaryIncValue() {	// 得到薪水增长额度
		return this.salary * this.rate ;
	}
	public double salaryIncResult() {
		this.salary = this.salary * (1 + this.rate) ;
		return this.salary ;
	}
	// setter、getter略
	public String getInfo() {
		return "雇员编号：" + this.empno + "、雇员姓名：" + this.ename + "、基本工资：" + this.salary + "、工资增长率：" + this.rate ;
	}
}
public class JavaDemo17 {
	public static void main(String args[]) {
		Employee emp = new Employee(7369L,"史密斯",3000.0,0.3) ;
		System.out.println(emp.getInfo()) ;
		System.out.println("工资调整额度：" + emp.salaryIncValue()) ;
		System.out.println("上调后的工资：" + emp.salaryIncResult()) ;
		System.out.println(emp.getInfo()) ;
	}
}