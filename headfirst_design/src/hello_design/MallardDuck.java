package hello_design;

import hello_design.feature.FlyWithWings;
import hello_design.feature.Quack;

public class MallardDuck extends Duck{
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I'm a 绿头鸭");
	}
}
