package main.rmcgo.five.ten;

import java.util.Objects;

public class Manager extends Employee{

	private Double bonus;

	public Manager(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
		bonus = 0.0;
	}

	@Override
	public double getSalary() {
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}

	public void setBonus(double bonus){
		this.bonus = bonus;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		Manager manager = (Manager) o;
		return Objects.equals(bonus, manager.bonus);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), bonus);
	}

	@Override
	public String toString() {
		return "Manager{" +
				"bonus=" + bonus +
				'}';
	}
}
