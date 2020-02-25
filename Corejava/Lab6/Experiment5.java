package Lab6;

import java.util.Scanner;

public class Experiment5 {
	
	public int modifyNumber(int number1)
	{
		int i=0,sum=0,sum1=0,number2=0;
		int n1,n2;
		while(number1>0)
		{
			number2=number2*10+number1%10;
			number1=number1/10;
		}
		
		while(number2>0)
		{
			n1=number2%10;
			number2=number2/10;
			n2=number2%10;
			sum=sum*10+Math.abs(n1-n2);
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no.");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Experiment5 exp=new Experiment5();
		int num2=exp.modifyNumber(num);
		System.out.println(num2);
	}

}
