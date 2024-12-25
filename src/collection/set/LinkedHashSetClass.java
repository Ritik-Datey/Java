package collection.set;

import java.util.LinkedHashSet;

public class LinkedHashSetClass {

	public static void main(String[] args) {

		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		set.add("RITIK");
		set.add(null);
		set.add("Ragna");
		set.add("Ragnar");
		set.add("Tiger");
		set.add(null);
		
		System.out.println("Original set : "+ set);
		
	}

}
