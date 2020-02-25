package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {

	public int getSecondSmallestElement(int ar[]) {
		Arrays.sort(ar);
		return ar[1];
	}
	
	public static void main(String args[]) {
		int ar[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
			ar[i]=sc.nextInt();
		Exercise1 obj=new Exercise1();
		int element=obj.getSecondSmallestElement(ar);
		System.out.println(element);
		
	}
}
