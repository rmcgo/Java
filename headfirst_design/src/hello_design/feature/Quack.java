package hello_design.feature;

import hello_design.inter_face.QuackBehavior;

public class Quack implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("Quack");
	}
}
