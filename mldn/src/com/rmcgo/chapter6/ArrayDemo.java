package com.rmcgo.chapter6;

class ArrayUtil {
	private int sum;
	private double avg;
	private int max;
	private int min;

	public ArrayUtil(int data[]) {
		max = data[0];
		min = data[0];
		for (int i = 1; i < data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			}
			if (data[i] > min) {
				min = data[i];
			}
			sum += data[i];
		}
		avg = sum / data.length;
	}

	public int getSum() {
		return sum;
	}

	public double getAvg() {
		return avg;
	}

	public int getMax() {
		return max;
	}

	public int getMin() {
		return min;
	}
}

public class ArrayDemo {
	public static void main(String[] args) {
		int data[] = new int[] {1, 2, 3, 4, 5};
		ArrayUtil util = new ArrayUtil(data);
		System.out.println("max is " + util.getMax());
		System.out.println("min is " + util.getMin());
		System.out.println("avg is " + util.getAvg());
		System.out.println("sum is " + util.getSum());
	}
}
