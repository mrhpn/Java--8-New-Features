package defaultmethod;

interface TestInterface1 
{ 
    // abstract method 
    public void square (int a); 
  
    // static method 
    static void show() 
    { 
        System.out.println("Static Method Executed"); 
    } 
} 

public class StaticSimple {

	
	// A simple Java program to TestClassnstrate static 
	// methods in java 
	    // Implementation of square abstract method 
	 public void square (int a) 
	    { 
	        System.out.println(a*a); 
	    } 
	  
	    public static void main(String args[]) 
	    { 
	        StaticSimple d = new StaticSimple(); 
	        d.square(4); 
	  
	        // Static method executed 
	        TestInterface1.show(); 
	    } 
	} 

