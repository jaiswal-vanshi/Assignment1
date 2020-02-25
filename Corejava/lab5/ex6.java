package lab5;
import java.util.Scanner;
import lab5.com.cg.eis.exception.EmployeeException;
public class ex6 {

	public static void main(String[] args) {
		// Create an Exception class named as “EmployeeException”(User defined Exception) in a package named as “com.cg.eis.exception” 
		//and throw an exception if salary of an employee is below than 3000.
		//Use Exception Handling mechanism to handle exception properly.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  salary");
		int salary=sc.nextInt();
		try {
		if(salary<3000)
			throw new EmployeeException("salary should be above 3000");
		}
		catch(EmployeeException e)
		{
			System.out.println("salary is below 3000 not allowed");
			System.out.println("enter new  salary above 3000");
			int salary1=sc.nextInt();
		}
	}

}

		
		
