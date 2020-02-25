package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {

	public void getSorted() {
		
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[3];
		for(Integer i:a) {
			a[i]=sc.nextInt();
		}
		String str=Arrays.toString(a);
		
		System.out.println(str);
	
	}
}
