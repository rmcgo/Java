package com.rmcgo.six.six;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;

/**
 * this program demonstrates the use of lambda expressions
 */
public class LambdaTest {
	public static void main(String[] args) {
		String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
		System.out.println(Arrays.toString(planets));
		System.out.println("Sorted in dictionary order:");
		Arrays.sort(planets);
		System.out.println(Arrays.toString(planets));
		System.out.println("Sorted by length:");
		Arrays.sort(planets, (first, second) -> first.length() - second.length());
		System.out.println(Arrays.toString(planets));

		Timer timer = new Timer(1000, event -> {
			System.out.println("The time is " + new Date());
		});
		timer.start();

		// keep program running until use selects "OK"
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}
}
