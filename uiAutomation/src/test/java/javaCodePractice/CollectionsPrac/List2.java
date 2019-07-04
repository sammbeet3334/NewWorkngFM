package javaCodePractice.CollectionsPrac;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class List2 {

	public static void main(String[] args) {

		
		
		List<Integer> li = new ArrayList<Integer>();
		li.add(4);
		li.add(2);
		li.add(6);
		li.add(1);
		
		// sorting of List
		Collections.sort(li);
		System.out.println(li);
		
		// sorting of List reverse order 
		Collections.sort(li, Collections.reverseOrder());
		System.out.println(li);
		
		
		
		// part list position 
		List<Integer> li2= new ArrayList<Integer>();
		//li2.add(4);
		li2.add(2);
		li2.add(1);		
		System.out.println(Collections.indexOfSubList(li, li2));
		
		
		// max value in the list 
		System.out.println(Collections.max(li));
		
		// min value in the list 
		System.out.println(Collections.min(li));
		
		
		// add two list 
		li.addAll(li2);
		System.out.println(li);
		
		li.addAll(2, li);
		System.out.println(li);
		
		
		
		
	}

}
