package lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ex1 {

	public static  ArrayList method(HashMap h)
	{
		
		ArrayList ar=new ArrayList(h.values());
		Collections.sort(ar);
		return ar;
	}
	
	public static void main(String[] args) {
		// Create a method which accepts a hash map and return the values of the map in sorted order as a List.
		
		HashMap h=new HashMap();
		h.put(1, "Shivam");
		h.put(2, "Rahul");
		h.put(3, "Abhi");
		h.put(4, "Shiva");
		 ArrayList ar1=method(h);
		 System.out.println(ar1);

	}

}
