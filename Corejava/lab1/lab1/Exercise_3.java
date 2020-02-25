import java.util.Scanner;

public class Exercise_3 {

	public boolean checkNumber(int num) {
		String s=Integer.toString(num);
		char a;
		boolean flag=false;
		for(int i=0;i<s.length()-1;i++)
		{
			a=s.charAt(i);
			if(a>s.charAt(i+1)) {
				flag=true;
				break;
			}
		}
		if(flag==true)
			return false;
		else
			return true;
	}

	public static void main(String args[]) {
		Exercise_3 e=new Exercise_3();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean res=e.checkNumber(n);
		System.out.println(res);
	}



}
