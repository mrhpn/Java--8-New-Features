package assignment_lambda;

@FunctionalInterface
interface MutateString1 {
	String addStars(String str);
}

public class L5_LambdaFive {

	public static String addStar(MutateString1 mutate, String str) {
		return mutate.addStars(str);
	}

	public static void main(String[] args) {
		// block lambda to add *
		MutateString1 mutateString = (str) -> {
			String result = "";

			for (int i = 0; i < str.length(); i++)
				result += str.charAt(i) + " * ";

			return result;
		};

		System.out.println(addStar(mutateString, "Lambda is awesome."));

	}

}
