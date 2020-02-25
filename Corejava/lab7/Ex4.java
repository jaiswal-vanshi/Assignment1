package lab7;

import java.util.HashMap;
import java.util.Set;

public class Ex4 {
	
static HashMap<Integer,String>	getStudents(HashMap<Integer,Integer> h1)
{
	HashMap<Integer,String> h2=new HashMap<Integer,String>();
	Set<Integer> s1=h1.keySet();
	for(Integer i: s1)
	{
		Integer j=i;
		Integer k=h1.get(j);
		if(k>=90) 
			h2.put( i, "Gold");
		else if(k>=80 && k<90) 
			h2.put( i, "Silver");
		else if(k>=70 && k<80) 
			h2.put( i, "Bronze");
		}
	
	return h2;
}

	public static void main(String[] args) {
		HashMap<Integer,Integer> h1=new HashMap<Integer,Integer>();
		h1.put(101, 76);
		h1.put(102, 50);
		h1.put(103, 96);
		h1.put(104, 81);
		
		System.out.println(getStudents(h1));
		

	}

}
