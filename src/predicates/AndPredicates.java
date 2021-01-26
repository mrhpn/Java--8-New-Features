package predicates;

import java.util.Objects;
import java.util.function.Predicate;

public class AndPredicates {
	
	public static Predicate<String> hasLengthOf10 = new Predicate<String>() { 
        @Override
        public boolean test(String t) 
        { 
            return t.length() > 10; 
        } 
    }; 
  //  (s) -> s.lenght() > 10
    public static void predicate_and() 
    { 
        Predicate<String> nonNullPredicate = (s)-> Objects.nonNull(s);
        // (s)-> Objects.nonNull(s);
       
  
        String nullString = null; 
        String fruit="Apple";
        
        boolean outcome3 = nonNullPredicate.and(hasLengthOf10).test(fruit); 
        System.out.println(outcome3); 
  
  
        boolean outcome = nonNullPredicate.and(hasLengthOf10).test(nullString); 
        System.out.println(outcome); 
  
        String lengthGTThan10 = "Welcome to the machine"; 
        boolean outcome2 = nonNullPredicate.and(hasLengthOf10). 
        test(lengthGTThan10); 
        System.out.println(outcome2); 
    } 
    public static void main(String[] args) 
    { 
        predicate_and(); 
    } 
}
