package lab7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ex8 {
	public static  Integer[]  modifyArray(Integer ar[])
	{
		 
		HashSet<Integer> s= new HashSet<>(Arrays.asList(ar));
		Integer ar1[]=new Integer[s.size()];
		Arrays.sort(s.toArray(ar1));
		return ar1;
	}
	public static void main(String[] args) {
	Integer[]ar= {1,3,2,4,4,5,6,1,3};
	Integer[]ar1=new Integer[ar.length];
		ar1=modifyArray(ar);
		for(Integer i:ar1)
		System.out.print(i+" ");
	}

}
