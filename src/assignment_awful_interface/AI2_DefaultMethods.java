package assignment_awful_interface;

interface TaxCalculator {
	double calculateTax();

	default double getTaxableIncome(double income, double expenses) {
		return income - expenses;
	}
}

public class AI2_DefaultMethods implements TaxCalculator {

	public static void main(String[] args) {
		AI2_DefaultMethods test = new AI2_DefaultMethods();
		test.getTaxableIncome(100_000_000, 500_000);
		test.calculateTax();
	}

	@Override
	public double calculateTax() {
		System.out.println("Calculating tax...");
		return 0;
	}

}
