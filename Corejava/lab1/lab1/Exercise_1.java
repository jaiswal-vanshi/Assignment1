import java.util.*;
public class Exercise_1 {
	static int sum(int n)
	{
		int i,sum=0;

		for(i=1;i<=n;i++)
		{
			if(i%5==0 || i%3==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}

	public static void main(String args[])
	{

		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int x=sum(n);
		System.out.println(x);
	}


}
