package typeCasting;

public class Widening {

	public static void main(String[] args) {

		int num = 10 ; // integer type data
		System.out.println(num); // 10
		System.out.println(((Object) num).getClass().getName());
		
		double num2 = num ; // double type data
		System.out.println(num2); // 10.0
		System.out.println(((Object) num2).getClass().getName());

		
	}

}
