package assignment_lambda;

@FunctionalInterface
interface MyGeneric<T> {
	T compute(T t);
}

public class L3_LambdaThree {

	public static void main(String[] args) {
		// Integer version of MyGeneric
		MyGeneric<Integer> consecutiveSum = (Integer n) -> {
			int result = 0;

			for (int i = 1; i <= n; i++) {
				result =  i + result;				
			}

			return result;
		};
		
		System.out.println(consecutiveSum.compute(4)); // Output: 10
	}

}
