package assignment_predicates;

import java.util.Arrays;
import java.util.function.Predicate;

public class P2_OrPredicates {
	// checking a string has supported dirty words
	public static Predicate<String> hasIncludedDirtyWord = new Predicate<String>() {
		String[] dirtyWords = { "shit", "piss off", "asshole", "son of a bitch" };
		
		@Override
		public boolean test(String str) {
			return Arrays.stream(dirtyWords).anyMatch(str.toLowerCase()::contains);
		}
	};

	public static void checkDirtyWord() {
		Predicate<String> isContainMostHatedDirtyWord = p -> p.contains("F*ck");
		String testString = "OH SHIT-pple";
		
		if(hasIncludedDirtyWord.or(isContainMostHatedDirtyWord).test(testString))
			System.out.println("Sorry! You've been banned from the system. You've violated our terms and policies.");
	}

	public static void main(String[] args) {
		checkDirtyWord();
	}

}
