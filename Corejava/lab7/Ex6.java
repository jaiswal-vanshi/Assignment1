package lab7;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Ex6 {
	
	static List<Integer>voterList(HashMap<Integer,LocalDate>hashmap){
		Set<Integer>set1=hashmap.keySet();
		LocalDate ld=null;
		LocalDate date=LocalDate.now();
		List<Integer>list1=new ArrayList<Integer>();
		
		for(Integer integer : set1)
		{
			ld=hashmap.get(integer);
			int year=Period.between(ld, date).getYears();
			if(year>=18)
				list1.add(integer);
		}
		return list1;
		/*
		Calendar cal1=Calendar.getInstance();
		Calendar cal2=Calendar.getInstance();
		
		for(Integer integer:set1) {
			Date date1=hashmap.get(integer);
			cal1.set(date1.getYear()-1900,date1.getMonth(),date1.getDay());
		}
		*/
		
	}

	public static void main(String[] args) {
		HashMap<Integer,LocalDate>hashmap=new HashMap<>();
		hashmap.put(1001,LocalDate.of(2000, 1, 11));
		hashmap.put(1002,LocalDate.of(2001, 1, 11));
		hashmap.put(1003,LocalDate.of(2004, 1, 11));
		hashmap.put(1004,LocalDate.of(2002, 2, 10));
		hashmap.put(1005,LocalDate.of(2002, 1, 3));
		
		
		System.out.println(voterList(hashmap));
		
		

	}

}
