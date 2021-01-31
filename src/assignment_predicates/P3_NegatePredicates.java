package assignment_predicates;

import java.util.Arrays;
import java.util.function.Predicate;

public class P3_NegatePredicates {
	// checking a string has supported dirty words
	public static Predicate<String> hasIncludedDirtyWord = new Predicate<String>() {
		String[] dirtyWords = { "shit", "piss off", "asshole", "son of a bitch" };
		
		@Override
		public boolean test(String str) {
			return Arrays.stream(dirtyWords).anyMatch(str.toLowerCase()::contains);
		}
	};

	public static void checkDirtyWords() {
		String lengthGTThan10 = "Oh Shit!!!. Piss Off.";

		boolean result = hasIncludedDirtyWord.negate().test(lengthGTThan10);
		System.out.println("The string does" + (result ? " NOT " : " ") + "contain the dirty words.");
	}

	public static void main(String[] args) {
		checkDirtyWords();
	}
}
