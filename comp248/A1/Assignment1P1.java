// -------------------------------------------------------
// Assignment 1 QUESTION 1
// Written by: Jin Chen ID:40162195
// For COMP 248 Section RC – Fall 2021
// Date 2021-9-29
// Purpose: generates a report of proof of vaccination against COVID-19 for the people who received their dose of vaccination
// --------------------------------------------------------

import java.util.Scanner;  
public class Assignment1P1
{
		
	public static void main(String[] args)
	{
		/*Declaration of variables and constants
		 String A;
		 String Firstname;
		 String B;
		 String Lastname;
		 String i;
		 String j;
		 String Location;
		 String k;
		 int C;
		 int D;
		 int E;
		 int F;
		 int G;
		 int H;
		 */
		
		//sector 1
		System.out.println("Welcome to the COVID-19 Report generator:");
		System.out.println("-----------------------------------------------------------");
		System.out.println("Please enter the client Infor:");
		System.out.println("          ");
		Scanner keyboard = new Scanner(System.in);
		//NAME
		System.out.print("First name ? ");
		String A = keyboard.next();
	    String Firstname = A.substring(0,1).toUpperCase() + A.substring(1).toLowerCase();//automatic change to right format with first letter upper case but other all lower cases
		System.out.print("Last name ? ");
		String B = keyboard.next();
	    String Lastname = B.substring(0,1).toUpperCase() + B.substring(1).toLowerCase();//automatic change to right format with first letter upper case but other all lower cases
		System.out.println("        ");
		//INFO OF BIRTH
        System.out.print("Day of Birth(between 01 and 31) ?             ");
		int C = keyboard.nextInt();
		System.out.print("Month of Birth(between 01 and 12) ?           ");
		int D = keyboard.nextInt();
		System.out.print("Year Of  Birth(between 2019 and 2021) ?       ");
		int E = keyboard.nextInt();
		System.out.println("        ");
		//INFO OF VAX
		System.out.print("Day of vaccination(between 01 and 31) ?       ");
		int F = keyboard.nextInt();
		System.out.print("Month of vaccination(between 01 and 12) ?     ");
		int G = keyboard.nextInt();
		System.out.print("Year Of vaccineation(between 2019 and 2021) ? ");
		int H = keyboard.nextInt();
		System.out.println("        ");
		//block 4
		System.out.print("Name of vaccination (Pfizer,Moderna,AstraZeneca,etc.) ? ");
		String I = keyboard.next();
		System.out.print("Location of the center of the vaccination ?             ");
		String J = keyboard.next();
	    String Location = J.substring(0,1).toUpperCase() + J.substring(1).toLowerCase();//automatic change to right format with first letter upper case but other all lower cases
		System.out.print("Lot of vaccination  ?                                   ");
		String K = keyboard.next();
		K +=keyboard.nextLine();
		//end of filling up questionnaire.
		//sector 2(print out questionnaire)
		System.out.println("______________________________________________________________________________________");
		System.out.println("Health and Social Services                       Proof of vaccination against COVID-19");
		System.out.println(" ");
		System.out.println("User Information");
		System.out.println(" ");
		System.out.println("Name   "+Lastname+","+Firstname);
		System.out.println("DOB    "+C+"/"+D+"/"+E);
		System.out.println("______________________________________________________________________________________");
		//sector 3
		System.out.println(" ");
		System.out.println("Vaccine Administered");
		System.out.println(" ");
		System.out.println("Name       PB COVID-19");
		System.out.println("Code       "+I);
		System.out.println("Lot        "+K);
		System.out.println("Date       "+F+"/"+G+"/"+H);
		System.out.println("Location   "+Location);
		//sector 4
		System.out.println("______________________________________________________________________________________");
		System.out.println(" ");
		System.out.println("Thank you for choosing our services.");
		System.out.println(" ");
		System.out.println("Report generated successfully.");
		keyboard.close();	
	}
		
} // End of program
