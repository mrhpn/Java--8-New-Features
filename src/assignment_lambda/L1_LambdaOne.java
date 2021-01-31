package assignment_lambda;

@FunctionalInterface
interface NumbericTest {
	boolean checkNumber(int n);
}

public class L1_LambdaOne {

	public static void main(String[] args) {
		NumbericTest isEven = (a) -> (a % 2) == 0;
		System.out.println(isEven.checkNumber(19)); // Output: false
		
		NumbericTest isPositive = (n) -> (n < 0);
		System.out.println(isPositive.checkNumber(-1)); // Output: true
	}

}
