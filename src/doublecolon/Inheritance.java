package doublecolon;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;


	public class Inheritance{ 
		  
	    // super function to be called 
	    String print(String str) 
	    { 
	        return ("Hello " + str + "\n"); 
	    } 
	} 
	  
	class Test extends Inheritance { 
	  
	    // instance method to override super method 
	    @Override
	    String print(String s) 
	    { 
	  
	        // call the super method 
	        // using double colon operator 
	        Function<String, String> 
	            func = super::print; 
	  
	        String newValue = func.apply(s); 
	        newValue += "Bye " + s + "\n"; 
	        System.out.println(newValue); 
	  
	        return newValue; 
	    } 
	  
	    // Driver code 
	    public static void main(String[] args) 
	    { 
	  
	        List<String> list = new ArrayList<String>(); 
	        list.add("NoPain"); 
	        list.add("No"); 
	        list.add("Gain"); 
	  
	        // call the instance method 
	        // using double colon operator 
	        list.forEach(new Test()::print); 
	    } 
}

