package com.rmcgo.nine.threeAndfour;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * This program sorts a set of Item objects by comparing their description.
 */
public class TreeSetTest {
	public static void main(String[] args) {
		var parts = new TreeSet<Item>();
		parts.add(new Item("rmcgo", 1234));
		parts.add(new Item("hkf", 2323));
		parts.add(new Item("fpf", 3435));
		System.out.println(parts);

		var sortByDescription = new TreeSet<Item>(Comparator.comparing(Item::getDescription));

		sortByDescription.addAll(parts);
		System.out.println(sortByDescription);
	}
}
