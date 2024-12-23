package constructor;

public class ParentClass {
	
	String surname;
	String father_Name;
	String mother_Name;
	
	//No-argument constructor
	ParentClass() {
		surname = "Datey";
	}
	
	// Parameterized constructor
	ParentClass(String father_Name, String mother_Name){
		this();// to call a one constructor of same class from another
		this.father_Name = father_Name; // this refers difference between local and non-static
		this.mother_Name = mother_Name;
	}
	

}
