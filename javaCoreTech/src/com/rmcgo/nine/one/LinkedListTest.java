package com.rmcgo.nine.one;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
/**
 * this program demonstrates operations on linked lists.
 */
public class LinkedListTest {
	public static void main(String[] args) {
		var a = new LinkedList<String>();
		a.add("rmcgo");
		a.add("rmcgoA");
		a.add("rmcgoB");

		var b = new LinkedList<String>();
		b.add("hkffkh");
		b.add("hkffkhA");
		b.add("hkffkhB");
		b.add("hkffkhC");

		// merge the words from b into a
		ListIterator<String> aIter = a.listIterator();
		Iterator<String> bIter = b.iterator();

		while (bIter.hasNext()) {
			if (aIter.hasNext()) aIter.next();
			aIter.add(bIter.next());
		}
		System.out.println(a);

		// remove every second word from b
		bIter = b.iterator();
		while (bIter.hasNext()) {
			bIter.next(); // skip one elememnt
			if (bIter.hasNext()) {
				bIter.next(); // skip next element
				bIter.remove(); // remove that element
			}
		}
		System.out.println(b);

		// bulk operation: remove all words in b from a
		a.removeAll(b);
		System.out.println(a);
	}
}