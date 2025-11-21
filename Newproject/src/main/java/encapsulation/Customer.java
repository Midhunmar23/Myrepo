package encapsulation;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) 
	
	{
		
		Scanner sc= new Scanner(System.in);
		
		Bank valdpin=new Bank();
		
		System.out.println("Enter number");
		int pinuser=sc.nextInt();
		
		valdpin.setpin(pinuser);
		valdpin.vlidatepin();
		

	}

}
