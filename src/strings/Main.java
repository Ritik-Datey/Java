package strings;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String fullName;
		int age;
		String city;
		String state;
		String address;
		double salary;
		long mobileNo;
		
		System.out.println("Enter your Name : ");
		fullName=sc.nextLine();
		System.out.println("Enter your Age : ");
		age=sc.nextInt();
		System.out.println("Enter your City name : ");
		city=sc.next();
		System.out.println("Enter your state : ");
		state=sc.next();
		sc.nextLine();
		System.out.println("Enter your Address : ");
		address=sc.nextLine();
		System.out.println("Enter your Salary : ");
		salary=sc.nextDouble();
		System.out.println("Enter Your Phone Number : ");
		mobileNo=sc.nextLong();
		
		System.out.println(
						"Name : "+fullName+ "\n"+
						"Age : "+age+ "\n"+
						"City : "+city+ "\n"+
						"State : "+state+ "\n"+
						"Address : "+address+ "\n"+
						"Salary : "+salary+ "\n"+
						"Phone Number : "+mobileNo+ "\n"
				); 

	}

	
}

// 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
