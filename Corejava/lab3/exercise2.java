package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
	public String getSorted(String str) {
		
		char a[]=str.toCharArray();
		Arrays.sort(a);
		return new String(a);
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
               Exercise2 obj=new Exercise2();
               Scanner sc=new Scanner(System.in);
               String s=sc.next();
               String res1="",res2="";
               String res=obj.getSorted(s);
               for(int i=0;i<res.length()/2;i++) {
            	   res1=res.toUpperCase();
               }
               for(int j=res.length()/2+1;j<res.length();j++) {
            	  res2=res.toLowerCase(); 
               }
               System.out.println(res1+""+res2);
	}

}
