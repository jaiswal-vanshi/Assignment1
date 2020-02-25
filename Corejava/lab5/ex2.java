package lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class ex2 {
	static ArrayList<Integer> ar=new ArrayList<Integer>();
	
	public static int fab(int n)
	{ int i=0,sum=0;
       while(i!=n-1)
       {
    	   sum=0;
    	  sum=ar.get(i)+ar.get(i+1);
    	  ar.add(i+2, sum);
    	  i++;
    	  
       }
       return ar.get(n-1);
        			
	}

	public static int fab2(int n)
	{
		
		   if (n <= 1) 
		      return n; 
		   return fab2(n-1) + fab2(n-2); 
		} 
		
	
	public static void main(String[] args) {
		/*The Fibonacci sequence is defined by the following rule. The first 2 values in the sequence are 1, 1. 
		 * Every subsequent value is the sum of the 2 values preceding it. 
		 * Write a Java program that uses both recursive and nonrecursive functions to print the nth value of the Fibonacci sequence?*/

		System.out.println(" n = ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=0,k=0,j=1;
		ar.add(1);
		ar.add(1);

        if(n==1 || n==2)
        	System.out.println(1);
        else
        	 n1=fab(n);
        System.out.println("By non recursive method"+" "+n1);
        
       System.out.println("By recursive method" +" "+ fab2(n));
			}

}
