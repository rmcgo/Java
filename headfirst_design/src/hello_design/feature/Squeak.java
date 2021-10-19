package hello_design.feature;

import hello_design.inter_face.QuackBehavior;

public class Squeak implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("Squeak");
	}
}
