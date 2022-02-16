package main.rmcgo.six.oneAndtwo;

import java.util.Arrays;

public class EmployeeSourTest {
	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("rmcgo", 80_000);
		staff[1] = new Employee("rmcgo2", 90_000);
		staff[2] = new Employee("rmcgo3", 100_000);

		Arrays.sort(staff);

		// print out information about all employee objects
		for (Employee e : staff) {
			System.out.println("name=" + e.getName() + ", salary=" + e.getSalary());
		}
	}
}
