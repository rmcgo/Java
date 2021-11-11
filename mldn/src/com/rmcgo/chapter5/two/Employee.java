package com.rmcgo.chapter5.two;

public class Employee {
	private int num;
	private String name;
	private double basicSalary;
	private double salaryRatio;

	public Employee(int num, String name, double basicSalary, double salaryRatio) {
		this.num = num;
		this.name = name;
		this.basicSalary = basicSalary;
		this.salaryRatio = salaryRatio;
	}

	public double calSalaryAddValue(double salary, double ratio) {
		return salary * ratio;
	}

	public double addedSumSalary(double salary, double ratio) {
		return this.calSalaryAddValue(salary, ratio) + salary;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getSalaryRatio() {
		return salaryRatio;
	}

	public void setSalaryRatio(double salaryRatio) {
		this.salaryRatio = salaryRatio;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"num=" + num +
				", name='" + name + '\'' +
				", basicSalary=" + basicSalary +
				", salaryRatio=" + salaryRatio +
				'}';
	}
}
