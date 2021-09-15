package com.rmcgo.six.eight;

//import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

/**
 * this program demonstrates anonymous inner classes.
 */
public class AnonymousInnerClassTest {
	public static void main(String[] args) {
		TalkingClock clock = new TalkingClock();
		clock.start(1000, true);

		// keep program running until the user selects "OK"
		JOptionPane.showMessageDialog(null, "quit program?");
		System.exit(0);
	}
}

/**
 * a clock that points the time in regular intervals
 */
class TalkingClock {
	/**
	 * starts the clock.
	 * @param interval
	 * @param beep
	 */
	public void start(int interval, boolean beep) {
		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.out.println("At the tone, the time is " + Instant.ofEpochMilli(event.getWhen()));
				if (beep) Toolkit.getDefaultToolkit().beep();
			}
		};
		Timer timer = new Timer(interval, listener);
		timer.start();
	}
}
