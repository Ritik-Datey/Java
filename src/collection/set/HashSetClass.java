package collection.set;

import java.util.HashSet;

public class HashSetClass {

	public static void main(String[] args) {

		HashSet<Integer> set = new HashSet<Integer>();
		//To add
		set.add(11);
		set.add(22);
		set.add(33);
		set.add(44);
		set.add(44);
		
		System.out.println(set);
		System.out.println();
		
		// To remove 
		set.remove(44);
		System.out.println(set);
		
		
		
	}

}
