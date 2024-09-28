package exception_handling;

import java.util.Scanner;

public class BookYourVehicle {
	
	public static void payment(double km, double rate , String vehicle) {
		
	     double amount = km * rate;
	     System.out.println("- Your Payble amount is : " + amount + " rs");
	     
	     Scanner sc=new Scanner(System.in);
	     
	     for(;;)
			{    
				System.out.println("- Enter your payment : ");
				double payment=sc.nextDouble();
				
					if(payment<amount)
					{
					 //  throw new MoneyLessException("You entered less amount");
						try
						{
					        throw new MoneyLessException("You entered less amount");
						}
						catch(MoneyLessException e)
						{
							//System.out.println(e);//if we are calling directly then the exception is solved but it will not show the msg directly
							System.out.println(e.msg);
						}
						
					}
					else if(payment>amount)
					{
						System.out.println("Payment Successful.");
						System.out.println();
						System.out.println("Your "+ vehicle +" is Booked ");
						System.out.println("You pay extra ammount here is your change : " + (payment-amount));
						System.out.println();
						System.out.println("Thanks For Visiting On BOOK_YOUR_VEHICLE");
						System.out.println("Have a Good Day");
						System.exit(0);
					}
					else if(payment== amount)
					{
						System.out.println("Payment Successful.");
						System.out.println();
						System.out.println("Your " + vehicle + " is Booked  'Thank You' ");
						System.out.println();
						System.out.println("Thanks For Visiting On BOOK_YOUR_VEHICLE");
						System.out.println("Have a Good Day");
						System.exit(0);	
					}
			}
		
	}

	public static void main(String[] args) throws IllegalInputArgument, MoneyLessException {

		System.out.println(" *** Welcome to BOOK_YOUR_VEHICLE *** ");
		System.out.println("Select Vehicle Type");
		System.out.println(" 1. Car ");
		System.out.println(" 2. Bus ");
		System.out.println("Enter 1 or 2 : ");
		
		Scanner sc=new Scanner(System.in);
		
		
		for(;;) {
			
			int vahicleType = sc.nextInt();switch (vahicleType) {
			case 1: {
				System.out.println("Select the car");
				System.out.println(" 1. Innova (6/7-Seater) : Rate - 14rs \n 2. Ertiga (7-Seater) : Rate - 13.5rs \n 3. Swift Dzire (4-Seater) : Rate - 13rs \n 4. Tavera (7-Seater) : Rate - 13rs ");
				System.out.println("Enter 1, 2, 3, or 4 : ");
				
				for(;;) {
					int carInput=sc.nextInt();
					switch(carInput) {
					case 1 : {
						System.out.println("- Innova ");
	                    int rate = 14;
	                    System.out.println("Enter your travelling km / distance");
	                    double km=sc.nextDouble();
	                
	                    payment(km, rate, "Car");
	             
					}
					break;
					case 2 : {
						System.out.println("- Ertiga");
	                    double rate = 13.5;
	                    System.out.println("Enter your travelling km / distance");
	                    double km=sc.nextDouble();
	                
	                    payment(km, rate, "Car");
	                    
					}
					break;
					case 3 : {
						System.out.println("- Swift");
						double rate = 13.0;
	                    System.out.println("Enter your travelling km / distance : ");
	                    double km=sc.nextDouble();
	                
	                    payment(km, rate, "Car");
					}
					break;
					case 4 : {
						System.out.println("- Tavera");
						double rate = 13.0;
	                    System.out.println("Enter your travelling km / distance");
	                    double km=sc.nextDouble();
	                
	                    payment(km, rate, "Car");
					}
					break;
					default:
						
						try{
						throw new IllegalInputArgument("Unexpected value: " + "'" + carInput + "'" + " Choose in between '1','2','3', or '4' ");
						}
						catch(IllegalInputArgument i) {
							System.out.println(i.str);
							System.out.println("Please Enter Correct Input : ");
						}

					}	
				}
			}
			
			case 2: {
				System.out.println("Select the Bus");
				System.out.println(" 1. Mahindra (18-Seater) : Rate - 15rs \n 2. Force (28-Seater) : Rate - 17rs \n 3. Force (32-Seater) : Rate - 18rs \n 4. Eicher (40-Seater) : Rate - 19.5rs \n 5. BharatBenz (52-Seater) : Rate - 20rs ");
				
				for(;;) {
					
					int busInput=sc.nextInt();
					switch(busInput) {
					case 1 : {
						System.out.println("- Mahindra (18-Seater) ");
	                    int rate = 15;
	                    System.out.println("Enter your travelling km / distance");
	                    double km=sc.nextDouble();
	                
	                    payment(km, rate, "Bus");
	             
					}
					break;
					case 2 : {
						System.out.println("- Force (28-Seater)");
	                    double rate = 17;
	                    System.out.println("Enter your travelling km / distance");
	                    double km=sc.nextDouble();
	                
	                    payment(km, rate, "Bus");
	                    
					}
					break;
					case 3 : {
						System.out.println("- Force (32-Seater)");
						double rate = 18;
	                    System.out.println("Enter your travelling km / distance : ");
	                    double km=sc.nextDouble();
	                
	                    payment(km, rate, "Bus");
					}
					break;
					case 4 : {
						System.out.println("- Eicher (40-Seater)");
						double rate = 19.5;
	                    System.out.println("Enter your travelling km / distance");
	                    double km=sc.nextDouble();
	                
	                    payment(km, rate, "Bus");
					}
					break;
					case 5 : {
						System.out.println("- BharatBenz (52-Seater)");
						double rate = 20;
	                    System.out.println("Enter your travelling km / distance");
	                    double km=sc.nextDouble();
	                
	                    payment(km, rate, "Bus");
					}
					break;
					default:
						
						try{
						throw new IllegalInputArgument("Unexpected value: " + "'" + busInput + "'" + " Choose in between '1','2','3', or '4' ");
						}
						catch(IllegalInputArgument i) {
							System.out.println(i.str);
							System.out.println("Please Enter Correct Input : ");
						}

					}	
				}
				
			}
			
			default:
				
				try{
				throw new IllegalInputArgument("Unexpected value: " + "'"+vahicleType+"'"+ " Choose in between '1' or '2' ");
				}
				catch(IllegalInputArgument i) {
					System.out.println(i.str);
					System.out.println("Please Enter Correct Input : ");
				}	
			}
			
		}	
	}
}



