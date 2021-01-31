package assignment_functional_interface;

import java.util.ArrayList;
import java.util.List;

public class FI2_StaticReference {

	static void doSomething(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherries");

		// static reference
		fruits.forEach(FI2_StaticReference::doSomething);
	}

}
