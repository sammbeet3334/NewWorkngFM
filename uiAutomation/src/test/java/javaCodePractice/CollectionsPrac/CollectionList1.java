package javaCodePractice.CollectionsPrac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CollectionList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> li = new ArrayList<String>();
		li.add("a");
		li.add("b");
		li.add("c");
		li.add("d");

		// add a value to perticular index with out replacing 
		li.add(2, "z");

		
		//  add a value to perticular index  replacing the current value 
		li.set(2, "R");

		System.out.println(li);
		
		// checks for the value is prest or not 
		System.out.println(li.contains("k"));
		
		// returns the index of the element if present 
		System.out.println(li.indexOf("c"));

	}

}
