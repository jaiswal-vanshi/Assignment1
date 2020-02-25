package lab7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ex3 {

	public static HashMap getSquares(int[] l1)
	{
		HashMap h1=new HashMap();
		for(int i=0;i<l1.length;i++) {
			h1.put(l1[i], l1[i]*l1[i]);
			
		}
		return h1;
	}
	public static void main(String[] args) {
		int ar[]= {1,5,2,3};
		HashMap h=getSquares(ar);
		System.out.println(h);
		
	}

}
