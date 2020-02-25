package lab5;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// Write a Java program that prompts the user for an integer and then prints out all the prime numbers up to that Integer?
		System.out.println(" n = ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int j=0;
		while(n!=0)
		{    j=0;
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
					j++;
			}
			if(j==0 && n!=1) {
				System.out.println(n);
			    n--;}
			else
				n--;
		}

	}

}
