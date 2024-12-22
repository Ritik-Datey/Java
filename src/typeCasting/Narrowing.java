package typeCasting;

public class Narrowing {

	public static void main(String[] args) {
		
		double num1 = 123.345 ;
		System.out.println(num1); // 123.345
		System.out.println(((Object) num1).getClass().getName()); // java.lang.Double
		
		int num2 = (int) num1;
		System.out.println(num2); // 123
		System.out.println(((Object) num2).getClass().getName()); // java.lang.Integer

	}

}
