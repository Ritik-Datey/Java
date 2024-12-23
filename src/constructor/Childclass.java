package constructor;

public class Childclass extends ParentClass {

	String name;
	
	Childclass(String name){
		super();
		this.name = name;
		System.out.println("Father's name is (inside constructor): " + father_Name); 
	}
	
	 Childclass(String name, String father_Name, String mother_Name) {
	        super(father_Name, mother_Name);  // Calls the ParentClass constructor
	        this.name = name;
	    }
	
	
	void fullName() {
		System.out.println(name + " "  + super.father_Name + " " + super.surname);
	}
	
}
