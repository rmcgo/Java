package com.rmcgo.six.seven;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

/**
 * this program demonstrates the use of inner classes.
 */
public class InnerClassTest {
	public static void main(String[] args) {
		TalkingClock clock = new TalkingClock(1000, true);
		clock.start();

		// keep program running until the user selects "OK"
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}
}

/**
 * Constructs a talking clock
 */
class TalkingClock {
	private int interval;
	private boolean beep;

	public TalkingClock(int interval, boolean beep) {
		this.interval = interval;
		this.beep = beep;
	}

	/**
	 * Starts the clock
	 */
	public void start() {
		TimePrinter listener = new TimePrinter();
		Timer timer = new Timer(interval, listener);
		timer.start();
	}

	public class TimePrinter implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			System.out.println("At the tome, the time is " + Instant.ofEpochMilli(event.getWhen()));
			if (beep) Toolkit.getDefaultToolkit().beep();
		}
	}
}
