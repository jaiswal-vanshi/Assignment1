package lab5;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		//Validate the age of a person and display proper message by using user defined exception. Age of a person should be above 15.
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  agr");
		int age=sc.nextInt();
		if(age<=15)
			throw new myException("age should be above 15");
			
	}

}
class myException extends RuntimeException
{
	public myException(String msg)
	{
		super(msg);
	}
}



