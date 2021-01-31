package assignment_predicates;

import java.util.function.Predicate;

public class P4_ChainPredicates {

	public static void main(String[] args) {
		// Creating predicate
		Predicate<Integer> hasAgeOfMajority = (age) -> age > 18;
		Predicate<Integer> ageLowerThan40 = (age) -> age > 40;

		// chaining predicates
		if (hasAgeOfMajority.and(ageLowerThan40).negate().test(15))
			System.out.println("Congratulations! You are eligible to the Loan.");
	}
}
