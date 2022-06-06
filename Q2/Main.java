package C3.Q2;

public class Main {
    
	
	
	public static void main(String[] args) {
		PermanentEmployee permanentEmployee=new PermanentEmployee(545,"Hittu",200000);
		TemporaryEmployee tenEmployee=new TemporaryEmployee(4515, "Shyam", 2, 3);
		
		
		Loan loan=Loan.getLoanObject();
		double amount=loan.calculateLoanAmount(permanentEmployee);
		System.out.println(amount);
		double amount2=loan.calculateLoanAmount(tenEmployee);
		System.out.println(amount2);
		
	}
}
