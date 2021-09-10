package com.rmcgo.five.ten;

public class EqualTest {
	public static void main(String[] args) {
		Employee rmcgo = new Employee("rmcgo", 100000, 1988, 12, 12);
		Employee hkf = rmcgo;
		Employee rmcgo2 = new Employee("rmcgo", 100000, 1988, 12, 12);
		Employee hkf2 = new Employee("hkf2", 19000, 1998, 9, 12);

		System.out.println("rmcgo with hkf" + (rmcgo == hkf));
		System.out.println("rmcgo with rmcgo2" + (rmcgo == rmcgo2));

		System.out.println("rmcgo.equals(rmcgo2)" + rmcgo.equals(rmcgo2));
		System.out.println("rmcgo.equals(hkf2)" + rmcgo.equals(hkf2));

		System.out.println("hkf2.toString" + hkf2);


		Manager carl_creacker = new Manager("Carl Creacker", 80000, 1987, 12, 15);
		Manager boss = new Manager("Carl Creacker", 80000, 1987, 12, 15);
		boss.setBonus(80000);
		System.out.println("boss.toString" + boss);
		System.out.println("carl_creacker.equals(boss)" + carl_creacker.equals(boss));
		System.out.println(rmcgo.hashCode());
		System.out.println(rmcgo2.hashCode());
		System.out.println(hkf2.hashCode());
		System.out.println(carl_creacker.hashCode());
		System.out.println(boss.hashCode());
	}
}
