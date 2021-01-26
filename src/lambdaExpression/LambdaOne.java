package lambdaExpression;

/**
 * Functional Interface
 * --------------------
 * 
 * SAM Interface (Single Abstract Method)
 * 
 * Examples
 * --------
 * Comparable (compareTo)
 * Iterable (iterate)
 * Runable (run)
 */
@FunctionalInterface
interface NumericTest {
	boolean computeTest(int n);
}

public class LambdaOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumericTest isEven = (a) -> (a % 2) == 0;
		// n become n modulus by 2 equal zero
		NumericTest isNegative = (n) -> (n < 0);

		// Output: false
		System.out.println(isEven.computeTest(5));

		// Output: true
		System.out.println(isNegative.computeTest(-5));
	}

}
