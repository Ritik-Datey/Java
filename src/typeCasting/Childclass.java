package typeCasting;

public class Childclass extends Parentclass {
	
	String childName = "Ritik";
	
	void fullName() {
		System.out.println(childName + " "  + super.fatherName + " " + super.surName);
	}
	

}
