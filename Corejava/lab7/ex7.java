package lab7;

import java.util.Arrays;
import java.util.Scanner;

public class ex7 {
	public static int [] getSorted(int ar[])
	{
		String []ar1= new String[ar.length];
		for(int i=0;i<ar.length;i++ ) {
			ar1[i]=String.valueOf(ar[i]);
			StringBuffer sb=new StringBuffer(ar1[i]);
			sb.reverse();
			ar1[i]=sb.toString();
			
		}
		
		for(int i=0;i<ar1.length;i++) {
			ar[i]=Integer.parseInt(ar1[i]);
		}
		Arrays.sort(ar);
		return ar;
	}
	
	

	public static void main(String[] args) {
		int n=0,i=0;
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the size of array");
		n=sc.nextInt();
	int  []	ar = new int[n]; 
	System.out.println("enter the arr elements");
	for(i=0;i<n;i++)
		ar[i]=sc.nextInt();
	for(int k:getSorted( ar))
		System.out.print(k+" ");
	}
	}


