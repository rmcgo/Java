package chapter5;

public class JavaDemo19 {
	public static void main(String[] args) {
		Account account = new Account("小明", 9000);
		System.out.println(account.getBalance());
		System.out.println(account);
	}
}

class Account {
	private String name;

	private double balance;

	public Account(String name) {
		this.name = name;
		this.balance = 0.0;
	}

	public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "账户名称：" + this.name + "、余额：" + this.balance ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}