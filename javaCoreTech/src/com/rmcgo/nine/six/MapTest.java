package com.rmcgo.nine.six;


import com.rmcgo.six.oneAndtwo.Employee;

import java.util.HashMap;

/**
 * This program demonstrates the use of a map with key type String and value type Employee.
 */
public class MapTest {
	public static void main(String[] args) {
		var staff = new HashMap<String, Employee>();
		staff.put("123", new Employee("hello"));
		staff.put("234", new Employee("hello2"));
		staff.put("345", new Employee("hello3"));
		staff.put("456", new Employee("hello4"));

		// print all entries
		System.out.println(staff);

		// remove an entry
		staff.remove("234");

		staff.put("234", new Employee("hello2aaa"));

		// look up a value
		System.out.println(staff.get("345"));

		// iterate through all entries
		staff.forEach((k, v) -> {
			System.out.println("key=" + k + ", value=" + v);
		});
	}
}
