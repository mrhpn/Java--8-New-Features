package defaultmethod;

interface TestInterface3 {
	// default method
	default void show() {
		System.out.println("Default TestInterface3");
	}
}

interface TestInterface2 {
	// Default method
	default void show() {
		System.out.println("Default TestInterface2");
	}
}

public class InhericDefault implements TestInterface3, TestInterface2 {

	// A simple Java program to demonstrate multiple
	// inheritance through default methods.

	// Implementation class code
	// Overriding default show method
	@Override
	public void show() {
		// use super keyword to call the show
		// method of TestInterface3 interface
		TestInterface3.super.show();

		// use super keyword to call the show
		// method of TestInterface2 interface
		TestInterface2.super.show();
	}

	public static void main(String args[]) {
		InhericDefault d = new InhericDefault();
		d.show();
	}
}
