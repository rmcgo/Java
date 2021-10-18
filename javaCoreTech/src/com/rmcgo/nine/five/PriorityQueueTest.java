package com.rmcgo.nine.five;

import java.time.*;
import java.util.PriorityQueue;

public class PriorityQueueTest {
	public static void main(String[] args) {
		var pq = new PriorityQueue<LocalDate>();
		pq.add(LocalDate.of(1999, 8,3));
		pq.add(LocalDate.of(1009, 8,3));
		pq.add(LocalDate.of(2009, 8,3));
		pq.add(LocalDate.of(2004, 8,3));

		System.out.println("Iterating over elements ... ");
		for (LocalDate date : pq)
			System.out.println(date);
		System.out.println("Removing elements ...");
		while (!pq.isEmpty())
			System.out.println(pq.remove());
	}
}
