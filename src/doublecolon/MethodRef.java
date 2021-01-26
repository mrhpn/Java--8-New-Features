package doublecolon;

import java.util.ArrayList;
import java.util.List;

public class MethodRef {
	void someFunction(String s) 
    { 
		System.out.println(s);
    } 
  
    public static void main(String[] args) 
    { 
         MethodRef mr=new MethodRef();
        List<String> list = new ArrayList<String>(); 
        list.add("NoPain"); 
        list.add("No"); 
        list.add("Gain"); 
  
        // call the instance method 
        // using double colon operator 
        list.forEach(System.out::println); 
    
    } 
}
