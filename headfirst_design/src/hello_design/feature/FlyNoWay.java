package hello_design.feature;

import hello_design.inter_face.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("I can't fly");
	}
}
