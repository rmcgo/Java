package main.rmcgo.five.eleven;

import main.rmcgo.five.ten.Employee;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Employee> staff = new ArrayList<>();

		staff.add(new Employee("rmcgo", 80000, 1998, 12, 2));
		staff.add(new Employee("rmcgo2", 80000, 1997, 12, 2));
		staff.add(new Employee("rmcgo3", 80000, 1999, 12, 2));

		for (Employee e : staff) {
			System.out.println("name = " + e.getName() + ", salary = " + e.getSalary() + ", hireDay" + e.getHireDay());
		}
	}
}
