package typeCasting;

public class Downcasting {

	public static void main(String[] args) {
		
		//For performing downcasting it is neccessory to do upcasting........

		/**
		   The process of converting a parent class reference type '
		   into the child class reference....
		**/
		
		// Upcasted
		
		Parentclass parent = new Childclass();
		
		System.out.println(parent.fatherName); // Vijay
		System.out.println(parent.motherName); // Tara
		System.out.println(parent.surName); // Datey
		
		String fullFatherName = parent.fullFatherName();
		System.out.println(fullFatherName); // Vijay Hariram Datey
		
		parent.fullMotherName(); //Tara Vijay Datey

		
		// we are accessing a Parentclass method and variables but we not able to access a Childclass...
		// for that we need to do a downcasting.............
		
		Childclass child = (Childclass) parent;
		System.out.println(child.childName); // Ritik
		
		child.fullName(); //Ritik Vijay Datey
		
		// In above we performed a unsafe typecasting
		
		if(parent instanceof Childclass) {
			
			Childclass child1 = (Childclass) parent;
			System.out.println(child.childName); // Ritik
			
			child1.fullName(); //Ritik Vijay Datey
		}else {
			System.out.println("Child class is not a instance of Parent class");
		}
		
		// In above we performed a safe type casting......
		
	}

}
