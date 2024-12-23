package method;

public class Method {
	
	public void nonStaticmethod() {
		System.out.println("This is a not Static method");
	}
	
	public static void staticMethod() {
		System.out.println("This is a static Method");
	}

	//Main Class ..... Static method......
	public static void main(String[] args) {

		// we can call a static method directly in main but not a non static
		staticMethod();
		
		// To call a non static mehod in main we have to create an object of class
		Method method=new Method();
		method.nonStaticmethod();
	}

}
