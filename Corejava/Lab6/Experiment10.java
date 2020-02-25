package Lab6;

import java.util.Scanner;

public class Experiment10 {
	public static void check(String s)
	{
	int t=0;
	char a[]=s.toCharArray();
	for(int i=0;a[i]!='_';i++)
	{
	t++ ;
	}
	if(t<8)
	System.out.println("invald name");
	else
	System.out.println("valid");
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str;
	System.out.println("Enter the name with _job");
	str=sc.next();
	check(str);
	}
}
