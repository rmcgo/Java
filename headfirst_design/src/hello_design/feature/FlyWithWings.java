package hello_design.feature;

import hello_design.inter_face.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("I'm flying!");
	}
}
