package programs;

import java.util.Scanner;

public class Hypotenuse {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in); 
		
		double x;
		double y;
		double z;
		
		System.out.println("Enter X side : ");
		x=sc.nextDouble();
		System.out.println("Enter Y side : ");
		y=sc.nextDouble();
		
		// double result = ((x*x)+(y*y));
		
		
		z=Math.sqrt((x*x)+(y*y));
		//z=Math.hypot(x, y);
		
		System.out.println("Hypotenuse value of "+x+" and "+y+" is : "+z);
	}

}
