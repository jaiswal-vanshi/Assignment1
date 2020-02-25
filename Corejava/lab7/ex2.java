package lab7;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ex2 {
	public static  void countCharacter(Character ar[])
	{
	 HashMap h=new HashMap();
	 List<Character> unique = Arrays.asList(ar);
	 for (Character i:unique) {
	 
	h.put(i, Collections.frequency(unique, i));
	 }
   	System.out.println(h);
}

	public static void main(String[] args) {
		Character[]ar= {'a','A','a','A','a','z','z'};
		
		   countCharacter(ar);
		
	}

}
