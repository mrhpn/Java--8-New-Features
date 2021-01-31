package assignment_function;

import java.util.function.Function;

public class F1_ComposingFunctions {

	public static void main(String[] args) {
		/**
		 * Requirement
		 * -----------
		 * "key:value" -> "{key=value}"
		 * 
		 * Steps
		 * -----
		 * 1) "key=value"
		 * 2) "{key=value}"
		 */
		Function<String, String> replaceColon = str -> str.replace(":", "=");
		Function<String, String> addBraces = str -> "{" + str + "}";
		
		// Declarative Programming
		String result = replaceColon
				.andThen(addBraces)
				.apply("key:value");
		System.out.println(result);
		
		String result1 = addBraces
				.compose(replaceColon)
				.apply("key:value");
		System.out.println(result1);
	}

}
