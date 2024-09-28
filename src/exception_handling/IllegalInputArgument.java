package exception_handling;

public class IllegalInputArgument extends Exception {
	
	String str;

	public IllegalInputArgument(String str) {
		super();
		this.str = str;
	}
	
}
