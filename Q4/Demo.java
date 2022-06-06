package C3.Q4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {
     
	
	
	  public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter username");
		String userName=scanner.nextLine();
		
		
		System.out.println("Enter Password");
		String password=scanner.next();
		
		
		System.out.println("Enter mobile number");
		String mobileNumber=scanner.next();
		
		
		System.out.println("Enter Email");
		String email=scanner.next();
		
		Boolean nBoolean=Pattern.matches("[a-zA-Z\\s]{3,8}", userName);
		Boolean pBoolean=Pattern.matches("[a-zA-Z0-9]{3,8}", password);
		Boolean mBoolean=Pattern.matches("[6789]{1}[0-9]{9}", mobileNumber);
	
		 
		if(nBoolean==false) {
			System.out.println("Enter Valid Name");
		}
		if(pBoolean==false) {
			System.out.println("Enter valid password");
		}
		if(mBoolean==false) {
			System.out.println("Enter Valid Mobile Number");
		}
			
		
		if(nBoolean==true || pBoolean==true  || mBoolean==true) {
			Customer customer=new Customer();
			customer.setUserName(userName);
			customer.setPassword(password);
			customer.setMobileNumber(mobileNumber);
			customer.setEmail(email);
			
			System.out.println("User name is "+customer.getUserName());
			System.out.println("Password is "+customer.getPassword());
			System.out.println("Mobile Number is "+customer.getMobileNumber());
			System.out.println("Email id is "+customer.getEmail());
		}
		
		
		
	}
}
