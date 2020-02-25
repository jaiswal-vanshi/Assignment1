package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class excersise2 {
	
	
	
	public static String [] myMethod(String ar[]) {
		int i=0;
		Arrays.sort(ar);
		for(i=0;i<ar.length;i++)
		{
			if(ar.length%2==0)
			{
			   if(i<=((ar.length/2)-1)) {
				   ar[i]=ar[i].toUpperCase();
			   }
			   else
				  ar[i]= ar[i].toLowerCase();
		}
			else
			{
				if(i<=(int)((ar.length/2)+1)-1) 
					 ar[i]=  ar[i].toUpperCase();
				   else
					  ar[i]= ar[i].toLowerCase();
			}
		
	}
		return ar;
	}

	public static void main(String[] args) {
		int n=0,i=0;
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the size of array");
		n=sc.nextInt();
	String[]	ar = new String[n]; 
	System.out.println("enter the arr elements");
	for(i=0;i<n;i++)
		ar[i]=sc.next();
	for(String str:myMethod( ar))
		System.out.print(str+" ");
	}

	}


