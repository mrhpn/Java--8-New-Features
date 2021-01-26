package defaultmethod;

@FunctionalInterface
interface TestInterface 
{ 
    // abstract method 
    public void square(int a); 
  
    // default method 
    default void show() 
    { 
      System.out.println("Default Method Executed"); 
    } 
} 

public class DefaultSimple implements TestInterface{
	
	 

	public static void main(String[] args) {
		// A simple program to Test Interface default 
		// methods in java 
		
		
		    // implementation of square abstract method 
		 
		 
		       DefaultSimple d = new DefaultSimple(); 
		        d.square(4); 
		  
		        // default method executed 
		        d.show(); 
		   

	}

	@Override
	public void square(int a) {
		 System.out.println(a*a); 
		
	}

}
