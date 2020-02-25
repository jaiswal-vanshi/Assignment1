package lab7;

import java.util.*;

public class ex {

	public static void main(String[] args) {
		System.out.println("enter");
		Scanner sc= new Scanner(System.in);
		int n1=sc.nextInt();
		for(int i=0;i<n1;i++)
		{
			System.out.println("y");
			int sum=0,num=0,m=0;
			int n2=sc.nextInt();
			while(n2>0)
			{
				System.out.println("in");
			 num=n2;	
			m=n2%10;
			n2=n2/10;
			sum=sum+(m*m*m);
			}
			if(sum==num)
				System.out.println("yes");
			else
				System.out.println("no");
		}
		

	}

}
