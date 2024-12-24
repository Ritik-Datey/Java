package collection.list;

import java.util.ListIterator;
import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {

		Stack<Integer> list = new Stack<Integer>();
		
		// add
		list.push(4);
		list.push(3);
		list.push(44);
		list.push(2);
		list.push(1);
		
		//to peek element
		System.out.println(" To peel the value : " + list.peek());
		
		// To check elelment
		System.out.println(" To search : " + list.search(44));
		
		
	    ListIterator<Integer> iterator = list.listIterator();
	    while(iterator.hasNext()) {
	    	System.out.println(list.pop());
	    }
		
	 // To remove and peek the value
	
		
	}

}
