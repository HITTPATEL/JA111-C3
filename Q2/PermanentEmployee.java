package C3.Q2;

public class PermanentEmployee extends Employee {
    private double basicPay;
    
   
	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	public PermanentEmployee(int employeeId, String employeeName,double basicPay) {
		super(employeeId, employeeName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculateSalary() {
		double PFamount=basicPay*0.12;
		double salary = basicPay-PFamount;
		this.setSalary(salary);
	}

}
