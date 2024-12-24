package collection.list;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListClass {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(3);
		list.add(5);
		
		System.out.println("Original List : " + list);
		
		//To add a value at first
		list.addFirst(0);
		System.out.println(" We added a value 0 at first : " + list);
		
		// To add at specific index like at 2 and 3
		list.add(2, 2);
		list.add(4, 4);
		System.out.println(" Added value at index 2 nd 4 : " + list);
		
		// to add at last we can use add or addLast as well
		list.addLast(5);
		System.out.println(" We added 5 at last in list : " + list);
		
		// to remove duplicate we can use a HashSet
		
		HashSet<Integer> set = new HashSet<Integer>(list);
		System.out.println("Original List value : " + list);
		System.out.println("Duplicate value is removed : " + set);
		
		//removing duplicate by loop
		System.out.println(list);
		for(int i = 0 ; i<list.size(); i++) {
			for(int j=i+1; j<list.size(); j++) {
				if(list.get(i)==list.get(j)) {
					list.remove(j);
				}
			}
		}
		System.out.println(list);
		
		
	}

}
