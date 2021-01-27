package lambdaExpression1;

/**
 * Passing Lambda to function
 *
 */

@FunctionalInterface
interface MyString1 {
	String myStringFunction(String str);
}

public class LambdaFive {

	public static String reverseStr(MyString1 reverse, String str) {
		return reverse.myStringFunction(str);
	}

	public static void main(String[] args) {
		// Block lambda to reverse string
		MyString1 reverse = (str) -> {
			String result = "";

			for (int i = str.length() - 1; i >= 0; i--)
				result += str.charAt(i);

			return result;
		};

		// Output: omeD adbmaL
		System.out.println(reverseStr(reverse, "Lambda Demo"));

	}

}
