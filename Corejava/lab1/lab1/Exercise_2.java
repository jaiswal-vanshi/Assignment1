import java.util.*;
class Exercise_2
{
	static int differ(int n)
	{
		int s=0,t=0,s2;
		for(int i=1;i<=n;i++)
		{
			s=s+i;
		}
		s2=s*s;
		int s1=0;
		for(int j=1;j<=n;j++)
		{
			s1=s1+(j*j);
		}
		int d=s1-s2;
		return d;

	}
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int x=differ(n);
		System.out.println(x);
	}
}
