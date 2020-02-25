package lab1;

import java.util.Scanner;

public class excersise4 {

	
	static boolean checkNumber(int n)
	{
		while(n!=1)
		{
			if(n%2==0)
			{
				n=n/2;
			}
			else
				return false;
			if(n==1)
				return true;
			
		}
		return false;
	}
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("eneter the number n= ");
		int n= sc.nextInt();
		System.out.println(checkNumber(n));
	}

}
