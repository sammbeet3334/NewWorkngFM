package javaCodePractice.CollectionsPrac;

import java.util.HashMap;
import java.util.HashSet;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		hm.put(1, 20);
		hm.put(2, 40);
		hm.put(3, 30);
		hm.put(4, 50);
		
		
		
		// returns the value or return the default 
		System.out.println(hm.getOrDefault(2, 100));
		
		// if key is not present hashmap will return null 
		System.out.println(hm.get(33));  // out put is NULL 
		
		hm.containsKey(3);
		
		hm.containsValue(33);
		
	}

}
