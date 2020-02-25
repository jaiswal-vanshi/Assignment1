package lab1;

import java.util.Scanner;

public class exercise1 {
	static int calculateSum(int n)
	{
		int i=0,sum=0;
		for(i=1;i<=n;i++) {
			if(i%3==0 || i%5==0) {
				sum=sum+i;
			}
		}
		return sum;
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("eneter the number n= ");
		int n= sc.nextInt();
		System.out.println( exercise1.calculateSum(n));
		
		
		
	}

}
