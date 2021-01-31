package assignment_predicates;

import java.util.function.Predicate;

public class P5_PredicatesInFunction {
	
	static void pred(int number, Predicate<Integer> predicate) {
		if (predicate.test(number)) {
			System.out.println("Number " + number + " is Even.");
		}
	}

	public static void main(String[] args) {
		pred(100, (i) -> i % 2 == 0);
	}
}
