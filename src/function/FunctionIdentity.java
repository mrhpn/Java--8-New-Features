package function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionIdentity {
   
		  public static void main(String args[]){
		    Function<Employee,Employee> funcEmpToString= (Employee e)-> {
		    	e.setName(e.getName().toUpperCase());
		    	return e;
		    };
		    List<Employee> employeeList=
		     Arrays.asList(new Employee("Tom Jones", 45), 
		      new Employee("Harry Major", 25),
		      new Employee("Ethan Hardy", 65),
		      new Employee("Nancy Smith", 15),
		      new Employee("Deborah Sprightly", 29));
		    List<Employee> empObjList=applyIdentityToEmpList(employeeList,funcEmpToString);
		    empObjList.forEach(System.out::println);
		 }
		  public static List<Employee> applyIdentityToEmpList(List<Employee> employeeList, Function<Employee, Employee> funcEmpToEmp){
		   List<Employee> empObjList=new ArrayList<Employee>(); 
		   for(Employee emp:employeeList){
		     empObjList.add(funcEmpToEmp.apply(emp));
		   }
		   return empObjList;
		  }
		}
