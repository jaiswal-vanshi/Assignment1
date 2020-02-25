package Lab6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Experiment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,i=0;
		Integer arr[]=new Integer[50];
		Scanner sc=new Scanner(System.in);
		StringTokenizer str=new StringTokenizer(sc.nextLine());
		
		StringTokenizer str1=new StringTokenizer(str.toString());
		System.out.println("All integers are ");
		while(str.hasMoreTokens())
		{
			arr[i++]=new Integer(str.nextToken());
		}
		for(int j=0;j<i;j++)
		{
		System.out.println(arr[j]);
		sum=sum+arr[j];
		}
		System.out.println("sum is "+sum);
	}

}
