package assignment_functional_interface;

/**
 * Functional Interface `Printer` and Method Reference
 * @author Htet Phyo Naing
 *
 */
public class FI1_MethodReference implements Printer {

	// method reference
	public static void show() {
		greet(System.out::println);
	}
	
	public static void greet(Printer printer) {
		printer.print("Hello World");
	}

	@Override
	public void print(String message) {
	}
	
	public static void main(String[] args) {
		show();
	}
}
