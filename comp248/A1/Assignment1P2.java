// -------------------------------------------------------
// Assignment 1 QUESTION 1
// Written by: Jin Chen 40162195
// For COMP 248 Section RC – Fall 2021
// --------------------------------------------------------

import java.util.Scanner; 
public class Assignment1P2
{
	public static void main(String[] args)
	{
		/*Description of variables and constants
		String A;
		String A2;
		String Firstname;
		String B;
		String B1;
		String B2;
		String Lastname;
		String Address;
		String City;
		String E;
		String Pcode;
		int F;
		int G;
		int H;
		double I;
		double j;
		double a;
		double b;
		double c;
		double d;
		*/
		
		//sector 1
		System.out.println("Welcome to the COVID-19 Report generator:");
		System.out.println("-----------------------------------------------------------");
		System.out.println("Please enter the client Info:");
		System.out.println("          ");
		Scanner keyboard = new Scanner(System.in);
		//block 1--information of receipt receiver
		System.out.print("First Name? ");
		String A = keyboard.next();
		String A1 = A.substring(0,1);//First letter
		String A2 = A.substring(1);//rest of firstname
		String Firstname = A1.toUpperCase() + A2.toLowerCase();
		System.out.print("Last Name? ");
		String B = keyboard.next();
		String B1 = B.substring(0,1);//First letter
		String B2 = B.substring(1);//rest of Lastname
		String Lastname = B1.toUpperCase() + B2.toLowerCase();
		//
	    System.out.print("Address ? ");
	    String Address = keyboard.next();
	    Address += keyboard.nextLine();
	    System.out.print("City ? ");
	    String City = keyboard.next();
	    City += keyboard.nextLine();
	    System.out.print("Postal Code ? ");//upper case letters
		String E = keyboard.nextLine();
		String Pcode = E.toUpperCase();
		//block 2
        System.out.println("\nPlease enter the delivery info:");
		System.out.print("\nDay Of delivery(between 1 and 31) ? ");
		int F = keyboard.nextInt();
	    System.out.print("Month of delivery(between 1 and 12) ? ");
		int G = keyboard.nextInt();
	    System.out.print("Year of delivery(between 2020 and 2021) ? ");
		int H = keyboard.nextInt();
		System.out.print("Distance from source to destination in kilometers ? ");
		double I = keyboard.nextDouble();
		System.out.print("Value of the goods ? ");
		double J = keyboard.nextDouble();
	    //generation-receipt 1
		System.out.println("_______________________________________________________________________");
        System.out.println("               Montreal Delivery Express     "+F+"/"+G+"/"+H); 
		System.out.println("  ");
		System.out.println("   ");
		System.out.println(Firstname+" "+Lastname);//name
		System.out.println(Address);//street address
		System.out.println(City+",QC,"+Pcode);//city+province+zip code
		System.out.println("_______________________________________________________________________");
		
		
		//Description of the algorithm
		double a = 0.55*I;//DELIVERY FEE FOR THE ITEMS.
		double b = (J+a);//Sum of items value and delivery fee.
		double c = 0.05*b;//TPS tax for the items.
		double d = 0.09975*b;//TVQ tax for the items.
		System.out.println("   ");
		System.out.printf("Sub-total"+"%10.2f $",J);
		System.out.printf("\nDelivery Fees (55 Cents * "+I+"KM)"+"%10.2f $",a);//for ordering uses
		System.out.print("\nTPS   No 12345 6789 RT0001 - 5 %");
		System.out.printf("%10.2f $",c);
		System.out.print("\nTVQ   No 1234567890 TQ0020 - 9.975 %");
		System.out.printf("%10.2f $",d);
		System.out.println("\n");
		System.out.printf("Total"+"%10.2f $",(J+a+c+d));
		//At the end of the receipt
		System.out.println("\n_______________________________________________________________________");
		System.out.println("  ");
		System.out.println("Thank you for choosing Montreal Delivery Express.");
		System.out.println("  ");
		System.out.println("Receipt generated successfully.");
		keyboard.close();	
	}
		
} // End of program
