package C3.Q2;

public class Loan {
	private Loan() {
		// TODO Auto-generated constructor stub
	}
	public double calculateLoanAmount(Employee employeeObj) {
		if(employeeObj instanceof PermanentEmployee) {
			double salary=employeeObj.getSalary();
			double loanAmount=(salary*15)/100;
			return loanAmount;
		}
		else if(employeeObj instanceof TemporaryEmployee) {
			double salary=employeeObj.getSalary();
			double amount=(salary*10)/100;
			double loanAmount=salary-amount;
			return loanAmount;
		}
		return 0;
		
	}
	
	public static Loan getLoanObject() {
		Loan loan =new Loan();
		return loan;
	}
}
