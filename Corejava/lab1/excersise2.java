package lab1;

import java.util.Scanner;

public class excersise2 {
	static int calculateDifference(int n)
	{
		int i=0,sum1=0,sum2=0;
		for(i=1;i<=n;i++)
		{
			sum1=sum1+(int) Math.pow(i, 2);
			sum2=sum2+i;
		}
		sum2=(int) Math.pow(sum2, 2);
		return Math.abs(sum2-sum1);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("eneter the number n= ");
		int n= sc.nextInt();
		System.out.println(calculateDifference(n));
	}

}
