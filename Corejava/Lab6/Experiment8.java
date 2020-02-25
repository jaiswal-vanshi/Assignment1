package Lab6;

import java.util.Scanner;

public class Experiment8 {
	public static boolean checkpositive(String s)
	{
	int t=0;
	s=s.toLowerCase();
	char a[]=s.toCharArray();
	for(int i=0;i<a.length-1;i++)
	{
	if(a[i]<=a[i+1])
	{

	t++;
	}
	}
	if(t+1==s.length())
	return true;
	else
	return false;
	}
	public static void main(String[] args) {
	String str;
	boolean m;
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the string");
	str=scanner.nextLine();
	m=checkpositive(str);
	if(m==true)
	System.out.println("positive string");
	else
	System.out.println("Negative String");
	}
}
