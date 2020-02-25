import java.util.Scanner;
public class Exercise_4 {

	public boolean checkNumber(int n){
		 if(n==0)
			 return false;
		 else
		 {
			 while(n!=1) {
				 if(n%2!=0) {
					 return false;
				 }
					 n=n/2;
				 }
			 return true;
		 }
	}
	public static void main(String[] args) {
		Exercise_4 e=new Exercise_4();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean res=e.checkNumber(n);
		System.out.println(res);
	}

}
