package Lab6;

import java.util.Scanner;

public class Experiment3 {
	public String getImage(String str)
	{
		StringBuffer buffer=new StringBuffer(str);
		return buffer.reverse().toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);
		Experiment3 exp=new Experiment3();
		String str1=sc.next();
		String str=exp.getImage(str1);
		String str2=str1.concat("|");
		String str3=str2.concat(str);
		System.out.println(str3);
	}

}
