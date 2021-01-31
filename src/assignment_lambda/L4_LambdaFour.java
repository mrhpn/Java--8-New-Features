package assignment_lambda;

@FunctionalInterface
interface MutateString {
	String addStars(String str);
}

public class L4_LambdaFour {

	public static void main(String[] args) {
		MutateString addStar = (str) -> {
			String result = "";
			
			System.out.println();

			for (int i = 0; i < str.length() - 1; i++)
				result += str.charAt(i) + "*";
			return result;
		};
		
		System.out.println(addStar.addStars("I am so saw kyi."));
	}

}
