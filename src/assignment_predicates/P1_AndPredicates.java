package assignment_predicates;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.Predicate;

public class P1_AndPredicates {
	// checking a string has supported dirty words
	public static Predicate<String> hasIncludedDirtyWord = new Predicate<String>() {
		String[] dirtyWords = { "shit", "piss off", "asshole", "son of a bitch" };
		
		@Override
		public boolean test(String str) {
			return Arrays.stream(dirtyWords).anyMatch(str.toLowerCase()::contains);
		}
	};
	
	public static void checkDirtyWords() {
		String str = "Oh shit!";
		Predicate<String> nonNullPredicate = (s) -> Objects.nonNull(s);

		boolean result = nonNullPredicate.and(hasIncludedDirtyWord).test(str);
		System.out.println("Dirty Words in `" + str + "` -> " + result);
	}

	public static void main(String[] args) {
		checkDirtyWords();
	}

}
