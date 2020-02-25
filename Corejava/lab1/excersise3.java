package lab1;

import java.util.Scanner;

public class excersise3 {
	
	static boolean checkNumber(int n)
	{
		
		int max=n%10,i=0,k=0,n1=0;
		String l=String.valueOf(n);
		while(n!=0)
		{
			n1=n%10;
			n=n/10;
			
			if(max>=n1)
			{
				max=n1;
				k++;
			}
			else
				return false;
			
		}
		if(k==l.length())
			return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("eneter the number n= ");
		int n= sc.nextInt();
		System.out.println(checkNumber(n));

	}

}
