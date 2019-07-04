package javaCodePractice;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HaspMapuse {

	
	public static void main(String[] args) {
		HashMap<String,String> hm= new HashMap<String, String>();
		hm.put("11", "apple");
		hm.put("12", "sambee");
		hm.put("13","bala");
		
		
		System.out.println(hm.containsKey("12"));
		
		System.out.println(hm.containsValue("sambee"));
		
		hm.put("13","bala1");
		
		System.out.println(hm.get("13"));
		
	
		
		
		
	}
}
