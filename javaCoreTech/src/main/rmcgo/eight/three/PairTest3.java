package main.rmcgo.eight.three;

import main.rmcgo.eight.one.Pair;
import main.rmcgo.five.ten.Employee;
import main.rmcgo.five.ten.Manager;

public class PairTest3 {
	public static void main(String[] args) {
		Manager ceo = new Manager("rmcgo", 80000, 1998, 12, 02);
		Manager cfo = new Manager("rmcgo2", 90000, 1997, 12, 02);
		var buddies = new Pair<>(ceo, cfo);
		printBuddies(buddies);

		ceo.setBonus(1000_000);
		cfo.setBonus(50_000);
		Manager[] managers = {ceo, cfo};

		var result = new Pair<Employee>();
		minmax(managers, result);
		System.out.println("first: " + result.getFirst().getName() + ", second: " + result.getSecond().getName());
		maxminBonus(managers, result);
		System.out.println("second: " + result.getFirst().getName() + ", second: " + result.getSecond().getName());
	}

	public static void printBuddies(Pair<? extends Employee> p) {
		Employee first = p.getFirst();
		Employee second = p.getSecond();
		System.out.println(first.getName() + " and" + second.getName() + " are buddies");
	}

	public static void minmax(Manager[] a, Pair<? super Manager> result) {
		if (a.length == 0) return;
		Manager min = a[0];
		Manager max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min.getSalary() > a[i].getSalary()) min = a[i];
			if (max.getSalary() < a[i].getSalary()) max = a[i];
		}
		result.setFirst(min);
		result.setSecond(max);
	}

	public static void maxminBonus(Manager[] a, Pair<? super Manager> result) {
		minmax(a, result);
		PairAlg.swapHelper(result); // swapHelper captures wildcard type
	}
}

class PairAlg {
	public static boolean hasNull(Pair<?> p) {
		return p.getFirst() == null || p.getSecond() == null;
	}

	public static void swap(Pair<?> p) {
		swapHelper(p);
	}

	public static <T> void swapHelper(Pair<T> p) {
		T t = p.getFirst();
		p.setFirst(p.getSecond());
		p.setSecond(t);
	}
}