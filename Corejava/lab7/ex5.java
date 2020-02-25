package lab7;

import java.util.Scanner;
import java.util.Arrays;

public class ex5 {

	 public static int getSecondSmallest(int ar[])
	 {
		 Arrays.sort(ar);
		 return ar[1];
	 }

	public static void main(String[] args) {
		
				int n=0,i=0;
				Scanner sc=new Scanner(System.in);
				//List<Integer> fruitList = new ArrayList<>();
				System.out.println("enter the size of array");
				n=sc.nextInt();
			int[]	ar = new int[n]; 
			System.out.println("enter the arr elements");
			for(i=0;i<n;i++)
				ar[i]=sc.nextInt();
			System.out.println(getSecondSmallest(ar));
			}

		


	}


