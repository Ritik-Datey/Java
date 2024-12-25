package map.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {

		HashMap map = new HashMap();
		
		// To insert value.
		map.put(101, "Ritik");
		map.put(102, "Kshitij");
		map.put(103, "Manish");
		map.put(104, "Anshul");
		map.put(105, "Ritik");
		
		System.out.println("Original map : " + map); // 101=Ritik, 102=Kshitij, 103=Manish, 104=Anshul, 105=Ritik
		
		//to modified based on key ....
		System.out.println(map.put(105, "Tiger")); // Ritik
		
		System.out.println("Modified map : " + map);
		System.out.println();
		
		// To call only keys
		System.out.println("Keys : " + map.keySet()); // [101, 102, 103, 104, 105]
		Set s=map.keySet();
		System.out.println(s); // [101, 102, 103, 104, 105]
		System.out.println();
		
		// To call only value
		System.out.println("Values : " + map.values());
		Collection c = map.values();
		System.out.println(c);
		System.out.println();
		
		// To call in form of entry...
		System.out.println("Entry : " +  map.entrySet());
		Set s1 = map.entrySet();
		System.out.println(s1);
		System.out.println();
		
		// 
		Iterator iterate = s1.iterator();
		while(iterate.hasNext()) {
			
			Map.Entry e = (Map.Entry) iterate.next();
			
			System.out.println( " key = " + e.getKey() + ", Value = " + e.getValue());
			
			if(e.getKey().equals(101)) {
				
				e.setValue("Monster");
				
			}
		}
		
		System.out.println();
		System.out.println(" You are : " +  map.get(101));
		
		
		
		
	}

}
