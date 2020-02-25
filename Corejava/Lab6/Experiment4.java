package Lab6;

import java.util.Scanner;

public class Experiment4 {
	public static String alterstring(String s) {
		int t;
		char arr[]=s.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
		if(arr[i]=='a'||arr[i]=='A'||arr[i]=='e'||arr[i]=='E'||arr[i]=='i'||arr[i]=='I'||arr[i]=='o'||arr[i]=='O'||arr[i]=='u'||arr[i]=='U')
		continue;
		else
		{
		arr[i]=(char)((int)arr[i]+1);
		}
		}

		String str=new String(arr);
		return str;
		}
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s,m;
		System.out.println("enter the String");
		s=sc.next();
		m=alterstring(s);
		System.out.println(m);
		}
}
