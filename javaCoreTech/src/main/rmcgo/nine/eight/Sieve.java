package main.rmcgo.nine.eight;

import java.util.BitSet;

/**
 * This progra runs the Sieve of Erathostenes benchmark. It computes all primes
 */
public class Sieve {
	public static void main(String[] args) {
		int n = 2000_000;
		long start = System.currentTimeMillis();
		var bitSet = new BitSet(n + 1);
		int count = 0;
		int i;
		for (i = 2; i <= n; i++) {
			bitSet.set(i);
		}
		i = 2;
		while (i * i <= n) {
			if (bitSet.get(i)) {
				count++;
				int k = 2 * i;
				while (k <= n) {
					bitSet.clear(k);
					k += i;
				}
			}
			i++;
		}
		while (i <= n) {
			if (bitSet.get(i)) count++;
			i++;
		}
		long end = System.currentTimeMillis();
		System.out.println(count + " primes");
		System.out.println((end - start) + " milliseconds");
	}
}