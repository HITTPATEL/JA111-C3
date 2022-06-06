package C3.Q2;

public class TemporaryEmployee extends Employee {
     private int hoursWorked;
     private int hourlyWages;
     
	public TemporaryEmployee(int employeeId, String employeeName,int hoursWorked,int hourlyWages) {
		super(employeeId, employeeName);
	
	}

	@Override
	public void calculateSalary() {
		double salary=hoursWorked*hourlyWages;
		setSalary(salary);
	}

}
