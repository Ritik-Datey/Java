package collection.set;

import java.util.TreeSet;

public class TreeSetClass {
	
	public static void main(String[] arge) {
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		// Add
		set.add(6);
		set.add(2);
		set.add(4);
		set.add(1);
		set.add(3);
		set.add(5);
		set.add(4); // duplicate are not allowed
		
		System.out.println(set);
		
		// to return first element....
		System.out.println("First element of treeset : " + set.first());
		
		// to return last elements....
		System.out.println("First element of treeset : " + set.last());
		
		// to return a value greater than perticular number
		System.out.println("Greater than or eaual to 4 : " + set.tailSet(4));
		
		// to return a value lesser than perticular number
		System.out.println("lesser than or eaual to 4 : " + set.headSet(4));
		
		// To return a value in between
		System.out.println(" Value in between 2 - 6 : " + set.subSet(2, 6));
		
		
		
		
	}

}
