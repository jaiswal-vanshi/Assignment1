package lab5;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// Write a Java Program to validate the full name of an employee.
		//Create and throw a user defined exception if firstName and lastName is blank.
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  f_name");
		String name1=sc.next();
		if(name1==" ")
			throw new myException("first name is blank");
		System.out.println("enter l_name ");
		String name2=sc.next();
		
		if(name2==" ")
				throw new myException("last name is blank");
		
			
		
	}

}
class myException extends RuntimeException
{
	public myException(String msg)
	{
		super(msg);
	}
}
