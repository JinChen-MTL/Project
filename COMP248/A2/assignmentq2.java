
//------------------------------------------------------------------
//Assignment2-P2
//Written by:jin chen ID 40162195
//For COMP 248 Section R - Fall 2021
//purpose:a program to book a Covid-19 vaccine appointment.
//------------------------------------------------------------------
import java.util.Scanner;

public class assignmentq2 {
	public static void main(String[] args) {
		// description the variable and constants
		int choiceOftimeslot = 0;
		int choiceOflocation = 0;
		int NumberOfshots = 0;
		int NumberofvaxChoice = 0;
		// string variables for summarization uses
		String vaccine = "";
		String location = "";
		String schedule = "";
		String whetherRetry = "";
		String shots = "";

		// greeting part
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("    Welcome  to Covid19 Vaccine Appointment Program!");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Heree is the Covid-19 vaccine menu:");
		System.out.println("   1.Pfizer");
		System.out.println("   2.Moderna");
		System.out.println("   3.AstraZeneca");
		System.out.println("   4.Johnson_Johnson");
		System.out.println("   5.Sinovac");
		System.out.println("   6.Gamaleya");
		System.out.println("   7.Exit");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("");
		Scanner in = new Scanner(System.in);

		// while(true) creates a loop,use break to let the correct statement out of the loop.
		while (true) {
			// select the type of vaccines
			System.out.print("Please enter your choice(1-7): ");
			NumberofvaxChoice = in.nextInt();

			// validate the output
			if (NumberofvaxChoice < 1 || NumberofvaxChoice > 7) {
				System.out.println("\nThat is a wrong input.Please try again!");
				continue;
			}
			// print out result when user choose 1.Pifzer
			else if (NumberofvaxChoice == 1) {
				System.out.println("Your choice is:Pifzer.");
				// Obtain the choosing location
				System.out.println("\nPlease choose the locatioin of vaccine Pifzer :");
				System.out.println("       1 - Pharmaprix");
				System.out.println("       2 - Jean_Coutu");
				// validate the input of location choosing
				while (true) {
					System.out.print("Please enter your choice: ");
					choiceOflocation = in.nextInt();
					if (1 <= choiceOflocation && choiceOflocation <= 2)
						break;
					else
						System.out.println("\nThat is a wrong input. Please try again! ");
				}
				// Obtain the choosing time
				System.out.println("\nPlease choose the time slots : ");
				System.out.println("       1 - 2:00 - 2:15");
				System.out.println("       2 - 2:20 - 2:35");
				System.out.println("       3 - 2:40 - 2:55");
				System.out.println("       4 - 3:00 - 3:15");
				System.out.println("       5 - Quit");
				System.out.print("Please enter your choice (1-5):");
				choiceOftimeslot = in.nextInt();
				// validate the input
				while (choiceOftimeslot < 1 || choiceOftimeslot > 5) {
					System.out.println("\nThat is a wrong input. Please try again! ");
					System.out.print("Please enter your choice (1-5):");
					choiceOftimeslot = in.nextInt();
				}
				// when user types quit
				if (choiceOftimeslot == 5) {
					System.out.println("\nYour appointment is not booked successfully!Would you like to try again?(yes or no)");
					whetherRetry = in.next();
					if (whetherRetry.equals("no")) {
						break;
					} else {
						System.out.println("");
						continue;
					}
				}
				// obtain info of how many doses that user has,and validate the input.
			}

			// print out result when user choose 2.Moderna.
			else if (NumberofvaxChoice == 2) {
				System.out.println("Your choice is:Moderna.");
				// Obtain
				System.out.println("\nPlease choose the locatioin of vaccine Moderna :");
				System.out.println("       1 - Pharmaprix");
				System.out.println("       3 - Jean_Coutu");
				System.out.println("       4 - Health_Center");
				// validate the input
				while (true) {
					System.out.print("Please enter your choice: ");
					choiceOflocation = in.nextInt();
					if (choiceOflocation == 1 || choiceOflocation == 4 || choiceOflocation == 3)
						break;
					else
						System.out.println("\nThat is a wrong input. Please try again! ");
				}
				System.out.println("\nPlease choose the time slots : ");
				System.out.println("       1 - 2:00 - 2:15");
				System.out.println("       2 - 2:20 - 2:35");
				System.out.println("       3 - 2:40 - 2:55");
				System.out.println("       4 - 3:00 - 3:15");
				System.out.println("       5 - Quit");
				System.out.print("Please enter your choice (1-5):");
				choiceOftimeslot = in.nextInt();
				// validate the input of choices for timeslot
				while (choiceOftimeslot < 1 || choiceOftimeslot > 5) {
					System.out.println("\nThat is a wrong input. Please try again! ");
					System.out.print("Please enter your choice (1-5):");
					choiceOftimeslot = in.nextInt();
				}
				// when user types quit
				if (choiceOftimeslot == 5) {
					System.out.println("\nYour appointment is not booked successfully!Would you like to try again?(yes or no)");
					whetherRetry = in.next();
					if (whetherRetry.equals("no")) {
						break;
					} else {
						System.out.println("");
						continue;
					}
				}
			}
			// print out result when user choose 3.AstraZeneca
			else if (NumberofvaxChoice == 3) {
				System.out.println("Your choice is:AstraZeneca.");
				// Obtain the choosing location
				System.out.println("\nPlease choose the location of vaccine AstraZeneca :");
				System.out.println("       2 - Jean_Coutu");
				System.out.println("       3 - Uniprix_Clinique");
				// validate the input of choosing location,and obtain the info of location.
				while (true) {
					System.out.print("Please enter your choice: ");
					choiceOflocation = in.nextInt();
					if (choiceOflocation == 2 || choiceOflocation == 3)
						break;
					else
						System.out.println("\nThat is a wrong input. Please try again! ");
				}
				// obtain info of timeslots
				System.out.println("\nPlease choose the time slots : ");
				System.out.println("       1 - 2:00 - 2:15");
				System.out.println("       2 - 2:20 - 2:35");
				System.out.println("       3 - 2:40 - 2:55");
				System.out.println("       4 - 3:00 - 3:15");
				System.out.println("       5 - Quit");
				System.out.print("Please enter your choice (1-5):");
				choiceOftimeslot = in.nextInt();
				// validate the input of choices for timeslot
				while (choiceOftimeslot < 1 || choiceOftimeslot > 5) {
					System.out.println("\nThat is a wrong input. Please try again! ");
					System.out.print("Please enter your choice (1-5):");
					choiceOftimeslot = in.nextInt();
				}
				// when user types quit
				if (choiceOftimeslot == 5) {
					System.out.println("\nYour appointment is not booked successfully!Would you like to try again?(yes or no)");
					whetherRetry = in.next();
					if (whetherRetry.equals("no")) {
						break;
					} else {
						System.out.println("");
						continue;
					}
				}
			}
			// print out result when user choose 4.Johnso&Johnson
			else if (NumberofvaxChoice == 4) {
				System.out.println("Your choice is:Johnson&Johnson.");
				// Obtain the choosing location
				System.out.println("\nPlease choose the locatioin of vaccine Johnson_Johnson");
				System.out.println("       4 - Health_Center");
				// validate the input of choosing location,and obtain the info of location.
				while (true) {
					System.out.print("Please enter your choice: ");
					choiceOflocation = in.nextInt();
					if (choiceOflocation == 4)
						break;
					else
						System.out.println("\nThat is a wrong input. Please try again! ");
				}
				// obtain info of timeslots
				System.out.println("\nPlease choose the time slots : ");
				System.out.println("       1 - 2:00 - 2:15");
				System.out.println("       2 - 2:20 - 2:35");
				System.out.println("       3 - 2:40 - 2:55");
				System.out.println("       4 - 3:00 - 3:15");
				System.out.println("       5 - Quit");
				System.out.print("Please enter your choice (1-5):");
				choiceOftimeslot = in.nextInt();
				// validate the input of choices for timeslot
				while (choiceOftimeslot < 1 || choiceOftimeslot > 5) {
					System.out.println("\nThat is a wrong input. Please try again! ");
					System.out.print("Please enter your choice (1-5):");
					choiceOftimeslot = in.nextInt();
				}
				// when user types quit
				if (choiceOftimeslot == 5) {
					System.out.println("\nYour appointment is not booked successfully!Would you like to try again?(yes or no)");
					whetherRetry = in.next();
					if (whetherRetry.equals("no")) {
						break;
					} else {
						System.out.println("");
						continue;
					}
				}
			}
			// when choosing 5. Sinovac
			else if (NumberofvaxChoice == 5) {
				System.out.println("Sorry,Sinovac is not available now!");
				System.out.println("Your appointment is not booked successfully!Would you like to try again?(yes or no)");
				whetherRetry = in.next();
				if (whetherRetry.equals("no")) {
					break;
				} else {
					System.out.println("");
					continue;
				}
			}
			// when choosing 6. Gamaleya
			else if (NumberofvaxChoice == 6) {
				System.out.println("Sorry,Gamaleya is not available now!");
				System.out.println("Your appointment is not booked successfully!Would you like to try again?(yes or no)");
				whetherRetry = in.next();
				if (whetherRetry.equals("no")) {
					break;
				} else {
					System.out.println("");
					continue;
				}
			}
			// when choosing 7. Exit
			else if (NumberofvaxChoice == 7) {
				System.out.println("\nYour appointment is not booked successfully!Would you like to try again?(yes or no)");
				whetherRetry = in.next();
				if (whetherRetry.equals("no")) {
					break;
				} else {
					System.out.println("");
					continue;
				}
			}

			// Obtain info of vaccine doses of users,and validate input as well.
			while (true) {
				System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2):");
				NumberOfshots = in.nextInt();
				if (NumberOfshots < 1 || 2 < NumberOfshots)
					System.out.println("\nThat is a wrong input. Please try again! ");
				else
					break;
			}
			// Summarize the information of user's choosing:vaccine type,time slots,location
			// and number of doses.
			switch (NumberofvaxChoice) {
			case 1:
				vaccine = "Pifzer";
				break;
			case 2:
				vaccine = "Moderna";
				break;
			case 3:
				vaccine = "AstraZeneca";
				break;
			case 4:
				vaccine = "Johnson&Johnson";
				break;
			}

			switch (choiceOftimeslot) {
			case 1:
				schedule = "2:00-2:15";
				break;
			case 2:
				schedule = "2:20-2:35";
				break;
			case 3:
				schedule = "2:40-2:55";
				break;
			case 4:
				schedule = "3:00-3:15";
				break;
			}
			switch (choiceOflocation) {
			case 1:
				location = "Pharmaprix.";
				break;
			case 2:
				location = "Jean Coutu.";
				break;
			case 3:
				location = "Uniprix Clinique.";
				break;
			case 4:
				location = "Health Center.";
				break;
			}
			switch (NumberOfshots) {
			case 1:
				shots = ", 1st dose.";
				break;
			case 2:
				shots = ", 2nd dose.";
				break;
			}
			// display the result.
			System.out.println("\nYour booked appointment is:" + vaccine + shots);
			System.out.println("Your schedule is: " + schedule + " @ " + location);
			break;
		}
		// Display a closing message

		System.out.println("\nThank you for using Covid19 Vaccine Appointment Program!");
		in.close();

	}

}