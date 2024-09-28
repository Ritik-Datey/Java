package exception_handling;

public class MoneyLessException extends Exception {

	String msg;

	public MoneyLessException(String msg) {
		super();
		this.msg = msg;
	}
}
