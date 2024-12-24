package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListClass {

	public static void main(String[] args) {
		
		// Create a ArrayList object
		ArrayList<Object> list = new ArrayList();
		
		// To add data in list
		list.add(1234); //Integer
		list.add(1234.567); // Double
		list.add('a'); // Character
		list.add("Ritik"); //String
	
		System.out.println("Original List : " + list);
		
		ArrayList<String> fruit = new ArrayList<String>();
		fruit.add("Mango");
		fruit.add("Banana");
		fruit.add("Pineapple");
		fruit.add("Apple");
		fruit.add("Orange");
		
		System.out.println("Original Fruit List : " + fruit);
		System.out.println();
		
		//To inser at perticuler index
		list.add(3, true);
		System.out.println(" Added true at index 3 : " + list);
		
		// To get a data from perticular index
		System.out.println(" Data present at index 4 : " + list.get(4));
		
		//To replace a value at specific index then we use set();
		list.set(1, 123.45);
		System.out.println(" To replace a value at specific index (1) : " + list);
		
		//To know the size of list
		System.out.println(" Size : " + list.size());
		
		// To remove from specific index
		list.remove(3);
		System.out.println(" Remove value from index 3 : " + list);
		
		// To remove a data from list by data
		//list.remove('a');...throws exception
		list.remove(Character.valueOf('a'));
		System.out.println(" Remove a data by matching data a : " + list);
		
		// to check weather this object present or not
		System.out.println(" To check list contain Ritik or not : " + list.contains("Ritik"));
		
		//To check list empty or not
		System.out.println(" List empty or not : " + list.isEmpty());
		
		//to iterate value one by one
		
		  Iterator iterator = list.iterator();

	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	       
	       System.out.println();
	     System.out.println(" Forword"); 
	     
	     ListIterator ite = list.listIterator(); 
	     while(ite.hasNext()) {
	    	 System.out.println("  At index " + ite.nextIndex() + " : " +ite.next());
	     }
	     System.out.println();
	     
	     System.out.println(" Reverse Traverse");
	     ListIterator ite1 = list.listIterator(list.size()); 
	     while(ite1.hasPrevious()) {
	    	 
	    	 
	    	 System.out.println("  At index " + ite1.previousIndex() + " : " +ite1.previous());
	     }
	     System.out.println();
	     
	     
	     System.out.println("Forword");
	     //Using for loop
	     for (int i = 0; i<list.size(); i++) {
	    	 System.out.println(list.get(i));
	     }
	     System.out.println();
	     
	     
	     System.out.println("Reverse");
	     // Using for loop reverse
	     for (int i = list.size() - 1; i >= 0; i--) {
	            System.out.println(list.get(i));
	        }
	     System.out.println();
	     
	     
		// To empty or clear list
	     list.clear();
	     System.out.println(" After performing clear : "+ list);
	     
	     // to add one list into another
	     
	     list.addAll(fruit);
	     System.out.println(" We added a fruit list into a list : " + list);

	}

}
