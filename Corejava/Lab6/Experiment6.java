package Lab6;

import java.util.Scanner;

public class Experiment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int chara=0,words=0,line=0;
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==' ')
				words++;
			else if(c[i]=='.')
				line++;
			else
				chara++;
		}
		System.out.println("No. of characters "+chara+" words "+words+" lines "+line);
	}

}
