package assignment_awful_interface;

interface LoanCalculator {
	double calculateLoan();
	
	static void checkEligibleLoan(double income, double expenses) {
		System.out.println("Checking eligible to get a loan or not...");
	}
}

public class AI1_StaticMethods {

	public static void main(String[] args) {
		LoanCalculator.checkEligibleLoan(100_000_000, 500_000);
	}

}
