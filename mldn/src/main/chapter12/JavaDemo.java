package chapter12;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class JavaDemo {
	public static void main(String[] args) {
		Function<String, Boolean> fun = "**helloworld"::startsWith;
		System.out.println(fun.apply("**"));

		System.out.println("***********************************");
		Consumer<String> con = System.out::println;
		con.accept("www.hrsaas.com");

		System.out.println("***********************************");
		Supplier<String> sup = "helloWorld"::toLowerCase;
		System.out.println(sup.get());

		System.out.println("***********************************");
		Predicate<String> pre = "helloWorld"::equalsIgnoreCase;
		System.out.println(pre.test("HELLOWORLD"));
	}
}
