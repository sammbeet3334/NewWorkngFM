package javaCodePractice.CollectionsPrac;

import java.util.HashSet;
import java.util.Set;

public class Set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<Integer> se= new HashSet<Integer>();
		
		se.add(3);
		se.add(2);
		se.add(5);
		se.add(1);
		
		
		System.out.println(se.contains(32));
		
		
	}

}
