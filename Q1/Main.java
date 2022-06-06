package C3.Q1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
     
	
	public static void main(String[] args) {
		try {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the number of elements in the array");
			int number=scanner.nextInt();
			int[] arr=new int [number];
	         System.out.println("Enter the elements in the array");
			for(int i=0; i<arr.length; i++) {
				int element=scanner.nextInt();
				arr[i]=element;
			}
			System.out.println("Enter the index of the array element you want to access");
			int index=scanner.nextInt();
			
			System.out.println("The array element at index "+ index + "= "+ arr[index]);
			System.out.println("The array element successfully accessed");
		} catch(ArrayIndexOutOfBoundsException aioobe) {
			
			System.out.println(aioobe);
		}
		catch(InputMismatchException ime) {
			System.out.println(ime);
		}
		catch(NumberFormatException nfe) {
			System.out.println(nfe);	}
//		catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("Other Exception");
//		}
	}
}
