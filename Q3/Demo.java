package C3.Q3;


import java.nio.file.DirectoryNotEmptyException;
import java.util.Scanner;

public class Demo {
     
	public void showDetails(Month m){
		if(m.equals(Month.JAN)) {
			System.out.println("This is the 1st Month of the Year January");
		}
		else if(m.equals(Month.FEB)) {
			System.out.println("This is the 2nd Month of the Year February");
		}
		else if(m.equals(Month.MAR)) {
			System.out.println("This is the 3rd Month of the Year March");
		}
		else if(m.equals(Month.APR)) {
			System.out.println("This is the 4th Month of the Year April");
		}
		else if(m.equals(Month.MAY)) {
			System.out.println("This is the 5th Month of the Year May");
		}
		else if(m.equals(Month.JUN)) {
			System.out.println("This is the 6th  Month of the Year June");
		}
		else if(m.equals(Month.JUL)) {
			System.out.println("This is the 7th Month of the Year July");
		}
		else if(m.equals(Month.AUG)) {
			System.out.println("This is the 8th Month of the Year August");
		}
		else if(m.equals(Month.SEP)) {
			System.out.println("This is the 9th Month of the Year September");
		}
		else if(m.equals(Month.OCT)) {
			System.out.println("This is the 10th Month of the Year October");
		}
		else if(m.equals(Month.NOV)) {
			System.out.println("This is the 11th Month of the Year November");
		}
		else if(m.equals(Month.DEC)) {
			System.out.println("This is the 12th Month of the Year December");
		}
		
	}
	
	public static void main(String[] args) {
		try {
			
		
		   Scanner scanner=new Scanner(System.in);
		   System.out.println("Enter Month Name");
		   String monthNameString=scanner.next();
		   Demo d1=new Demo();
		   d1.showDetails(Month.valueOf(monthNameString));
		}
		catch(IllegalArgumentException iae) { 
			System.out.println("Invalid Month Name");
		}
	}
	
}
