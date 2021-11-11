package chapter5;

import com.rmcgo.chapter5.two.Employee;
import org.junit.Test;

public class EmployeeTest {

	@Test
	public void test1() {
		Employee emp = new Employee(001, "rmcgo", 10000, 0.20);
		System.out.println(emp);
		System.out.println(emp.calSalaryAddValue(emp.getBasicSalary(), emp.getSalaryRatio()));
		System.out.println(emp.addedSumSalary(emp.getBasicSalary(), emp.getSalaryRatio()));
	}
}
