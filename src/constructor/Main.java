package constructor;

public class Main {

	public static void main(String[] args) {
		
		ParentClass parent1=new ParentClass();
		System.out.println(parent1.surname); // Datey
		System.out.println(parent1.father_Name); // null
		System.out.println(parent1.mother_Name); // null
		System.out.println();
		
		ParentClass parent2=new ParentClass("Vijay", "Tara");
		System.out.println(parent2.father_Name); // Vijay
		System.out.println(parent2.mother_Name); // Tara
		System.out.println(parent2.surname); // Datey
		System.out.println();

		Childclass child=new Childclass("Ritik");
		System.out.println(child.name); // Ritik
		child.fullName(); // Ritik null Datey --> father_Name is null because it wasn’t initialized in the child class 
						  //					  or via the parent class constructor.

		 Childclass child1 = new Childclass("Ritik", "Vijay", "Tara");
	     child1.fullName();  // Output: Ritik Vijay Datey
		
	}

}
