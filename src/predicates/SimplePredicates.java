package predicates;

import java.util.function.Predicate;
public class SimplePredicates {

	public static void main(String[] args) {
		// Creating predicates
        Predicate<Integer> lesserthan = i -> (i < 18);  
        // Calling Predicate method 
        System.out.println(lesserthan.test(20));  

	}

}
