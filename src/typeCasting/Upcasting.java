package typeCasting;

public class Upcasting {

	public static void main(String[] args) {

		/** The process of storing a 
		    child class object intoa parent class reference type. 
		**/
		
		// Upcasted
		
		Parentclass parent = new Childclass();
		
		System.out.println(parent.fatherName); // "Vijay"
		System.out.println(parent.motherName); // "Tara"
		System.out.println(parent.surName); // "Datey"
		String fullFatherName = parent.fullFatherName();
		System.out.println(fullFatherName);
		parent.fullMotherName();
		
		// we are accessing a Parentclass method and variables but we not able to access a Childclass...
		// for that we need to do a downcasting.............
	}

}
